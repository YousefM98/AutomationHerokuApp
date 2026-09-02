package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.Optional;


public class P8DigestAuthPage extends BasePages { private By successMessageLocator = By.xpath("//*[contains(text(),'Congratulations! You must have the proper credentials.')]");
    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    public P8DigestAuthPage(WebDriver driver) { super(driver); }
    private WebElement getSuccessMessageElement(){ return driver.findElement(successMessageLocator); }
    private WebElement getHeaderElement() { return driver.findElement(headerLocator); }
    public String getHeaderText() { return getHeaderElement().getText(); }
    public String getSuccessMessageText(){ return getSuccessMessageElement().getText(); }
    public void loginWithUsernameAndPassword(String username, String password) { ((HasAuthentication) driver).register(UsernameAndPassword.of(username, password));
        driver.get("https://the-internet.herokuapp.com/digest_auth"); }
    public boolean isUserLoggedIn(){ return !driver.findElements(successMessageLocator).isEmpty(); } }


