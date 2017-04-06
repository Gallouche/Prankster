package data;

import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Group {

    ArrayList<String> rcpts;
    String sender;

    public Group(ArrayList<String> rcpts, String sender){
        this.rcpts = rcpts;
        this.sender = sender;
    }

    public String getSender(){
        return sender;
    }

    public ArrayList<String > getRcpts(){
        return rcpts;
    }
}
