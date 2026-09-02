package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P3BasicAuthPage;

import java.awt.*;

public class P3BasicAuthTest extends BaseTest {
    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Successful login")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Successful login")
    public void validateSuccessfulLogin(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.validLogin();
        Assert.assertEquals(p3BasicAuthPage.getWelcomeMessageText(), "Congratulations! You must have the proper credentials.");
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with wrong username")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed login  with wrong username")
    public void validateFailedLoginWithWrongUsername(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithInvalidUsername("Yousef");
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with wrong Password")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed Login with wrong Password")
    public void validateFailedLoginWithWrongPassword(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithInvalidPassword("Yousef");
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with Invalid credentials")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed Login with Invalid credentials")
    public void validateFailedLoginWithInvalidCredentials(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithInvalidCredentials("Wrong","Wrong");
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with empty username")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed login with empty username")
    public void validateFailedLoginWithoutUsername(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithoutUsername();
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with empty Password")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed login with empty Password")
    public void validateFailedLoginWithoutPassword(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithoutPassword();
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }

    @Epic("Page three Epic")
    @Feature("covering Basic authentication Feature")
    @Description("Validate Failed Login with empty Fields")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 4, description = "Validate Failed login with empty Fields")
    public void validateFailedLoginWithEmptyFields(){
        P3BasicAuthPage p3BasicAuthPage = new P3BasicAuthPage(driver);
        p3BasicAuthPage.loginWithEmptyFields();
        Assert.assertFalse(p3BasicAuthPage.isSuccessMessageDisplayed());
    }


}
