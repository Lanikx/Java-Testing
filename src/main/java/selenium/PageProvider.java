package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.BasePage;
import selenium.pages.MainPage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class PageProvider {

    private WebDriver _driver;
    DriverProvider provider = new DriverProvider();

    public void Quit(){
        _driver.quit();
    }

    public WebDriver setDriver()
    {
        if(_driver == null)
        {
            _driver = new ChromeDriver();
            _driver.get(MainPage.mainPageUrl);
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
