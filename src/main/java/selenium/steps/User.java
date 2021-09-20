package selenium.steps;

import selenium.PageProvider;
import selenium.pages.*;

import java.lang.reflect.InvocationTargetException;

public class User {
    public BookStoreSteps atBookStore;
    public LoginPageSteps atLoginPage;
    public MainPageSteps atMainPage;
    public ElementsPageSteps atElementsPage;
    public  AlertsFramesSteps atAlertsFramesPage;
    public  FormsSteps atFormsPage;
    public  InteractionsSteps atInteractionsPage;
    public  WidgetsSteps atWidgetsPage;


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
        atAlertsFramesPage = new AlertsFramesSteps(this.pageProvider.<AlertsFramesPage>initPage(AlertsFramesPage.class));
        atFormsPage = new FormsSteps(this.pageProvider.<FormsPage>initPage(FormsPage.class));
        atInteractionsPage = new InteractionsSteps(this.pageProvider.<InteractionsPage>initPage(InteractionsPage.class));
        atWidgetsPage     = new WidgetsSteps(this.pageProvider.<WidgetsPage>initPage(WidgetsPage.class));
    }


}
