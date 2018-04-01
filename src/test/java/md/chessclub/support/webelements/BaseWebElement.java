package md.chessclub.support.webelements;

import md.chessclub.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseWebElement {
    WebDriver driver = Hooks.driver;

    //    private WebElement inElement;
    private By by;
    private String name;
    private BaseWebElement parent;


    public BaseWebElement(By by, String name, BaseWebElement parent) {
        this.by = by;
        this.name = name;
        this.parent = parent;
    }

    public BaseWebElement element(By by) {
        return new BaseWebElement(by, null, this);
    }


    public WebElement getRawElement() {
        if (this.getParent() != null) {
            return this.getParent().getRawElement().findElement(this.by);
        } else {
            return driver.findElement(by);
        }
    }

    public boolean isDisplayed() {
        return driver.findElement(this.by).isDisplayed();
    }

    public boolean waitTillIsVisible() {
        return this.waitTillIsVisible(Hooks.getDefaultExplicitTimeout());
    }

    public boolean waitTillIsVisible(int timeIsSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeIsSeconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(this.getRawElement()));
        return element != null;
    }


    public BaseWebElement getParent() {
        return parent;
    }
}
