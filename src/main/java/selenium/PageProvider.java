package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.pages.BasePage;
import selenium.pages.MainPage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class PageProvider {

    private WebDriver _driver;


    public void Quit(){
        _driver.quit();
    }

    public WebDriver setDriver()
    {
        if(_driver == null)
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("disable-gpu");
            _driver = new ChromeDriver(options);
            _driver.get(MainPage.URL);
        }
        return _driver;
    }


    public <T extends BasePage> T initPage(Class<T> pageObjectClass) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class[] constructorArgs = new Class[1];
        constructorArgs[0] = WebDriver.class;
        Constructor<? extends BasePage> constructor = pageObjectClass.getConstructor(constructorArgs);


        return (T) constructor.newInstance(setDriver());

    }
}
