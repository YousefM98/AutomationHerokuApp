package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P21FormAuthenticationPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h2");
    private By usernameInputLocator = By.id("username");
    private By passwordInputLocator = By.id("password");
    private By loginButtonLocator = By.cssSelector("button[type='submit']");
    private By flashMessageLocator = By.id("flash");
    private By secureAreaHeaderLocator = By.xpath("//*[@id='content']/div/h2");
    private By logoutButtonLocator = By.cssSelector("a[href='/logout']");


    // -------------------- Constructor --------------------

    public P21FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getUsernameInputElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameInputLocator)
        );
    }

    private WebElement getPasswordInputElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordInputLocator)
        );
    }

    private WebElement getLoginButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(loginButtonLocator)
        );
    }

    private WebElement getFlashMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(flashMessageLocator)
        );
    }

    private WebElement getSecureAreaHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(secureAreaHeaderLocator)
        );
    }

    private WebElement getLogoutButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(logoutButtonLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Form Authentication page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Form Authentication page header");

        return headerText;
    }

    @Step("Get login result message")
    public String getFlashMessage() {

        String message = getFlashMessageElement().getText();

        attachScreenshot("Get login result message");

        return message;
    }

    @Step("Get Secure Area page header")
    public String getSecureAreaHeaderText() {

        String headerText = getSecureAreaHeaderElement().getText();

        attachScreenshot("Get Secure Area page header");

        return headerText;
    }

    @Step("Verify Logout button is displayed")
    public boolean isLogoutButtonDisplayed() {

        boolean displayed =
                getLogoutButtonElement().isDisplayed();

        attachScreenshot("Verify Logout button is displayed");

        return displayed;
    }


    // -------------------- Login Actions --------------------

    @Step("Enter username")
    public void enterUsername(String username) {

        getUsernameInputElement().sendKeys(username);

        attachScreenshot("Enter username");
    }

    @Step("Enter password")
    public void enterPassword(String password) {

        getPasswordInputElement().sendKeys(password);

        attachScreenshot("Enter password");
    }

    @Step("Click Login button")
    public void clickLoginButton() {

        getLoginButtonElement().click();

        attachScreenshot("Click Login button");
    }

    @Step("Login with username and password")
    public void login(String username, String password) {

        getUsernameInputElement().sendKeys(username);

        getPasswordInputElement().sendKeys(password);

        getLoginButtonElement().click();

        attachScreenshot("Login with username and password");
    }


    // -------------------- Logout Actions --------------------

    @Step("Click Logout button")
    public void clickLogoutButton() {

        getLogoutButtonElement().click();

        attachScreenshot("Click Logout button");
    }
}