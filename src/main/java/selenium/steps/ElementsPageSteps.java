package selenium.steps;

import selenium.pages.ElementsPage;

public class ElementsPageSteps {
    ElementsPage elementsPage;


    public ElementsPageSteps(ElementsPage page) {
        super();
        elementsPage = page;
    }

    public void Assert(){
        assert elementsPage.IsOnPage(elementsPage.getUrl());
    }
}