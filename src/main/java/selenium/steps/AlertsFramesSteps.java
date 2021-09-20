package selenium.steps;

import selenium.pages.AlertsFramesPage;

public class AlertsFramesSteps {
    AlertsFramesPage alertsFramesPage;

    public AlertsFramesSteps(AlertsFramesPage alertsFramesPage){
        super();
        this.alertsFramesPage = alertsFramesPage;
    }

    public void Assert(){
        assert alertsFramesPage.IsOnPage(alertsFramesPage.URL);
    }
}
