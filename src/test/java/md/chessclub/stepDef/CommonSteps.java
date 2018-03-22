package md.chessclub.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import md.chessclub.support.pageObjects.BasePage;
import md.chessclub.support.pageObjects.MainPage;
import md.chessclub.support.pageObjects.TournamentsPage;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    WebDriver driver = Hooks.driver;

    @Given("^I am on the (Main|Tournaments) Page$")
    public void iAmOnTheSomePage(String pageName) {
        BasePage page = null;
        switch (pageName) {
            case "Main":
                page = MainPage.getInstance();
                break;
            case "Tournaments":
                page = TournamentsPage.getInstance();
        }

        page.navigate(driver);
        page.waitPageReady();
    }

    @Then("^I see Current $")
    public void iSeeCurrent() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
