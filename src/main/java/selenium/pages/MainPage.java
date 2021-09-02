package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends  BasePage{



    public MainPage(WebDriver driver)
    {
        super (driver, "https://demoqa.com/");
    }



    public void ClickElementsButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(0).click();
    }


    public void ClickFormsButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(1).click();
    }

    public void ClickAlertsFrameWindowsButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(2).click();
    }

    public void ClickWidgetsButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(3).click();
    }

    public void ClickInteractionsButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(4).click();
    }

    public void ClickBookStoreButton()
    {
        if (IsOnPage("https://demoqa.com/"))
            driver.findElements(By.xpath("//div[@class = 'category-cards']/div")).get(5).click();
    }


}
