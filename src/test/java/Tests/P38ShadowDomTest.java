package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P37SecureFileDownloadPage;
import pages.P38ShadowDomPage;

import java.util.List;


public class P38ShadowDomTest extends BaseTest {


    @Epic("Page Thirty Eight Epic")
    @Feature("Covering Shadow DOM Feature")
    @Description("Verify Shadow DOM page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 38,
            description = "Verify that the Shadow DOM page displays the correct header")
    public void verifyShadowDomPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShadowDom();

        P38ShadowDomPage p38ShadowDomPage =
                new P38ShadowDomPage(driver);

        Assert.assertEquals(
                p38ShadowDomPage.getHeaderText(),
                "Simple template"
        );
    }


    @Epic("Page Thirty Eight Epic")
    @Feature("Covering Shadow DOM Feature")
    @Description("Verify Shadow DOM host is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 38,
            description = "Verify that the first Shadow DOM host is displayed")
    public void verifyShadowDomHostIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShadowDom();

        P38ShadowDomPage p38ShadowDomPage =
                new P38ShadowDomPage(driver);

        Assert.assertTrue(
                p38ShadowDomPage.isFirstShadowHostDisplayed(),
                "Shadow DOM host should be displayed"
        );
    }


    @Epic("Page Thirty Eight Epic")
    @Feature("Covering Shadow DOM Feature")
    @Description("Verify Shadow Root is available")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 38,
            description = "Verify that Selenium can access the Shadow Root")
    public void verifyShadowRootIsAvailable() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShadowDom();

        P38ShadowDomPage p38ShadowDomPage =
                new P38ShadowDomPage(driver);

        Assert.assertTrue(
                p38ShadowDomPage.isFirstShadowRootAvailable(),
                "Shadow Root should be available"
        );
    }


    @Epic("Page Thirty Eight Epic")
    @Feature("Covering Shadow DOM Feature")
    @Description("Verify text inside Shadow DOM")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 38,
            description = "Verify that Selenium can retrieve text from inside the Shadow DOM")
    public void verifyFirstShadowDomText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShadowDom();

        P38ShadowDomPage p38ShadowDomPage =
                new P38ShadowDomPage(driver);

        Assert.assertEquals(
                p38ShadowDomPage.getFirstShadowText(),
                "Let's have some different text!"
        );
    }
}