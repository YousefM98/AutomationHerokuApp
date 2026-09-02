package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class P40SlowResourcesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By descriptionLocator =
            By.xpath("//*[@id='content']/div/p");


    // -------------------- Constructor --------------------

    public P40SlowResourcesPage(WebDriver driver) {
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


    // -------------------- Page Validation --------------------

    @Step("Get Slow Resources page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Slow Resources page header"
        );

        return headerText;
    }

    @Step("Get Slow Resources page description")
    public String getDescriptionText() {

        String description =
                getDescriptionElement().getText();

        attachScreenshot(
                "Get Slow Resources page description"
        );

        return description;
    }

    @Step("Verify Slow Resources description is displayed")
    public boolean isDescriptionDisplayed() {

        boolean displayed =
                getDescriptionElement().isDisplayed();

        attachScreenshot(
                "Verify Slow Resources description is displayed"
        );

        return displayed;
    }

    @Step("Get current page URL")
    public String getCurrentPageUrl() {

        String currentUrl =
                driver.getCurrentUrl();

        attachScreenshot(
                "Get current page URL"
        );

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

        attachScreenshot(
                "Get document ready state"
        );

        return readyState;
    }

    @Step("Verify document is completely loaded")
    public boolean isDocumentCompletelyLoaded() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        boolean loaded =
                wait.until(driver ->
                        js.executeScript(
                                "return document.readyState"
                        ).equals("complete")
                );

        attachScreenshot(
                "Verify document is completely loaded"
        );

        return loaded;
    }
}