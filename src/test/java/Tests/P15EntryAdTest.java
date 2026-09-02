package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P15EntryAdPage;

public class P15EntryAdTest extends BaseTest {



    @Epic("Page Fifteen Epic")
    @Feature("Covering Entry ad Feature")
    @Description("Verify that the Entry Ad page displays the correct header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 16, description = "Verify that the Entry Ad page displays the correct header")
    public void verifyEntryAdPageHeader() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickEntryAd();
      P15EntryAdPage p15EntryAdPage = new P15EntryAdPage(driver);
        Assert.assertEquals(p15EntryAdPage.getHeaderText(), "Entry Ad");
    }

    @Epic("Page Fifteen Epic")
    @Feature("Covering Entry ad Feature")
    @Description("Verify Entry Ad modal is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 16, description = "Verify Entry Ad modal is displayed")
    public void verifyEntryAdModalIsDisplayed(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickEntryAd();
        P15EntryAdPage p15EntryAdPage = new P15EntryAdPage(driver);
        p15EntryAdPage.waitForModal();
        Assert.assertTrue( p15EntryAdPage.isModalDisplayed(), "Entry Ad modal should be displayed" ); }

    @Epic("Page Fifteen Epic")
    @Feature("Covering Entry ad Feature")
    @Description("Verify modal close button")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 16, description = "Verify modal close button")
    public void verifyModalCanBeClosed(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickEntryAd();
        P15EntryAdPage p15EntryAdPage = new P15EntryAdPage(driver);
        p15EntryAdPage.waitForModal();
        Assert.assertTrue( p15EntryAdPage.isModalDisplayed(), "Entry Ad modal should initially be displayed" );
        Assert.assertTrue( p15EntryAdPage.isCloseButtonDisplayed(), "Modal close button should be displayed" );
        p15EntryAdPage.closeModal();
        Assert.assertFalse( p15EntryAdPage.isModalDisplayed(), "Entry Ad modal should no longer be displayed" ); }



    }

