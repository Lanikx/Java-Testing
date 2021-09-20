package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.junit4.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.platform.commons.annotation.Testable;

@Execution(ExecutionMode.CONCURRENT)
@Testable
public class TestClass extends  BaseTest{

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Elements page")
    public void MainPageElementsTest()
    {
        user.atMainPage.goToElementsPage();
        user.atElementsPage.Assert();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Forms page")
    public void MainPageFormsTest()
    {
        user.atMainPage.goToFormsPage();
        user.atFormsPage.Assert();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Alerts&Frames page")
    public void MainPageAlertsFramesWindowsTest()
    {
        user.atMainPage.goToAlertsFramesWindowsPage();
        user.atAlertsFramesPage.Assert();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Widgets page")
    public void MainPageWidgetsTest()
    {
        user.atMainPage.goToWidgetsPage();
        user.atWidgetsPage.Assert();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Interactions page")
    public void MainPageInteractionsTest()
    {
        user.atMainPage.goToInteractionsPage();
        user.atInteractionsPage.Assert();
    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Move to elements page")
    @Tag("Page movement")
    @Owner("Nikita Lapin")
    @Description("Asserts that user can get to Book store page")
    public void MainPageBookStoreTest()
    {
        user.atMainPage.goToBookStorePage();
        user.atBookStore.Assert();
    }

  @Test
    public void LoginPageNoInputTest()
    {
        user.atMainPage.goToBookStorePage();
        user.atBookStore.goToLoginPage();
        user.atLoginPage.Login("","");
        user.atLoginPage.AssertLoginFailed();
    }

}
