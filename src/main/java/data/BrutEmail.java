package data;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class BrutEmail {
    String subject;
    String text;

    public BrutEmail(String subject, String text){
        this.subject = subject;
        this.text = text;
    }

    public String getSubject(){
        return subject;
    }

    public String getText(){
        return text;
    }
}
