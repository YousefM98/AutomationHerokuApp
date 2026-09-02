package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P20ForgotPasswordPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h2");
    private By emailInputLocator = By.id("email");
    private By retrievePasswordButtonLocator = By.id("form_submit");
    private By resultMessageLocator = By.tagName("h1");


    // -------------------- Constructor --------------------

    public P20ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getEmailInputElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(emailInputLocator)
        );
    }

    private WebElement getRetrievePasswordButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(retrievePasswordButtonLocator)
        );
    }

    private WebElement getResultMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(resultMessageLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Forgot Password page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Forgot Password page header");

        return headerText;
    }

    @Step("Get entered email value")
    public String getEmailValue() {

        String emailValue = getEmailInputElement()
                .getAttribute("value");

        attachScreenshot("Get entered email value");

        return emailValue;
    }

    @Step("Verify Retrieve Password button is displayed")
    public boolean isRetrievePasswordButtonDisplayed() {

        boolean displayed =
                getRetrievePasswordButtonElement().isDisplayed();

        attachScreenshot("Verify Retrieve Password button is displayed");

        return displayed;
    }

    @Step("Get password retrieval result")
    public String getResultMessage() {

        String resultMessage =
                getResultMessageElement().getText();

        attachScreenshot("Get password retrieval result");

        return resultMessage;
    }


    // -------------------- Form Actions --------------------

    @Step("Enter email address")
    public void enterEmail(String email) {

        getEmailInputElement().sendKeys(email);

        attachScreenshot("Enter email address");
    }

    @Step("Clear email field")
    public void clearEmail() {

        getEmailInputElement().clear();

        attachScreenshot("Clear email field");
    }

    @Step("Click Retrieve Password button")
    public void clickRetrievePassword() {

        getRetrievePasswordButtonElement().click();

        attachScreenshot("Click Retrieve Password button");
    }
}