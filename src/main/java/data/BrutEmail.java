package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class BrutEmail {
    String subject;
    String text;

    public BrutEmail(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        if(sc.hasNextLine())
            subject = sc.nextLine();

        StringBuilder sb = new StringBuilder(text);
        while (sc.hasNextLine()){
            sb.append(sc.nextLine());
            sb.append('\n');
        }

    }

    public String getSubject(){
        return subject;
    }

    public String getText(){
        return text;
    }
}
