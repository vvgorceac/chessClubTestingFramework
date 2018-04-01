package md.chessclub.support.webelements;

import org.openqa.selenium.By;

public class HeaderComponent extends BaseWebElement {
    private static HeaderComponent instance = new HeaderComponent(By.xpath(".//div[@class=\"navbar navbar-inverse navbar-fixed-top\"]"), "Header Component");

    private HeaderComponent(By locator, String name) {
        super(locator, name, null);
    }

    public static HeaderComponent getInstance() {
        return HeaderComponent.instance;
    }
}
