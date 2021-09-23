package selenium.steps;

import io.qameta.allure.Step;
import selenium.pages.AlertsFramesPage;

public class AtAlertsFramesPage {
    AlertsFramesPage atPage;

    public AtAlertsFramesPage(AlertsFramesPage alertsFramesPage){
        super();
        this.atPage = alertsFramesPage;
    }

@Step
    public void confirmAtAlertsFramesPage(){
        assert atPage.IsOnPage(atPage.URL);
    }
}
