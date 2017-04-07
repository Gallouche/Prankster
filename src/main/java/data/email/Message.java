package data.email;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by Mathias on 07/04/2017.
 */
public class Message {
    private String subject;
    private String content;

    public Message(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public static Type getArrayType() {
        return new TypeToken<ArrayList<Message>>() {}.getType();
    }
}
