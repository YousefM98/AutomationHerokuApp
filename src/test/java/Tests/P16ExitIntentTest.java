package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P15EntryAdPage;
import pages.P16ExitIntentPage;

public class P16ExitIntentTest extends BaseTest {



    @Epic("Page Sixteen Epic")
    @Feature("Covering Exit Intent Feature")
    @Description("Verify Exit Intent page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 17, description = "Verify that the Exit Intent page displays the correct header")
    public void verifyExitIntentPageHeader() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickExitIntent();
        P16ExitIntentPage p16ExitIntentPage = new P16ExitIntentPage(driver);
        Assert.assertEquals( p16ExitIntentPage.getHeaderText(), "Exit Intent" ); }

    @Epic("Page Sixteen Epic")
    @Feature("Covering Exit Intent Feature")
    @Description("Verify Exit Intent modal appears")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 17, description = "Verify that the Exit Intent modal appears when the mouse leaves toward the top of the page")
    public void verifyExitIntentModalAppears() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickExitIntent();
        P16ExitIntentPage p16ExitIntentPage = new P16ExitIntentPage(driver);
        Assert.assertFalse( p16ExitIntentPage.isModalDisplayed(), "Exit Intent modal should not initially be displayed" );
        p16ExitIntentPage.triggerExitIntent();
        Assert.assertTrue( p16ExitIntentPage.isModalDisplayed(), "Exit Intent modal should be displayed after triggering exit intent" ); }

    @Epic("Page Sixteen Epic")
    @Feature("Covering Exit Intent Feature")
    @Description("Verify that the Exit Intent modal contains the expected content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 17, description = "Verify that the Exit Intent modal contains the expected content")
    public void verifyExitIntentModalContent() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickExitIntent();
        P16ExitIntentPage p16ExitIntentPage = new P16ExitIntentPage(driver);
        p16ExitIntentPage.triggerExitIntent();
        Assert.assertEquals( p16ExitIntentPage.getModalText(), "THIS IS A MODAL WINDOW" ); }

    @Epic("Page Sixteen Epic")
    @Feature("Covering Exit Intent Feature")
    @Description("Verify Exit Intent modal can be closed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 17, description = "Verify that the Exit Intent modal can be closed")
    public void verifyExitIntentModalCanBeClosed() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickExitIntent();
        P16ExitIntentPage p16ExitIntentPage = new P16ExitIntentPage(driver);
        p16ExitIntentPage.triggerExitIntent();
        Assert.assertTrue( p16ExitIntentPage.isModalDisplayed(), "Exit Intent modal should be displayed" );
        p16ExitIntentPage.closeModal();
        Assert.assertFalse( p16ExitIntentPage.isModalDisplayed(), "Exit Intent modal should not be displayed after closing" ); }
    }

