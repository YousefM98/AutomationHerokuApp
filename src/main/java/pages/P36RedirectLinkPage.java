package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P36RedirectLinkPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By hereLinkLocator =
            By.linkText("here");

    private By statusCodesHeaderLocator =
            By.xpath("//*[@id='content']/div/h3");


    // -------------------- Constructor --------------------

    public P36RedirectLinkPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getHereLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(hereLinkLocator)
        );
    }

    private WebElement getStatusCodesHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(statusCodesHeaderLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Redirect Link page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Redirect Link page header");

        return headerText;
    }

    @Step("Verify redirect link is displayed")
    public boolean isRedirectLinkDisplayed() {

        boolean displayed =
                getHereLinkElement().isDisplayed();

        attachScreenshot("Verify redirect link is displayed");

        return displayed;
    }

    @Step("Get redirect link href")
    public String getRedirectLinkHref() {

        String href =
                getHereLinkElement().getAttribute("href");

        attachScreenshot("Get redirect link href");

        return href;
    }

    @Step("Get current page URL")
    public String getCurrentPageUrl() {

        String currentUrl =
                driver.getCurrentUrl();

        attachScreenshot("Get current page URL");

        return currentUrl;
    }

    @Step("Get Status Codes page header")
    public String getStatusCodesHeaderText() {

        String headerText =
                getStatusCodesHeaderElement().getText();

        attachScreenshot("Get Status Codes page header");

        return headerText;
    }


    // -------------------- Redirect Actions --------------------

    @Step("Click redirect link")
    public void clickRedirectLink() {

        getHereLinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/status_codes"
                )
        );

        attachScreenshot("Click redirect link");
    }
}