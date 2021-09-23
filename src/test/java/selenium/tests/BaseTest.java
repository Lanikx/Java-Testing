package selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import selenium.Base;
import selenium.PageProvider;
import selenium.steps.User;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class BaseTest extends Base {

    User user;
    Properties URL;

    @BeforeAll
    static void setSettings(){
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    protected void start() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        user = new User(new PageProvider());

    }

    @AfterEach
    protected void finish(){
        user.pageProvider.quit();

    }
}
