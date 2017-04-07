import com.google.gson.reflect.TypeToken;
import data.*;
import data.config.Config;
import data.config.ConfigManager;
import data.email.Message;
import data.email.Person;
import smtp.SmtpClient;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Prankster {
    public static void main(String[] args) throws Exception {
        // read configs from config file
        Config config = ConfigManager.getConfig();

        SmtpClient client = new SmtpClient(config.getHost(), config.getPort());

        ArrayList<Person> victims = new Parser<Person>(config.getVictimsListPath(), Person.getArrayType()).getList();
        ArrayList<Message> messages = new Parser<Message>(config.getMessagesListPath(), Message.getArrayType()).getList();

        PrankGenerator prank = new PrankGenerator(victims, messages);
        prank.generateCampain(config.getNumberOfGroups());
        prank.sendCampain(client);

    }
}
