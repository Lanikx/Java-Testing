package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.FormsPage;

public class AtFormsPage {

    FormsPage atPage;

    public AtFormsPage(FormsPage formsPage){
        super();
        this.atPage = formsPage;
    }

    @Step
    public void confirmAtFormsPage(){
        assert atPage.IsOnPage(atPage.URL);
    }
}
