package selenium.steps;

import selenium.pages.BookStorePage;

public class BookStoreSteps {

    final static String Url = "https://demoqa.com/books";

    BookStorePage bookStorePage;

    public BookStoreSteps(BookStorePage page) {
        super();
        bookStorePage = page;
    }


    public void goToLoginPage(){
        bookStorePage.clickLoginPage();

    }
    public void Assert(){
        assert bookStorePage.IsOnPage(bookStorePage.URL);
    }

}
