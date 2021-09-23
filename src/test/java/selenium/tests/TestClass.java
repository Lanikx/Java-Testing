package selenium.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.platform.commons.annotation.Testable;

@Execution(ExecutionMode.CONCURRENT)
@Testable
public class TestClass extends  BaseTest{

    @Test
    public void UserCanGetToElementsPageTest()
    {
        user.atMainPage.goToElementsPage();
        user.atElementsPage.confirmAtElementsPage();
    }

    @Test
    public void UserCanGetToFormsPageTest()
    {
        user.atMainPage.goToFormsPage();
        user.atFormsPage.confirmAtFormsPage();
    }

    @Test
    public void UserCanGetToAlertsFramesWindowsTest()
    {
        user.atMainPage.goToAlertsFramesWindowsPage();
        user.atAlertsFramesPage.confirmAtAlertsFramesPage();
    }
    @Test
    public void UserCanGetToWidgetsTest()
    {
        user.atMainPage.goToWidgetsPage();
        user.atWidgetsPage.confirmAtWidgetsPage();
    }

    @Test
    public void UserCanGetToInteractionsTest()
    {
        user.atMainPage.goToInteractionsPage();
        user.atInteractionsPage.confirmAtInteractionsPage();
    }


    @Test
    public void UserCanGetToBookStoreTest()
    {
        user.atMainPage.goToBookStorePage();
        user.atBookStore.confirmAtBookStorePage();
    }

  @Test
    public void LoginPageLoginWithNoInputTest()
    {
        user.atMainPage.goToBookStorePage();
        user.atBookStore.goToLoginPage();
        user.atLoginPage.Login("","");
        user.atLoginPage.assertLoginFailed();
    }

}
