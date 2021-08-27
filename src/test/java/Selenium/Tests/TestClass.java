package Selenium.Tests;


import Selenium.Helpers.InvalidCheck;
import Selenium.Steps.BookStoreSteps;
import Selenium.Steps.LoginPageSteps;
import Selenium.Steps.MainPageSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.platform.commons.annotation.Testable;

@Execution(ExecutionMode.CONCURRENT)
@Testable
public class TestClass extends  BaseTest{

    @Test
    public void MainPageElementsTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToElementsPage();
        assert (provider.getDriver().getCurrentUrl().equals("https://demoqa.com/elements"));
    }

    @Test
    public void MainPageFormsTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToFormsPage();
        assert(provider.driver.getCurrentUrl().equals("https://demoqa.com/forms") );
    }

    @Test
    public void MainPageAlertsFramesWindowsTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToAlertsFramesWindowsPage();
        assert(provider.driver.getCurrentUrl().equals("https://demoqa.com/alertsWindows") );
    }
    @Test
    public void MainPageWidgetsTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToWidgetsPage();
        assert(provider.driver.getCurrentUrl().equals("https://demoqa.com/widgets"));
    }

    @Test
    public void MainPageInteractionsTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToInteractionsPage();
        assert(provider.driver.getCurrentUrl().equals("https://demoqa.com/interaction"));

    }


    @Test
    public void MainPageBookStoreTest()
    {
        MainPageSteps mainSteps = new MainPageSteps(provider.getDriver());
        mainSteps.goToBookStorePage();
        assert(provider.driver.getCurrentUrl().equals("https://demoqa.com/books") );
    }
    @Test
    public void LoginPageNoInputTest()
    {
        MainPageSteps mainPageSteps = new MainPageSteps(provider.getDriver());
        mainPageSteps.goToBookStorePage();
        BookStoreSteps bookStoreSteps = new BookStoreSteps(provider.getDriver());
        bookStoreSteps.goToLoginPage();

        LoginPageSteps steps = new LoginPageSteps(provider.driver);
        steps
                .Login("", "");

        var somethingIsInvalid = InvalidCheck.IsSomethingInvalid(provider.driver);
        assert(somethingIsInvalid);
    }

}
