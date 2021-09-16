package selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import selenium.Base;
import selenium.PageProvider;
import selenium.steps.User;

import java.lang.reflect.InvocationTargetException;

public class BaseTest extends Base {

    User user;


    @BeforeAll
    static void setSettings(){
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

    }

    @BeforeEach
    protected void start() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        user = new User(new PageProvider());

    }

    @AfterEach
    protected void finish(){
        user.pageProvider.Quit();
    }
}
