package selenium.pages;

import org.openqa.selenium.WebDriver;

public class WidgetsPage extends BasePage{

    public final static String URL = "https://demoqa.com/widgets";

    public WidgetsPage()
    {
        super ();
    }

    public WidgetsPage(WebDriver driver)
    {
        super(driver);

    }
}
