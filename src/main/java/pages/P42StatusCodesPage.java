package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class P42StatusCodesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By descriptionLocator =
            By.xpath("//*[@id='content']/div/p");

    private By status200LinkLocator =
            By.linkText("200");

    private By status301LinkLocator =
            By.linkText("301");

    private By status404LinkLocator =
            By.linkText("404");

    private By status500LinkLocator =
            By.linkText("500");

    private By statusMessageLocator =
            By.xpath("//*[@id='content']/div/p");


    // -------------------- Constructor --------------------

    public P42StatusCodesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        headerLocator
                )
        );
    }

    private WebElement getDescriptionElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        descriptionLocator
                )
        );
    }

    private WebElement getStatus200LinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        status200LinkLocator
                )
        );
    }

    private WebElement getStatus301LinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        status301LinkLocator
                )
        );
    }

    private WebElement getStatus404LinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        status404LinkLocator
                )
        );
    }

    private WebElement getStatus500LinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        status500LinkLocator
                )
        );
    }

    private WebElement getStatusMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        statusMessageLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Status Codes page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Status Codes page header"
        );

        return headerText;
    }

    @Step("Get Status Codes page description")
    public String getDescriptionText() {

        String description =
                getDescriptionElement().getText();

        attachScreenshot(
                "Get Status Codes page description"
        );

        return description;
    }

    @Step("Verify status 200 link is displayed")
    public boolean isStatus200LinkDisplayed() {

        boolean displayed =
                getStatus200LinkElement().isDisplayed();

        attachScreenshot(
                "Verify status 200 link is displayed"
        );

        return displayed;
    }

    @Step("Verify status 301 link is displayed")
    public boolean isStatus301LinkDisplayed() {

        boolean displayed =
                getStatus301LinkElement().isDisplayed();

        attachScreenshot(
                "Verify status 301 link is displayed"
        );

        return displayed;
    }

    @Step("Verify status 404 link is displayed")
    public boolean isStatus404LinkDisplayed() {

        boolean displayed =
                getStatus404LinkElement().isDisplayed();

        attachScreenshot(
                "Verify status 404 link is displayed"
        );

        return displayed;
    }

    @Step("Verify status 500 link is displayed")
    public boolean isStatus500LinkDisplayed() {

        boolean displayed =
                getStatus500LinkElement().isDisplayed();

        attachScreenshot(
                "Verify status 500 link is displayed"
        );

        return displayed;
    }

    @Step("Get current page URL")
    public String getCurrentPageUrl() {

        String url =
                driver.getCurrentUrl();

        attachScreenshot(
                "Get current page URL"
        );

        return url;
    }

    @Step("Get status code message")
    public String getStatusMessageText() {

        String message =
                getStatusMessageElement().getText();

        attachScreenshot(
                "Get status code message"
        );

        return message;
    }


    // -------------------- Status Code Actions --------------------

    @Step("Click status code 200")
    public void clickStatus200() {

        getStatus200LinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/status_codes/200"
                )
        );

        attachScreenshot(
                "Click status code 200"
        );
    }

    @Step("Click status code 301")
    public void clickStatus301() {

        getStatus301LinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/status_codes/301"
                )
        );

        attachScreenshot(
                "Click status code 301"
        );
    }

    @Step("Click status code 404")
    public void clickStatus404() {

        getStatus404LinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/status_codes/404"
                )
        );

        attachScreenshot(
                "Click status code 404"
        );
    }

    @Step("Click status code 500")
    public void clickStatus500() {

        getStatus500LinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/status_codes/500"
                )
        );

        attachScreenshot(
                "Click status code 500"
        );
    }
}