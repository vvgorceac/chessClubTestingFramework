package md.chessclub.stepDef;

import cucumber.api.java.en.Then;
import md.chessclub.support.pageObjects.MainPage;
import org.openqa.selenium.WebDriver;

public class MainPageStepsDef {
    WebDriver driver = Hooks.driver;
    MainPage mainPage = MainPage.getInstance()

    @Then("^I see (Current|Future|Completed) table$")
    public void iSeeCurrentTable(String tableName) {
        mainPage.
    }
}
