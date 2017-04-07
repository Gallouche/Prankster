package data.email;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by Mathias on 07/04/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;

    public static final Type LIST_TYPE = new TypeToken<ArrayList<Person>>() {
    }.getType();

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static Type getArrayType() {
        return new TypeToken<ArrayList<Person>>() {}.getType();
    }
}
