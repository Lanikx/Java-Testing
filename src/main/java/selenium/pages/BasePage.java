package selenium.pages;

import org.openqa.selenium.WebDriver;

class BasePage
{
    protected final WebDriver driver;

    public BasePage(WebDriver driver, String pageUrl)
    {
        this.driver = driver;
        if (!driver.getCurrentUrl().equals(pageUrl))
        this.driver.get(pageUrl);

    }

    public boolean IsOnPage(String pageUrl)
    {
        return driver.getCurrentUrl().equals(pageUrl);
    }
}
