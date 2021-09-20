package selenium.steps;

import selenium.pages.FormsPage;

public class FormsSteps {

    FormsPage formsPage;

    public FormsSteps(FormsPage formsPage){
        super();
        this.formsPage = formsPage;
    }

    public void Assert(){
        assert formsPage.IsOnPage(formsPage.URL);
    }
}
