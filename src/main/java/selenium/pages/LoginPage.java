package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends  BasePage
        {

        public final static String URL = "https://demoqa.com/login";


        @FindBy(id = "userName")
        private WebElement userName;

        @FindBy(id = "password")
        private WebElement password;

        @FindBy(id ="login")
        private WebElement login;


    public LoginPage()
    {
        super ();
    }

            public LoginPage(WebDriver webDriver)
            {
                super (webDriver);

            }

    public void EnterPassword(String password){

            this.password.sendKeys(password);

    }

    public void EnterUserName(String userName){
            this.userName.sendKeys(userName);
    }


    public void PressLoginButton(){
            login.click();
    }

    public boolean FailedFieldExists(){
        var wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".form-control.is-invalid, .was-validated .form-control:invalid"))) != null;
    }

}
