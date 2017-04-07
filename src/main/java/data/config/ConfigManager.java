package data.config;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Mathias on 07/04/2017.
 */
public class ConfigManager {
    static public Config getConfig() throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader("config.json"));
        Gson gson = new Gson();
        return gson.fromJson(reader, Config.class);
    }
}
