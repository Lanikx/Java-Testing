package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.WidgetsPage;

public class AtWidgetsPage {
    WidgetsPage atPage;

    public AtWidgetsPage(WidgetsPage widgetsPage){
        super();
        this.atPage = widgetsPage;
    }

    @Step
    public void confirmAtWidgetsPage(){
        assert atPage.IsOnPage(atPage.URL);
    }
}
