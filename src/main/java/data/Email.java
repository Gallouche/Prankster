package data;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Email {
    Group group;
    BrutEmail email;

    public Email(Group group, BrutEmail email){
        this.group = group;
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public BrutEmail getEmail() {
        return email;
    }
}
