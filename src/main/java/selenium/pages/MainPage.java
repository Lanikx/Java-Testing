package selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends  BasePage {

    public static final String URL = "https://demoqa.com/";

    @FindBy(xpath = "//h5[text() = 'Elements']")
    private WebElement elementsButton;

    @FindBy(xpath = "//h5[text() = 'Forms']")
    private WebElement formsButton;
    @FindBy(xpath = "//h5[text() = 'Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsButton;
    @FindBy(xpath = "//h5[text() = 'Widgets']")
    private WebElement widgetsButton;
    @FindBy(xpath = "//h5[text() = 'Interactions']")
    private WebElement interactionButton;
    @FindBy(xpath = "//h5[text() = 'Book Store Application']")
    private WebElement bookStoreButton;


    public MainPage()
    {
        super ();
    }

    public MainPage(WebDriver driver)
    {
        super(driver);

    }

    public void clickElementsButton()
    {
            elementsButton.click();
    }


    public void clickFormsButton()
    {
            formsButton.click();
    }

    public void clickAlertsFrameWindowsButton()
    {
            alertsFrameWindowsButton.click();
    }

    public void clickWidgetsButton()
    {
            widgetsButton.click();
    }

    public void clickInteractionsButton()
    {
            interactionButton.click();
    }

    public void clickBookStoreButton()
    {
            bookStoreButton.click();
    }

    public void scrollPageDown(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
    }

}
