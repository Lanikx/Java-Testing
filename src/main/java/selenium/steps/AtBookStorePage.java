package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.BookStorePage;

public class AtBookStorePage {

    final static String Url = "https://demoqa.com/books";

    BookStorePage atPage;

    public AtBookStorePage(BookStorePage page) {
        super();
        atPage = page;
    }

    @Step
    public void goToLoginPage(){
        atPage.clickLoginPage();

    }

    @Step
    public void confirmAtBookStorePage(){
        assert atPage.IsOnPage(atPage.URL);
    }

}
