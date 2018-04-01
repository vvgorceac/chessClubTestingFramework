package md.chessclub.support.pageObjects;

import md.chessclub.stepDef.Hooks;
import md.chessclub.support.webelements.HeaderComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    private String baseUrl = Hooks.prop.getProperty("baseURL");
    protected String url;

    private HeaderComponent header = HeaderComponent.getInstance();

    public void navigate(WebDriver driver) {
        logger.info("Navigating to" + this.url);
        driver.get(this.url);
    }

    protected String getBaseURL() {
        return this.baseUrl;
    }

    public void waitPageReady() {
        this.waitPageReady(Hooks.getDefaultExplicitTimeout());
    }

    public void waitPageReady(int timeoutInSeconds) {
        logger.info("Waiting page to load", timeoutInSeconds);
        this.header.waitTillIsVisible(20);
    }

}
