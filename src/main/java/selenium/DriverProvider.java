package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.pages.MainPage;

public class DriverProvider {

    private WebDriver driver;

    public WebDriver getDriver(){
        if(driver == null)
        {
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            //options.addArguments("disable-gpu");

            driver = new ChromeDriver(options);
            driver.get(MainPage.URL);
        }
        return driver;
    }

    public void quit(){
        driver.quit();
    }




}
