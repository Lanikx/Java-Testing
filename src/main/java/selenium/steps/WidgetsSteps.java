package selenium.steps;

import selenium.pages.WidgetsPage;

public class WidgetsSteps {
    WidgetsPage widgetsPage;

    public WidgetsSteps(WidgetsPage widgetsPage){
        super();
        this.widgetsPage = widgetsPage;
    }

    public void Assert(){
        assert widgetsPage.IsOnPage(widgetsPage.URL);
    }
}
