package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;



import pages.P29JavaScriptAlertsPage;
import pages.P30JavaScriptOnLoadPage;


public class P30JavaScriptOnLoadTest extends BaseTest {


    @Epic("Page Thirty Epic")
    @Feature("Covering JavaScript Onload Event Error Feature")
    @Description("Verify JavaScript onload event error message")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 30,
            description = "Verify that the JavaScript onload event error message is displayed")
    public void verifyJavaScriptOnLoadErrorMessage() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptOnload();

        P30JavaScriptOnLoadPage p30JavaScriptOnLoadPage =
                new P30JavaScriptOnLoadPage(driver);

        Assert.assertTrue(
                p30JavaScriptOnLoadPage.isErrorMessageDisplayed(),
                "JavaScript onload error message should be displayed"
        );
    }


    @Epic("Page Thirty Epic")
    @Feature("Covering JavaScript Onload Event Error Feature")
    @Description("Verify JavaScript onload event error message text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 30,
            description = "Verify that the JavaScript onload event error message contains the expected text")
    public void verifyJavaScriptOnLoadErrorMessageText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptOnload();

        P30JavaScriptOnLoadPage p30JavaScriptOnLoadPage =
                new P30JavaScriptOnLoadPage(driver);

        Assert.assertEquals(
                p30JavaScriptOnLoadPage.getErrorMessageText(),
                "This page has a JavaScript error in the onload event. " +
                        "This is often a problem to using normal Javascript injection techniques."
        );
    }


    @Epic("Page Thirty Epic")
    @Feature("Covering JavaScript Onload Event Error Feature")
    @Description("Verify JavaScript error page URL")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 30,
            description = "Verify that navigation opens the JavaScript error page")
    public void verifyJavaScriptErrorPageUrl() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptOnload();

        P30JavaScriptOnLoadPage p30JavaScriptOnLoadPage =
                new P30JavaScriptOnLoadPage(driver);

        Assert.assertTrue(
                p30JavaScriptOnLoadPage.getCurrentPageUrl()
                        .contains("/javascript_error"),
                "URL should contain /javascript_error"
        );
    }


    @Epic("Page Thirty Epic")
    @Feature("Covering JavaScript Onload Event Error Feature")
    @Description("Verify page finishes loading despite JavaScript onload error")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 30,
            description = "Verify that the document reaches complete ready state despite the JavaScript error")
    public void verifyPageFinishesLoadingDespiteJavaScriptError() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptOnload();

        P30JavaScriptOnLoadPage p30JavaScriptOnLoadPage =
                new P30JavaScriptOnLoadPage(driver);

        Assert.assertEquals(
                p30JavaScriptOnLoadPage.getDocumentReadyState(),
                "complete"
        );
    }
}