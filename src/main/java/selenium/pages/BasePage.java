package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Base;

public class BasePage extends Base
{
    protected String ADCLOSEBUTTONID = "close-fixedban";

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

    protected WebElement GetAdCloseButton(){
        var wait = new WebDriverWait(driver, 3);
        var adCloseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ADCLOSEBUTTONID)));
        return adCloseButton;
    }

    public void CloseAd(){
        GetAdCloseButton().click();
    }
}
