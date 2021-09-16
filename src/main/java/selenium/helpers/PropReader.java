package selenium.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropReader {


    public static String readLoginUrl() {
        try (InputStream input = new FileInputStream("E:\\itech\\Java-Testing\\src\\main\\resources\\URL.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("loginpage.url");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            return null;
    }
}