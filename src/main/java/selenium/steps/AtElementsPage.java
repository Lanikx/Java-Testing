package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.ElementsPage;

public class AtElementsPage {
    ElementsPage atPage;


    public AtElementsPage(ElementsPage page) {
        super();
        atPage = page;
    }

    @Step
    public void confirmAtElementsPage(){
        assert atPage.IsOnPage(atPage.URL);
    }
}