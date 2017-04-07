package data;

import data.config.ConfigManager;
import data.email.Email;
import data.email.Group;
import data.email.Message;
import data.email.Person;
import smtp.SmtpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Mathias on 07/04/2017.
 */
public class PrankGenerator {

    private Random randomGenerator;
    private ArrayList<Person> victims;
    private ArrayList<Message> messages;
    private Group[] groups;

    public PrankGenerator(ArrayList<Person> victims, ArrayList<Message> messages) {
        randomGenerator = new Random();
        this.victims = victims;
        this.messages = messages;
    }

    public void generateCampain(int numberOfGroups) throws Exception {

        groups = new Group[numberOfGroups];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new Group();
        }

        if(victims.size() / numberOfGroups < 1)
            throw new Exception("Not enough victims in the list to make a good prank lol");

        Collections.shuffle(victims);
        int victimsLeft = victims.size();
        while(victimsLeft > 0) {
            for (int i = 0; i < groups.length; i++){
                groups[i].addPerson(victims.get(victimsLeft - 1));
                victimsLeft--;
            }
        }
    }

    public void sendCampain(SmtpClient client) throws IOException {

        for (Group group: groups) {
            client.sendEmail(new Email(group, messages.get(randomGenerator.nextInt(messages.size()))));
        }
    }

}
