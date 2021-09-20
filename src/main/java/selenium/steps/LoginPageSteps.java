package selenium.steps;

import selenium.pages.LoginPage;

public class LoginPageSteps {


    LoginPage loginPage;

    public LoginPageSteps(LoginPage loginPage)
    {
        super();
        this.loginPage = loginPage;
    }

    public void Login(String login, String password)
    {
        LoginPage loginPage = new LoginPage();
        loginPage.enterLoginData(login, password);
        loginPage.PressLoginButton();

    }

    public void AssertLoginFailed(){
        assert loginPage.FailedFieldExists();
    }



}
