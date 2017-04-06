package smtp;

import data.Email;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class SmtpClient implements ISmtpClient {

    private String host;
    private int port;

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public SmtpClient(String host, int port){
        this.host = host;
        this.port = port;
    }

    @Override
    public void sendEmail(Email email) throws IOException {
        String res = reader.readLine();

        socket = new Socket(host, port);
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

        writer.printf("EHLO localhost\r\n");


        while(res.startsWith("250")){
            res = reader.readLine();
        }

        writer.write("MAIL FROM: ");
        writer.write(email.getGroup().getSender());
        writer.write("\r\n");
        writer.flush();

        res = reader.readLine();
        System.out.println(res);

        for(String recipient : email.getGroup().getRcpts()){
            writer.write("RCPT TO: ");
            writer.write(recipient);
            writer.write("\r\n");
            writer.flush();
        }

        writer.write("DATA");
        writer.write("\r\n");
        writer.flush();

        res = reader.readLine();
        System.out.println(res);

        writer.write("Content-Type: text/plain; charset=\"UTF-8\"\r\n");
        writer.write("FROM:" + email.getGroup().getSender() + "\r\n");

        writer.write("TO:");
        ArrayList<String> recipients = email.getGroup().getRcpts();
        for(int i = 0; i < recipients.size(); i++) {
            writer.write(recipients.get(i) + (i == recipients.size() ? "\r\n" : ","));
        }

        writer.write("SUBJECT:" + email.getEmail().getSubject() + "\r\n");
        writer.flush();

        writer.write(email.getEmail().getText());
        writer.write("\r\n");
        writer.write(".");
        writer.write("\r\n");
        writer.flush();

        writer.write("QUIT\r\n");
        writer.flush();

        writer.close();
        reader.close();
        socket.close();
    }
}
