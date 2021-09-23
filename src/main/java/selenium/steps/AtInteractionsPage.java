package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.InteractionsPage;

public class AtInteractionsPage {

    InteractionsPage interactionsPage;

    public AtInteractionsPage(InteractionsPage interactionsPage){
        super();
        this.interactionsPage = interactionsPage;
    }

    @Step
    public void confirmAtInteractionsPage(){
        assert interactionsPage.IsOnPage(interactionsPage.URL);
    }
}
