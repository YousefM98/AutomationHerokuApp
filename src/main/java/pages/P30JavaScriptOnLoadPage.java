package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;


public class P30JavaScriptOnLoadPage extends BasePages {

    // -------------------- Locators --------------------

    private By errorMessageLocator =
            By.tagName("p");


    // -------------------- Constructor --------------------

    public P30JavaScriptOnLoadPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getErrorMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessageLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get JavaScript onload event error message")
    public String getErrorMessageText() {

        String errorMessage =
                getErrorMessageElement().getText();

        attachScreenshot("Get JavaScript onload event error message");

        return errorMessage;
    }

    @Step("Verify JavaScript onload event error message is displayed")
    public boolean isErrorMessageDisplayed() {

        boolean displayed =
                getErrorMessageElement().isDisplayed();

        attachScreenshot("Verify JavaScript onload event error message is displayed");

        return displayed;
    }

    @Step("Get current page URL")
    public String getCurrentPageUrl() {

        String currentUrl =
                driver.getCurrentUrl();

        attachScreenshot("Get current page URL");

        return currentUrl;
    }

    @Step("Get document ready state")
    public String getDocumentReadyState() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        String readyState =
                (String) js.executeScript(
                        "return document.readyState;"
                );

        attachScreenshot("Get document ready state");

        return readyState;
    }
}