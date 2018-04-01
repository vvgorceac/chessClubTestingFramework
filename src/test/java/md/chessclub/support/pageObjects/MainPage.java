package md.chessclub.support.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private static MainPage instance = new MainPage("/");

    private MainPage(String url) {
        this.url = this.getBaseURL() + url;
    }

    public static MainPage getInstance() {
        return instance;
    }

//    public WebElement getTournamentTable(String name, WebDriver driver) {
//        return
//    }
}
