package selenium.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    DriverProvider provider = new DriverProvider();

    @BeforeAll
    static void setSettings(){
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

    }
    @BeforeEach
    protected void start(){
        provider.start();
    }

    @AfterEach
    protected void finish(){
        provider.quit();
    }
}
