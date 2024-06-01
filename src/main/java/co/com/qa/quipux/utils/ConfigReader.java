package co.com.qa.quipux.utils;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ConfigReader {


    private static JSONObject config;

    static {
        try (FileReader reader = new FileReader("src/test/resources/appsettings.json")) {
            JSONParser parser = new JSONParser();
            config = (JSONObject) parser.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static String getSignUpUrl() {
        return config.get("singUpUrl").toString();
    }

    public static String getHomeUrl() {
        return config.get("homePageUrl").toString();
    }

}


