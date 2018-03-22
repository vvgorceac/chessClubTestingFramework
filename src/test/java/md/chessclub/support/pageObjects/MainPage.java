package md.chessclub.support.pageObjects;

public class MainPage extends BasePage {
    private static MainPage instance = new MainPage("/");

    private MainPage(String url) {
        this.url = this.getBaseURL() + url;
    }

    public static MainPage getInstance() {
        return instance;
    }
}
