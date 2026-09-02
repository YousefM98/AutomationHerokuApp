package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;

import pages.P40SlowResourcesPage;


public class P40SlowResourcesTest extends BaseTest {


    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources page displays the correct header")
    public void verifySlowResourcesPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertEquals(
                p40SlowResourcesPage.getHeaderText(),
                "Slow Resources"
        );
    }


    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources page description")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources page description is displayed")
    public void verifySlowResourcesDescriptionIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertTrue(
                p40SlowResourcesPage.isDescriptionDisplayed(),
                "Slow Resources description should be displayed"
        );
    }


    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources description text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources page contains the expected description")
    public void verifySlowResourcesDescriptionText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertFalse(
                p40SlowResourcesPage
                        .getDescriptionText()
                        .isEmpty(),
                "Slow Resources description should not be empty"
        );
    }


    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources page URL")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources page has the correct URL")
    public void verifySlowResourcesPageUrl() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertTrue(
                p40SlowResourcesPage
                        .getCurrentPageUrl()
                        .contains("/slow"),
                "URL should contain /slow"
        );
    }

    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources document ready state")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources document reaches complete ready state")
    public void verifyDocumentReadyState() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertEquals(
                p40SlowResourcesPage.getDocumentReadyState(),
                "complete"
        );
    }
    @Epic("Page Forty Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Verify Slow Resources page finishes loading")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 40,
            description = "Verify that the Slow Resources page finishes loading successfully")
    public void verifySlowResourcesPageFinishesLoading() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSlowResources();

        P40SlowResourcesPage p40SlowResourcesPage =
                new P40SlowResourcesPage(driver);

        Assert.assertTrue(
                p40SlowResourcesPage.isDocumentCompletelyLoaded(),
                "Slow Resources page should finish loading"
        );
    }
}