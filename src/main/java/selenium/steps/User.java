package selenium.steps;

import selenium.PageProvider;
import selenium.pages.BookStorePage;
import selenium.pages.ElementsPage;
import selenium.pages.LoginPage;
import selenium.pages.MainPage;

import java.lang.reflect.InvocationTargetException;

public class User {
    public BookStoreSteps atBookStore;
    public LoginPageSteps atLoginPage;
    public MainPageSteps atMainPage;
    public ElementsPageSteps atElementsPage;

    public PageProvider pageProvider;

    public User()
    {

    }

    public User(PageProvider pageProvider) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        this.pageProvider = pageProvider;

        atBookStore = new BookStoreSteps(this.pageProvider.<BookStorePage>initPage(BookStorePage.class));
        atLoginPage = new LoginPageSteps(this.pageProvider.<LoginPage>initPage(LoginPage.class));
        atMainPage = new MainPageSteps(this.pageProvider.<MainPage>initPage(MainPage.class));
        atElementsPage = new ElementsPageSteps(this.pageProvider.<ElementsPage>initPage(ElementsPage.class));
    }


}
