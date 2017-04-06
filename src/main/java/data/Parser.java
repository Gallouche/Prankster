package data;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Parser {
    private ArrayList<String> emails;
    Gson jsonMotor;
    

    public Parser(String s){

        jsonMotor = new Gson();
        String json = jsonMotor.toString()
    }
}
