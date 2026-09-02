package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;



import pages.P21FormAuthenticationPage;


public class P21FormAuthenticationTest extends BaseTest {


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify Form Authentication page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that the Form Authentication page displays the correct header")
    public void verifyFormAuthenticationPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        Assert.assertEquals(
                p21FormAuthenticationPage.getHeaderText(),
                "Login Page"
        );
    }


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify successful login with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that the user can login using valid credentials")
    public void verifySuccessfulLogin() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        p21FormAuthenticationPage.login(
                "tomsmith",
                "SuperSecretPassword!"
        );

        Assert.assertEquals(
                p21FormAuthenticationPage.getSecureAreaHeaderText(),
                "Secure Area"
        );

        Assert.assertTrue(
                p21FormAuthenticationPage.getFlashMessage()
                        .contains("You logged into a secure area!"),
                "Successful login message should be displayed"
        );
    }


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify login with invalid username")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that login fails when an invalid username is entered")
    public void verifyLoginWithInvalidUsername() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        p21FormAuthenticationPage.login(
                "invalidUsername",
                "SuperSecretPassword!"
        );

        Assert.assertTrue(
                p21FormAuthenticationPage.getFlashMessage()
                        .contains("Your username is invalid!"),
                "Invalid username message should be displayed"
        );
    }


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify login with invalid password")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that login fails when an invalid password is entered")
    public void verifyLoginWithInvalidPassword() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        p21FormAuthenticationPage.login(
                "tomsmith",
                "invalidPassword"
        );

        Assert.assertTrue(
                p21FormAuthenticationPage.getFlashMessage()
                        .contains("Your password is invalid!"),
                "Invalid password message should be displayed"
        );
    }


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify Logout button is displayed after successful login")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that the Logout button is displayed after successful login")
    public void verifyLogoutButtonIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        p21FormAuthenticationPage.login(
                "tomsmith",
                "SuperSecretPassword!"
        );

        Assert.assertTrue(
                p21FormAuthenticationPage.isLogoutButtonDisplayed(),
                "Logout button should be displayed after successful login"
        );
    }


    @Epic("Page Twenty One Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Verify user can logout after successful login")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 21, description = "Verify that the user can successfully logout")
    public void verifySuccessfulLogout() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFormAuthentication();

        P21FormAuthenticationPage p21FormAuthenticationPage =
                new P21FormAuthenticationPage(driver);

        p21FormAuthenticationPage.login(
                "tomsmith",
                "SuperSecretPassword!"
        );

        p21FormAuthenticationPage.clickLogoutButton();

        Assert.assertEquals(
                p21FormAuthenticationPage.getHeaderText(),
                "Login Page"
        );

        Assert.assertTrue(
                p21FormAuthenticationPage.getFlashMessage()
                        .contains("You logged out of the secure area!"),
                "Successful logout message should be displayed"
        );
    }
}