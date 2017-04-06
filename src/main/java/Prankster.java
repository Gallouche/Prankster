import data.Parser;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Prankster {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> a = new ArrayList<String>();
        a = new Parser("mails.txt").getEmails();
        for (String s: a){
            System.out.println(s);
        }
    }
}
