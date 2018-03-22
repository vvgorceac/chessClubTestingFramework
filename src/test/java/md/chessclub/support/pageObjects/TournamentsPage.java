package md.chessclub.support.pageObjects;

public class TournamentsPage extends BasePage {
    private static TournamentsPage instance = new TournamentsPage("/Tournaments");

    private TournamentsPage(String url) {
        this.url = this.getBaseURL() + url;
    }

    public static TournamentsPage getInstance() {
        return instance;
    }
}
