package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends  BasePage {

    public static final String URL = "https://demoqa.com/";

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

        if (IsOnPage(URL))
            elementsButton.click();
    }


    public void ClickFormsButton()
    {
        if (IsOnPage(URL))
            formsButton.click();
    }

    public void ClickAlertsFrameWindowsButton()
    {
        if (IsOnPage(URL))
            alertsFrameWindowsButton.click();
    }

    public void ClickWidgetsButton()
    {
        if (IsOnPage(URL))
            widgetsButton.click();
    }

    public void ClickInteractionsButton()
    {
        if (IsOnPage(URL))
            interactionButton.click();
    }

    public void ClickBookStoreButton()
    {
        if (IsOnPage(URL))
            bookStoreButton.click();
    }


}
