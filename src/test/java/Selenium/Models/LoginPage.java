package Selenium.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends  BasePage
        {

        WebElement userName;
        WebElement password;
        WebElement login;


    public LoginPage(WebDriver driver)
    {
        super (driver, "https://demoqa.com/login");
    }


    public LoginPage enterLoginData(String userName, String password)
        {
        if (IsOnPage("https://demoqa.com/login"))
        {
        EnterPassword(password);
        EnterUserName(userName);
        }
        return this;
        }

    public LoginPage EnterPassword(String password)
        {
        if (IsOnPage("https://demoqa.com/login"))
        {
        this.password = driver.findElement(By.id("password"));
        this.password.sendKeys(password);
        }
        return this;
        }

    public LoginPage EnterUserName(String userName)
        {
        if (IsOnPage("https://demoqa.com/login"))
        {
        this.userName = driver.findElement(By.id("userName"));
        this.userName.sendKeys(userName);
        }
        return this;
        }


    public LoginPage PressLoginButton()
        {
            this.login = driver.findElement(By.id("login"));
            if (IsOnPage("https://demoqa.com/login"))
            {
            login.click();
            }
            return this;
            }

        }
