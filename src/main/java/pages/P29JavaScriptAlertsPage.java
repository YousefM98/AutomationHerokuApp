package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P29JavaScriptAlertsPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By javaScriptAlertButtonLocator =
            By.xpath("//button[text()='Click for JS Alert']");

    private By javaScriptConfirmButtonLocator =
            By.xpath("//button[text()='Click for JS Confirm']");

    private By javaScriptPromptButtonLocator =
            By.xpath("//button[text()='Click for JS Prompt']");

    private By resultLocator =
            By.id("result");


    // -------------------- Constructor --------------------

    public P29JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getJavaScriptAlertButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(javaScriptAlertButtonLocator)
        );
    }

    private WebElement getJavaScriptConfirmButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(javaScriptConfirmButtonLocator)
        );
    }

    private WebElement getJavaScriptPromptButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(javaScriptPromptButtonLocator)
        );
    }

    private WebElement getResultElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(resultLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get JavaScript Alerts page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get JavaScript Alerts page header");

        return headerText;
    }

    @Step("Get alert result text")
    public String getResultText() {

        String resultText =
                getResultElement().getText();

        attachScreenshot("Get alert result text");

        return resultText;
    }




    // -------------------- JavaScript Alert Actions --------------------

    @Step("Click JavaScript Alert button")
    public void clickJavaScriptAlertButton() {

        getJavaScriptAlertButtonElement().click();
    }

    @Step("Get JavaScript Alert text")
    public String getAlertText() {

        Alert alert = driver.switchTo().alert();

        return alert.getText();
    }

    @Step("Accept JavaScript Alert")
    public void acceptJavaScriptAlert() {

        Alert alert = driver.switchTo().alert();

        alert.accept();

        attachScreenshot("Accept JavaScript Alert");
    }


// -------------------- JavaScript Confirm Actions --------------------

    @Step("Click JavaScript Confirm button")
    public void clickJavaScriptConfirmButton() {

        getJavaScriptConfirmButtonElement().click();
    }

    @Step("Accept JavaScript Confirm")
    public void acceptJavaScriptConfirm() {

        Alert alert = driver.switchTo().alert();

        alert.accept();

        attachScreenshot("Accept JavaScript Confirm");
    }

    @Step("Dismiss JavaScript Confirm")
    public void dismissJavaScriptConfirm() {

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        attachScreenshot("Dismiss JavaScript Confirm");
    }


// -------------------- JavaScript Prompt Actions --------------------

    @Step("Click JavaScript Prompt button")
    public void clickJavaScriptPromptButton() {

        getJavaScriptPromptButtonElement().click();
    }

    @Step("Enter text in JavaScript Prompt")
    public void enterTextInPrompt(String text) {

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(text);
    }

    @Step("Accept JavaScript Prompt")
    public void acceptJavaScriptPrompt() {

        Alert alert = driver.switchTo().alert();

        alert.accept();

        attachScreenshot("Accept JavaScript Prompt");
    }

    @Step("Dismiss JavaScript Prompt")
    public void dismissJavaScriptPrompt() {

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        attachScreenshot("Dismiss JavaScript Prompt");
    }
}