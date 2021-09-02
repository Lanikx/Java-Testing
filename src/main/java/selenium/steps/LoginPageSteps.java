package selenium.steps;

import selenium.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
    WebDriver driver;

    public LoginPageSteps(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPageSteps Login(String login, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterLoginData(login, password);
        loginPage.PressLoginButton();
        return  this;
    }



}
