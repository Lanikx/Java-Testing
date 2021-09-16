package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.helpers.PropReader;

public class LoginPage extends  BasePage
        {

        static String loginPageUrl = PropReader.readLoginUrl();


        @FindBy(id = "userName")
        WebElement userName;

        @FindBy(id = "password")
        WebElement password;

        @FindBy(id ="login")
        WebElement login;


    public LoginPage()
    {
        super ();
    }

            public LoginPage(WebDriver driver)
            {
                super(driver);
            }


    public void enterLoginData(String userName, String password){
        if (IsOnPage(loginPageUrl))
        {
            EnterPassword(password);
            EnterUserName(userName);
        }
    }

    public void EnterPassword(String password){
        if (IsOnPage(loginPageUrl))
        {
            this.password.sendKeys(password);
        }
    }

    public void EnterUserName(String userName){
        if (IsOnPage(loginPageUrl))
        {
            this.userName.sendKeys(userName);
        }
    }


    public void PressLoginButton(){
        if (IsOnPage(loginPageUrl))
        {
            login.click();
        }
    }

}
