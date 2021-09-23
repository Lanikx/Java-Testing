package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.MainPage;


public class AtMainPage {

    MainPage mainpage;

    public AtMainPage(MainPage mainPage){
        super();
        this.mainpage = mainPage;
    }

    @Step
    public void goToElementsPage()
    {
        mainpage.CloseAd();
        mainpage.clickElementsButton();

    }

    @Step
    public void goToFormsPage()
    {
        mainpage.CloseAd();
        mainpage.clickFormsButton();
    }

    @Step
    public void goToAlertsFramesWindowsPage()
    {
        mainpage.CloseAd();
        mainpage.clickAlertsFrameWindowsButton();
    }
    @Step
    public void goToWidgetsPage()
    {
        mainpage.CloseAd();
        mainpage.clickWidgetsButton();
    }
    @Step
    public void goToInteractionsPage()
    {
        mainpage.CloseAd();
        mainpage.clickInteractionsButton();
    }
    @Step
    public void goToBookStorePage()
    {
        mainpage.scrollPageDown();
        mainpage.CloseAd();
        mainpage.clickBookStoreButton();
    }
    @Step
    public void confirmAtMainPage(){
       assert mainpage.IsOnPage(mainpage.URL);
    }
}
