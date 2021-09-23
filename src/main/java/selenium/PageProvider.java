package selenium;


import org.openqa.selenium.WebDriver;
import selenium.pages.BasePage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class PageProvider {

    DriverProvider provider;


    public void quit(){
        provider.quit();
    }

    public WebDriver setDriver()
    {
        if(provider == null)
        {
            provider = new DriverProvider();
        }
        return provider.getDriver();
    }


    public <T extends BasePage> T initPage(Class<T> pageObjectClass) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class[] constructorArgs = new Class[1];
        constructorArgs[0] = WebDriver.class;
        Constructor<? extends BasePage> constructor = pageObjectClass.getConstructor(constructorArgs);


        return (T) constructor.newInstance(setDriver());

    }
}
