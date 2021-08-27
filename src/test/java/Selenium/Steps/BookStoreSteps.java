package Selenium.Steps;

import Selenium.Models.BookStorePage;
import org.openqa.selenium.WebDriver;

public class BookStoreSteps extends  BaseSteps{

    BookStorePage page;

    public BookStoreSteps(WebDriver driver) {
        super(driver);
        page = new BookStorePage(driver);
    }

    public BookStoreSteps goToLoginPage(){
        page.clickLoginPage();
        return this;
    }

}
