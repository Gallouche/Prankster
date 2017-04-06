package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Parser {

    private ArrayList<String> emails;

    public Parser(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        emails = new ArrayList<>();

        while (sc.hasNextLine()){
            emails.add(sc.nextLine());
        }
        sc.close();
    }

    public ArrayList<String> getEmails(){
        return emails;
    }
}
