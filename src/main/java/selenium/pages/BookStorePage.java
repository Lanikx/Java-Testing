package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage extends BasePage{

    public final static String URL = "https://demoqa.com/books";

    public BookStorePage()
    {
        super();
    }

    public BookStorePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//li/span[text() = 'Login']/..")
    WebElement loginButton;

    private final String loginButtonId = "item-0";

    public void clickLoginPage(){
        loginButton.click();

    }


}
