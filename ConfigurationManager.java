package hm4;

import java.util.HashMap;
import java.util.Map;


//singleton class with a single instance
public class ConfigurationManager {
    //we create an instance as private static to ensure that it is single
    private static ConfigurationManager instance;

    //instance variable that stores configuration key-value pairs
    private Map<String, String> map;

    public static ConfigurationManager getInstance() {
        //provides global acces to the single instance
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private ConfigurationManager() {
        //use lazy initialization to create the instance variable only when needed
        map = new HashMap<>();
        allData(); //call the method to show data
    }

    private void allData() {
        //method to store all data
        map.put("maxPlayers", "100");
        map.put("defaultLanguage", "en");
        map.put("gameDifficulty", "medium");
    }
    public String getConfig(String key) {
        //retrieves  the configuration value for a given key
        return map.get(key);
    }
    public void invoke() {
        //a method to print all configuration settings for testing purposes
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
