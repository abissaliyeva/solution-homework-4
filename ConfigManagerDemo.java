package hm4;

//a demo class that retrieves and prints configuration settings
public class ConfigManagerDemo {
    public static void main(String[] args) {
        //create a ConfigurationManager object
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        //retrieve a value with key "maxPlayers"
        System.out.println("maxPlayers: " + configurationManager.getConfig("maxPlayers")  );
        System.out.println(); //new line

        //print all configuration settings
        configurationManager.invoke();
    }
}
