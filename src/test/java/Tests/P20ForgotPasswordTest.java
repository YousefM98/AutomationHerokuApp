package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;


import pages.P20ForgotPasswordPage;




public class P20ForgotPasswordTest extends BaseTest {


    @Epic("Page Twenty Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Verify Forgot Password page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 20, description = "Verify that the Forgot Password page displays the correct header")
    public void verifyForgotPasswordPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickForgotPassword();

        P20ForgotPasswordPage p20ForgotPasswordPage =
                new P20ForgotPasswordPage(driver);

        Assert.assertEquals(
                p20ForgotPasswordPage.getHeaderText(),
                "Forgot Password"
        );
    }


    @Epic("Page Twenty Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Verify email can be entered")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 20, description = "Verify that an email address can be entered in the email field")
    public void verifyEmailCanBeEntered() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickForgotPassword();

        P20ForgotPasswordPage p20ForgotPasswordPage =
                new P20ForgotPasswordPage(driver);

        String email =
                "test@example.com";

        p20ForgotPasswordPage.enterEmail(email);

        Assert.assertEquals(
                p20ForgotPasswordPage.getEmailValue(),
                email
        );
    }


    @Epic("Page Twenty Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Verify email field can be cleared")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 20, description = "Verify that the email field can be cleared")
    public void verifyEmailFieldCanBeCleared() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickForgotPassword();

        P20ForgotPasswordPage p20ForgotPasswordPage =
                new P20ForgotPasswordPage(driver);

        p20ForgotPasswordPage.enterEmail(
                "test@example.com"
        );

        p20ForgotPasswordPage.clearEmail();

        Assert.assertEquals(
                p20ForgotPasswordPage.getEmailValue(),
                ""
        );
    }


    @Epic("Page Twenty Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Verify Retrieve Password button is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 20, description = "Verify that the Retrieve Password button is displayed")
    public void verifyRetrievePasswordButtonIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickForgotPassword();

        P20ForgotPasswordPage p20ForgotPasswordPage =
                new P20ForgotPasswordPage(driver);

        Assert.assertTrue(
                p20ForgotPasswordPage.isRetrievePasswordButtonDisplayed(),
                "Retrieve Password button should be displayed"
        );
    }


    @Epic("Page Twenty Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Verify password retrieval request can be submitted")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 20, description = "Verify that a password retrieval request can be submitted using a valid email format")
    public void verifyPasswordRetrievalRequestCanBeSubmitted() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickForgotPassword();

        P20ForgotPasswordPage p20ForgotPasswordPage =
                new P20ForgotPasswordPage(driver);

        p20ForgotPasswordPage.enterEmail(
                "test@example.com"
        );

        p20ForgotPasswordPage.clickRetrievePassword();

        Assert.assertFalse(
                p20ForgotPasswordPage.getResultMessage().isEmpty(),
                "A result should be displayed after submitting the forgot password form"
        );
    }
}