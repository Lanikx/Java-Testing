package selenium.steps;

import selenium.pages.MainPage;


public class MainPageSteps {

    MainPage mainpage;

    public MainPageSteps(MainPage mainPage){
        super();
        this.mainpage = mainPage;
    }

    public void goToElementsPage()
    {
        mainpage.ClickElementsButton();
    }


    public void goToFormsPage()
    {
        mainpage.ClickFormsButton();
    }


    public void goToAlertsFramesWindowsPage()
    {
        mainpage.ClickAlertsFrameWindowsButton();
    }

    public void goToWidgetsPage()
    {
        mainpage.ClickWidgetsButton();

    }

    public void goToInteractionsPage()
    {
        mainpage.ClickInteractionsButton();

    }

    public void goToBookStorePage()
    {
        mainpage.ClickBookStoreButton();

    }

    public void Assert(){
       assert mainpage.IsOnPage(mainpage.GetUrl());
    }
}
