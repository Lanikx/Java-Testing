package Selenium.Steps;

import Selenium.Models.MainPage;
import org.openqa.selenium.WebDriver;


public class MainPageSteps extends  BaseSteps{

    MainPage mainpage;


    public MainPageSteps(WebDriver driver){
        super(driver);
        mainpage = new MainPage(this.driver);
    }



    public MainPageSteps goToElementsPage()
    {
        mainpage.ClickElementsButton();
        return  this;
    }


    public MainPageSteps goToFormsPage()
    {
        mainpage.ClickFormsButton();
        return  this;
    }


    public MainPageSteps goToAlertsFramesWindowsPage()
    {
        mainpage.ClickAlertsFrameWindowsButton();
        return  this;
    }

    public MainPageSteps goToWidgetsPage()
    {
        mainpage.ClickWidgetsButton();
        return  this;
    }


    public MainPageSteps goToInteractionsPage()
    {
        mainpage.ClickInteractionsButton();
        return  this;
    }

    public MainPageSteps goToBookStorePage()
    {
        mainpage.ClickBookStoreButton();
        return  this;
    }
}
