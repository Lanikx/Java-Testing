package Selenium.Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class BasePage
{
    protected final WebDriver driver;

    public BasePage(WebDriver driver, String pageUrl)
    {
        this.driver = driver;
        if (!driver.getCurrentUrl().equals(pageUrl))
        this.driver.get(pageUrl);

    }

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    void Click(WebElement elem)
    {
        elem.click();
    }


    public boolean IsOnPage(String pageUrl)
    {
        if (driver.getCurrentUrl().equals(pageUrl) )
            return true;
        return false;
    }
}
