package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P32LargeDeepDomPage;
import pages.P33MultipleWindowsPage;


public class P33MultipleWindowsTest extends BaseTest {


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify Multiple Windows page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that the Multiple Windows page displays the correct header")
    public void verifyMultipleWindowsPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        Assert.assertEquals(
                p33MultipleWindowsPage.getHeaderText(),
                "Opening a new window"
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify Click Here link is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that the Click Here link is displayed")
    public void verifyClickHereLinkIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        Assert.assertTrue(
                p33MultipleWindowsPage.isClickHereLinkDisplayed(),
                "Click Here link should be displayed"
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify new window is opened")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that clicking the link opens a second browser window")
    public void verifyNewWindowIsOpened() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        p33MultipleWindowsPage.clickHere();

        Assert.assertEquals(
                p33MultipleWindowsPage.getWindowCount(),
                2
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify new window header")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that the newly opened window displays the correct header")
    public void verifyNewWindowHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        String originalWindow =
                p33MultipleWindowsPage.getCurrentWindowHandle();

        p33MultipleWindowsPage.clickHere();

        p33MultipleWindowsPage.switchToNewWindow(originalWindow);

        Assert.assertEquals(
                p33MultipleWindowsPage.getNewWindowHeaderText(),
                "New Window"
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify new window URL")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that the newly opened window has the correct URL")
    public void verifyNewWindowUrl() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        String originalWindow =
                p33MultipleWindowsPage.getCurrentWindowHandle();

        p33MultipleWindowsPage.clickHere();

        p33MultipleWindowsPage.switchToNewWindow(originalWindow);

        Assert.assertTrue(
                p33MultipleWindowsPage.getCurrentWindowUrl()
                        .contains("/windows/new"),
                "New window URL should contain /windows/new"
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify switching back to original window")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that Selenium can close the new window and switch back to the original window")
    public void verifySwitchBackToOriginalWindow() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        String originalWindow =
                p33MultipleWindowsPage.getCurrentWindowHandle();

        p33MultipleWindowsPage.clickHere();

        p33MultipleWindowsPage.switchToNewWindow(originalWindow);

        Assert.assertEquals(
                p33MultipleWindowsPage.getNewWindowHeaderText(),
                "New Window"
        );

        p33MultipleWindowsPage.closeCurrentWindow();

        p33MultipleWindowsPage.switchToOriginalWindow(
                originalWindow
        );

        Assert.assertEquals(
                p33MultipleWindowsPage.getHeaderText(),
                "Opening a new window"
        );
    }


    @Epic("Page Thirty Three Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Verify window count after closing new window")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 33,
            description = "Verify that only one browser window remains after closing the new window")
    public void verifyWindowCountAfterClosingNewWindow() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickMultipleWindows();

        P33MultipleWindowsPage p33MultipleWindowsPage =
                new P33MultipleWindowsPage(driver);

        String originalWindow =
                p33MultipleWindowsPage.getCurrentWindowHandle();

        p33MultipleWindowsPage.clickHere();

        p33MultipleWindowsPage.switchToNewWindow(originalWindow);

        p33MultipleWindowsPage.closeCurrentWindow();

        p33MultipleWindowsPage.switchToOriginalWindow(
                originalWindow
        );

        Assert.assertEquals(
                p33MultipleWindowsPage.getWindowCount(),
                1
        );
    }
}