package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends  BasePage {

    public static final String mainPageUrl = "https://demoqa.com/";

    @FindBy(xpath = "//h5[text() = 'Elements']")
    WebElement elementsButton;

    @FindBy(xpath = "//h5[text() = 'Forms']")
    WebElement formsButton;
    @FindBy(xpath = "//h5[text() = 'Alerts, Frame & Windows']")
    WebElement alertsFrameWindowsButton;
    @FindBy(xpath = "//h5[text() = 'Widgets']")
    WebElement widgetsButton;
    @FindBy(xpath = "//h5[text() = 'Interactions']")
    WebElement interactionButton;
    @FindBy(xpath = "//h5[text() = 'Book Store Application']")
    WebElement bookStoreButton;


    public MainPage()
    {
        super ();
    }

    public MainPage(WebDriver driver)
    {
        super(driver);

    }

    public void ClickElementsButton()
    {

        if (IsOnPage(mainPageUrl))
            elementsButton.click();
    }


    public void ClickFormsButton()
    {
        if (IsOnPage(mainPageUrl))
            formsButton.click();
    }

    public void ClickAlertsFrameWindowsButton()
    {
        if (IsOnPage(mainPageUrl))
            alertsFrameWindowsButton.click();
    }

    public void ClickWidgetsButton()
    {
        if (IsOnPage(mainPageUrl))
            widgetsButton.click();
    }

    public void ClickInteractionsButton()
    {
        if (IsOnPage(mainPageUrl))
            interactionButton.click();
    }

    public void ClickBookStoreButton()
    {
        if (IsOnPage(mainPageUrl))
            bookStoreButton.click();
    }

    public String GetUrl(){
        return mainPageUrl;
    }
}
