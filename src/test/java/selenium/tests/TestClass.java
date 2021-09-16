package selenium.tests;


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
        user.atMainPage.goToElementsPage();
        user.atElementsPage.Assert();
    }

    @Test
    public void MainPageFormsTest()
    {
        user.atMainPage.goToFormsPage();
        assert(provider.getDriver().getCurrentUrl().equals("https://demoqa.com/forms") );
    }

    @Test
    public void MainPageAlertsFramesWindowsTest()
    {
        user.atMainPage.goToAlertsFramesWindowsPage();
        assert(provider.getDriver().getCurrentUrl().equals("https://demoqa.com/alertsWindows") );
    }
    @Test
    public void MainPageWidgetsTest()
    {
        user.atMainPage.goToWidgetsPage();
        assert(provider.getDriver().getCurrentUrl().equals("https://demoqa.com/widgets"));
    }

    @Test
    public void MainPageInteractionsTest()
    {
        user.atMainPage.goToInteractionsPage();
        assert(provider.getDriver().getCurrentUrl().equals("https://demoqa.com/interaction"));

    }


    @Test
    public void MainPageBookStoreTest()
    {
        user.atMainPage.goToBookStorePage();
        assert(provider.getDriver().getCurrentUrl().equals("https://demoqa.com/books") );
    }
  /*  @Test
    public void LoginPageNoInputTest()
    {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.goToBookStorePage();
        BookStoreSteps bookStoreSteps = new BookStoreSteps();
        bookStoreSteps.goToLoginPage();

        LoginPageSteps steps = new LoginPageSteps();
        steps.Login("", "");

        var somethingIsInvalid = InvalidCheck.IsSomethingInvalid(provider.getDriver());
        assert(somethingIsInvalid);
    } */

}
