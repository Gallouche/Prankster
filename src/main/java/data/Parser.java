package data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gallouche on 06/04/2017.
 */
public class Parser<E> {

    private ArrayList<E> list;

    public Parser(String path, Type type) throws FileNotFoundException {
        list = new ArrayList<E>();
        Gson gson = new Gson();

        JsonReader reader = new JsonReader(new FileReader(path));
        list = gson.fromJson(reader, type);
        System.out.println(list);
    }

    public ArrayList<E> getList() {
        return list;
    }
}
