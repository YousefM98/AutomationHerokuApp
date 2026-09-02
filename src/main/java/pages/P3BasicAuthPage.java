package pages;

import Base.BasePages;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class P3BasicAuthPage extends BasePages {

    // Locates the successful authentication message
    private By welcomeMessage= By.xpath("//*[@id='content']/div/p");

    // Locates the unauthorized message
    private By errorMessageLocator= By.xpath("//body[contains(text(),'Not authorized')]");

    // -------------------- Constructor --------------------
    public P3BasicAuthPage(WebDriver driver) { super(driver); }

    // -------------------- Elements --------------------

    // Waits until the successful authentication message is visible
    private WebElement getWelcomeMessageElement() { return wait.until( ExpectedConditions.visibilityOfElementLocated( welcomeMessage ) ); }

    // Waits until the unauthorized message is visible
    private WebElement getErrorMessageElement() { return wait.until( ExpectedConditions.visibilityOfElementLocated( errorMessageLocator ) ); }

    public String getWelcomeMessageText() { return getWelcomeMessageElement().getText(); }

    // Performs Basic Authentication using valid credentials
    @Step("Login with valid Basic Authentication credentials")
    public void validLogin(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        // Wait until the successful authentication page is displayed
        getWelcomeMessageElement();
        attachScreenshot("Login with valid Basic Authentication credentials");
    }

    // Attempts authentication using an invalid username
    @Step("Login with invalid username")
    public void loginWithInvalidUsername(String username){
        driver.get("https://" + username + ":admin@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login with invalid username");
    }

    // Attempts authentication using an invalid password
    @Step("Login with invalid password")
    public void loginWithInvalidPassword(String Password){ driver.get("https://admin:"+ Password +"@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login with invalid password");}

    // Attempts authentication using invalid username and password
    @Step("Login with invalid credentials")
    public void loginWithInvalidCredentials(String Username,String Password){ driver.get("https://"+ Username +":"+ Password +"@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login with invalid credentials");}

    // Attempts authentication without providing a username
    @Step("Login without username")
    public void loginWithoutUsername(){ driver.get("https://:admin@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login without username"); }

    // Attempts authentication without providing a password
    @Step("Login without password")
    public void loginWithoutPassword(){ driver.get("https://admin:@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login without password");}

    // Attempts authentication with both username and password empty
    @Step("Login with empty username and password")
    public void loginWithEmptyFields(){ driver.get("https://:@the-internet.herokuapp.com/basic_auth");
        attachScreenshot("Login with empty username and password");}

    public boolean isSuccessMessageDisplayed() {
        boolean successMessage = driver.getPageSource().contains("Congratulations");
        return successMessage;
    } }