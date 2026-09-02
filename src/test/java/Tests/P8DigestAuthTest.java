package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P8DigestAuthPage;


public class P8DigestAuthTest extends BaseTest {


        @Epic("Page Eight Epic")
        @Feature("Covering Digest Auth Feature")
        @Description("validate Digest Auth Successful Login ,Expected Header text and success message text")
        @Severity(SeverityLevel.CRITICAL)
        @Owner("Yousef Mohsen")
        @Test(groups = "smoke", priority = 9, description = "validate Digest Auth Successful Login ,Expected Header text and success message text")
        public void validateDigestAuthSuccessfulLogin() {
            P0_mainPage p0_mainPage = new P0_mainPage(driver);
            p0_mainPage.clickDigestAuthentication();
           P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
            p8DigestAuthPage.loginWithUsernameAndPassword("admin", "admin");
            Assert.assertTrue(p8DigestAuthPage.isUserLoggedIn(),"User Should be logged in");
            Assert.assertEquals(p8DigestAuthPage.getHeaderText(),"Digest Auth");
            Assert.assertEquals(p8DigestAuthPage.getSuccessMessageText(),"Congratulations! You must have the proper credentials.");
        }

    @Epic("Page Eight Epic")
    @Feature("Covering Digest Auth Feature")
    @Description("validate Failed login with wrong username")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 9, description = "validate Failed login with wrong username")
    public void validateDigestAuthWrongUsername() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
        p8DigestAuthPage.loginWithUsernameAndPassword("wrong", "admin");
        Assert.assertFalse(p8DigestAuthPage.isUserLoggedIn(),"User should not be able to login with wrong username");
    }

    @Epic("Page Eight Epic")
    @Feature("Covering Digest Auth Feature")
    @Description("validate Failed login with wrong Password")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 9, description = "validate Failed login with wrong Password")
    public void validateDigestAuthWrongPassword() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
        p8DigestAuthPage.loginWithUsernameAndPassword("admin", "wrong");
        Assert.assertFalse(p8DigestAuthPage.isUserLoggedIn(),"User should not be able to login with wrong Password");
    }

    @Epic("Page Eight Epic")
    @Feature("Covering Digest Auth Feature")
    @Description("validate Failed login with wrong Credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 9, description = "validate Failed login with wrong Credentials")
    public void validateDigestAuthWrongCredentials() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
        p8DigestAuthPage.loginWithUsernameAndPassword("wrong", "wrong");
        Assert.assertFalse(p8DigestAuthPage.isUserLoggedIn(),"User should not be able to login with wrong Credentials");
    }

    @Epic("Page Eight Epic")
    @Feature("Covering Digest Auth Feature")
    @Description("validate Failed login With empty username field")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 9, description = "validate Failed login With empty username field")
    public void validateDigestAuthWithEmptyUsername() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
        p8DigestAuthPage.loginWithUsernameAndPassword("", "admin");
        Assert.assertFalse(p8DigestAuthPage.isUserLoggedIn(),"User should not be able to login with empty username field");
    }

    @Epic("Page Eight Epic")
    @Feature("Covering Digest Auth Feature")
    @Description("validate Failed login With empty password field")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 9, description = "validate Failed login With empty password field")
    public void validateDigestAuthWithEmptyPassword() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        P8DigestAuthPage p8DigestAuthPage = new P8DigestAuthPage(driver);
        p8DigestAuthPage.loginWithUsernameAndPassword("admin", "");
        Assert.assertFalse(p8DigestAuthPage.isUserLoggedIn(),"User should not be able to login with empty password field");
    }
    }



