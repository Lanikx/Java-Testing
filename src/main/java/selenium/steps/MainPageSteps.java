package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.MainPage;


public class MainPageSteps {

    MainPage mainpage;

    public MainPageSteps(MainPage mainPage){
        super();
        this.mainpage = mainPage;
    }

    @Step
    public void goToElementsPage()
    {
        mainpage.ClickElementsButton();
    }

    @Step
    public void goToFormsPage()
    {
        mainpage.ClickFormsButton();
    }

    @Step
    public void goToAlertsFramesWindowsPage()
    {
        mainpage.ClickAlertsFrameWindowsButton();
    }
    @Step
    public void goToWidgetsPage()
    {
        mainpage.ClickWidgetsButton();

    }
    @Step
    public void goToInteractionsPage()
    {
        mainpage.ClickInteractionsButton();

    }
    @Step
    public void goToBookStorePage()
    {
        mainpage.ClickBookStoreButton();

    }
    @Step
    public void Assert(){
       assert mainpage.IsOnPage(mainpage.URL);
    }
}
