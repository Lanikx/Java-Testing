package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.LoginPage;

public class AtLoginPage {


    LoginPage loginPage;

    public AtLoginPage(LoginPage loginPage)
    {
        super();
        this.loginPage = loginPage;
    }

    @Step
    public void Login(String login, String password)
    {
        loginPage.EnterPassword(password);
        loginPage.EnterUserName(login);
        loginPage.PressLoginButton();

    }

    @Step
    public void assertLoginFailed(){
        assert loginPage.FailedFieldExists();
    }



}
