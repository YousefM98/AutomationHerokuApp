package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P36RedirectLinkPage;


public class P36RedirectLinkTest extends BaseTest {


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify Redirect Link page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that the Redirect Link page displays the correct header")
    public void verifyRedirectLinkPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        Assert.assertEquals(
                p36RedirectLinkPage.getHeaderText(),
                "Redirection"
        );
    }


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify redirect link is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that the redirect link is displayed")
    public void verifyRedirectLinkIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        Assert.assertTrue(
                p36RedirectLinkPage.isRedirectLinkDisplayed(),
                "Redirect link should be displayed"
        );
    }


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify redirect link href")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that the redirect link points to the redirect endpoint")
    public void verifyRedirectLinkHref() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        Assert.assertTrue(
                p36RedirectLinkPage.getRedirectLinkHref()
                        .contains("/redirect"),
                "Redirect link href should contain /redirect"
        );
    }


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify redirect to Status Codes page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that clicking the redirect link navigates to the Status Codes page")
    public void verifyRedirectToStatusCodesPage() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        p36RedirectLinkPage.clickRedirectLink();

        Assert.assertTrue(
                p36RedirectLinkPage.getCurrentPageUrl()
                        .contains("/status_codes"),
                "URL should contain /status_codes"
        );
    }


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify Status Codes page header after redirect")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that the Status Codes page displays the correct header after redirect")
    public void verifyStatusCodesPageHeaderAfterRedirect() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        p36RedirectLinkPage.clickRedirectLink();

        Assert.assertEquals(
                p36RedirectLinkPage.getStatusCodesHeaderText(),
                "Status Codes"
        );
    }


    @Epic("Page Thirty Six Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Verify redirect changes the URL")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 36,
            description = "Verify that clicking the redirect link changes the browser URL")
    public void verifyUrlChangesAfterRedirect() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickRedirectLink();

        P36RedirectLinkPage p36RedirectLinkPage =
                new P36RedirectLinkPage(driver);

        String originalUrl =
                p36RedirectLinkPage.getCurrentPageUrl();

        p36RedirectLinkPage.clickRedirectLink();

        String redirectedUrl =
                p36RedirectLinkPage.getCurrentPageUrl();

        Assert.assertNotEquals(
                redirectedUrl,
                originalUrl,
                "URL should change after redirect"
        );

        Assert.assertTrue(
                redirectedUrl.contains("/status_codes"),
                "Redirected URL should contain /status_codes"
        );
    }
}