package Selenium.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidCheck {
    public static boolean IsSomethingInvalid(WebDriver driver)
    {
        var wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".form-control.is-invalid, .was-validated .form-control:invalid"))) != null;
    }
}
