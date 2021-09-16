package selenium.pages;

import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {
    final static String Url = "https://demoqa.com/elements";

    public ElementsPage()
    {
        super();
    }

    public ElementsPage(WebDriver driver)
    {
        super(driver);
    }

    public String getUrl() {
        return Url;
    }
}
