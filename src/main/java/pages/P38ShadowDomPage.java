package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class P38ShadowDomPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.tagName("h1");

    private By firstShadowHostLocator =
            By.cssSelector("my-paragraph:nth-of-type(1)");

    private By shadowTextLocator =
            By.cssSelector("slot");


    // -------------------- Constructor --------------------

    public P38ShadowDomPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getFirstShadowHostElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        firstShadowHostLocator
                )
        );
    }

    private SearchContext getFirstShadowRoot() {

        return getFirstShadowHostElement()
                .getShadowRoot();
    }


    // -------------------- Page Validation --------------------

    @Step("Get Shadow DOM page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Shadow DOM page header");

        return headerText;
    }

    @Step("Verify first Shadow DOM host is displayed")
    public boolean isFirstShadowHostDisplayed() {

        boolean displayed =
                getFirstShadowHostElement().isDisplayed();

        attachScreenshot("Verify first Shadow DOM host is displayed");

        return displayed;
    }

    @Step("Get first Shadow DOM text")
    public String getFirstShadowText() {

        WebElement shadowHost =
                getFirstShadowHostElement();

        String shadowText =
                shadowHost.findElement(
                        By.cssSelector("[slot='my-text']")
                ).getText();

        attachScreenshot("Get first Shadow DOM text");

        return shadowText;
    }

    @Step("Verify first Shadow Root exists")
    public boolean isFirstShadowRootAvailable() {

        boolean available =
                getFirstShadowRoot() != null;

        attachScreenshot("Verify first Shadow Root exists");

        return available;
    }
}