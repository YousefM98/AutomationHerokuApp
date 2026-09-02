package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P42StatusCodesPage;


public class P42StatusCodesTest extends BaseTest {


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify Status Codes page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that the Status Codes page displays the correct header")
    public void verifyStatusCodesPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        Assert.assertEquals(
                p42StatusCodesPage.getHeaderText(),
                "Status Codes"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify Status Codes page description")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that the Status Codes page description is displayed")
    public void verifyStatusCodesDescription() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        Assert.assertFalse(
                p42StatusCodesPage
                        .getDescriptionText()
                        .isEmpty(),
                "Status Codes description should not be empty"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify all status code links are displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that all available status code links are displayed")
    public void verifyStatusCodeLinksAreDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        Assert.assertTrue(
                p42StatusCodesPage.isStatus200LinkDisplayed(),
                "Status 200 link should be displayed"
        );

        Assert.assertTrue(
                p42StatusCodesPage.isStatus301LinkDisplayed(),
                "Status 301 link should be displayed"
        );

        Assert.assertTrue(
                p42StatusCodesPage.isStatus404LinkDisplayed(),
                "Status 404 link should be displayed"
        );

        Assert.assertTrue(
                p42StatusCodesPage.isStatus500LinkDisplayed(),
                "Status 500 link should be displayed"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify status code 200")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that status code 200 opens the correct page")
    public void verifyStatusCode200() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        p42StatusCodesPage.clickStatus200();

        Assert.assertTrue(
                p42StatusCodesPage
                        .getCurrentPageUrl()
                        .contains("/status_codes/200"),
                "URL should contain /status_codes/200"
        );

        Assert.assertTrue(
                p42StatusCodesPage
                        .getStatusMessageText()
                        .contains("200"),
                "Status message should contain 200"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify status code 301")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that status code 301 opens the correct page")
    public void verifyStatusCode301() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        p42StatusCodesPage.clickStatus301();

        Assert.assertTrue(
                p42StatusCodesPage
                        .getCurrentPageUrl()
                        .contains("/status_codes/301"),
                "URL should contain /status_codes/301"
        );

        Assert.assertTrue(
                p42StatusCodesPage
                        .getStatusMessageText()
                        .contains("301"),
                "Status message should contain 301"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify status code 404")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that status code 404 opens the correct page")
    public void verifyStatusCode404() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        p42StatusCodesPage.clickStatus404();

        Assert.assertTrue(
                p42StatusCodesPage
                        .getCurrentPageUrl()
                        .contains("/status_codes/404"),
                "URL should contain /status_codes/404"
        );

        Assert.assertTrue(
                p42StatusCodesPage
                        .getStatusMessageText()
                        .contains("404"),
                "Status message should contain 404"
        );
    }


    @Epic("Page Forty Two Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Verify status code 500")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 42,
            description = "Verify that status code 500 opens the correct page")
    public void verifyStatusCode500() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickStatusCodes();

        P42StatusCodesPage p42StatusCodesPage =
                new P42StatusCodesPage(driver);

        p42StatusCodesPage.clickStatus500();

        Assert.assertTrue(
                p42StatusCodesPage
                        .getCurrentPageUrl()
                        .contains("/status_codes/500"),
                "URL should contain /status_codes/500"
        );

        Assert.assertTrue(
                p42StatusCodesPage
                        .getStatusMessageText()
                        .contains("500"),
                "Status message should contain 500"
        );
    }
}