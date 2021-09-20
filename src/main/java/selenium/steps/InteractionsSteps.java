package selenium.steps;

import selenium.pages.InteractionsPage;

public class InteractionsSteps {

    InteractionsPage interactionsPage;

    public InteractionsSteps(InteractionsPage interactionsPage){
        super();
        this.interactionsPage = interactionsPage;
    }
    public void Assert(){
        assert interactionsPage.IsOnPage(interactionsPage.URL);
    }
}
