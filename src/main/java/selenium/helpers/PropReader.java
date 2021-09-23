package selenium.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropReader {



    public static Properties readApiStrings() {
        try (InputStream input = new FileInputStream("./src/main/resources/apistrings.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }


}