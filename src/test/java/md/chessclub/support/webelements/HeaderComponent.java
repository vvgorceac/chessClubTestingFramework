package md.chessclub.support.webelements;

public class HeaderComponent {
    private static HeaderComponent instance = new HeaderComponent();

    public static HeaderComponent getInstance() {
        return HeaderComponent.instance;
    }
}
