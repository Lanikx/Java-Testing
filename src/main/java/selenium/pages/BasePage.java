package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.Base;

public class BasePage extends Base
{

    WebDriver driver;

    public BasePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public BasePage()
    {

    }

    public boolean IsOnPage(String pageUrl)
    {
        return driver.getCurrentUrl().equals(pageUrl);
    }
}
