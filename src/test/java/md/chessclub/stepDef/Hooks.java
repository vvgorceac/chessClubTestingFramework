package md.chessclub.stepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import md.chessclub.config.Configs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);
    private static final int DEFAULT_EXPLICIT_TIMEOUT = 10;
    public static final Properties prop = Configs.getInstance().getProp();
    public static WebDriver driver;

    static {
        //setting poperty for Chrome WebDriver, this property should point on the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    }

    @Before
    public void prepareData() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Configs.getInstance().getGlobalTimeout(), TimeUnit.SECONDS);
    }

    @After
    public void clearData() {
        driver.quit();
    }

    public static int getDefaultExplicitTimeout() {
        return DEFAULT_EXPLICIT_TIMEOUT;
    }
}
