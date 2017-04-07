package data.email;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Email {
    Group group;
    Message message;

    public Email(Group group, Message message) {
        this.group = group;
        this.message = message;
    }

    public Group getGroup() {
        return group;
    }

    public Message getMessage() {
        return message;
    }
}
