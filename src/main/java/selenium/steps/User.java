package selenium.steps;

import selenium.PageProvider;
import selenium.pages.*;

import java.lang.reflect.InvocationTargetException;

public class User {
    public AtBookStorePage atBookStore;
    public AtLoginPage atLoginPage;
    public AtMainPage atMainPage;
    public AtElementsPage atElementsPage;
    public AtAlertsFramesPage atAlertsFramesPage;
    public AtFormsPage atFormsPage;
    public AtInteractionsPage atInteractionsPage;
    public AtWidgetsPage atWidgetsPage;


    public PageProvider pageProvider;

    public User()
    {

    }

    public User(PageProvider pageProvider) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        this.pageProvider = pageProvider;

        atBookStore = new AtBookStorePage(this.pageProvider.<BookStorePage>initPage(BookStorePage.class));
        atLoginPage = new AtLoginPage(this.pageProvider.<LoginPage>initPage(LoginPage.class));
        atMainPage = new AtMainPage(this.pageProvider.<MainPage>initPage(MainPage.class));
        atElementsPage = new AtElementsPage(this.pageProvider.<ElementsPage>initPage(ElementsPage.class));
        atAlertsFramesPage = new AtAlertsFramesPage(this.pageProvider.<AlertsFramesPage>initPage(AlertsFramesPage.class));
        atFormsPage = new AtFormsPage(this.pageProvider.<FormsPage>initPage(FormsPage.class));
        atInteractionsPage = new AtInteractionsPage(this.pageProvider.<InteractionsPage>initPage(InteractionsPage.class));
        atWidgetsPage     = new AtWidgetsPage(this.pageProvider.<WidgetsPage>initPage(WidgetsPage.class));
    }


}
