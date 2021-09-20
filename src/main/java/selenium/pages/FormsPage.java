package selenium.pages;

import org.openqa.selenium.WebDriver;

public class FormsPage extends BasePage{

    public final static String URL = "https://demoqa.com/forms";

    public FormsPage()
    {
        super ();
    }

    public FormsPage(WebDriver driver)
    {
        super(driver);

    }
}
