package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverProvider {
    private static ThreadLocal<WebDriver> _storedDriver = new ThreadLocal<>();

    public WebDriver getDriver(){
        return _storedDriver.get();
    }

    private WebDriver driver;

    public void start()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-gpu");
        _storedDriver.set(new ChromeDriver());
        driver = _storedDriver.get();
    }

    public boolean driverExists(){
        if (driver != null)
            return true;
        return false;
    }

    public void quit()
    {
        driver.quit();
    }
}
