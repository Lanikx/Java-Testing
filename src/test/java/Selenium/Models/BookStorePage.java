package Selenium.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStorePage extends BasePage{

    public BookStorePage(WebDriver driver)
    {
        super (driver, "https://demoqa.com/books");
    }

    private final String loginButtonId = "item-0";

    public BookStorePage clickLoginPage(){
        var button = driver.findElement(By.xpath("//li/span[text() = 'Login']/.."));
        button.click();
        return this;
    }


}
