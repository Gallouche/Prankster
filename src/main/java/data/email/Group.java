package data.email;

import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Group {

    ArrayList<String> rcpts;
    String sender;

    public Group(){
        this.rcpts = new ArrayList<String>();
        this.sender = null;
    }

    public void addPerson(Person person){
        if(sender == null)
            sender = person.getEmail();
        else rcpts.add(person.getEmail());
    }

    public String getSender(){
        return sender;
    }

    public ArrayList<String > getRcpts(){
        return rcpts;
    }
}
