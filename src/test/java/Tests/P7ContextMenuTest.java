package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P7ContextMenuPage;


public class P7ContextMenuTest extends BaseTest {


        @Epic("Page Seven Epic")
        @Feature("Covering Context Menu Feature")
        @Description("validate That Context Menu Header is Context Menu")
        @Severity(SeverityLevel.MINOR)
        @Owner("Yousef Mohsen")
        @Test(groups = "smoke", priority = 8, description = "validate That Context Menu Header is Context Menu")
        public void validateContextMenuHeader() {
            P0_mainPage p0_mainPage = new P0_mainPage(driver);
            p0_mainPage.clickContextMenu();
            P7ContextMenuPage p7ContextMenuPage = new P7ContextMenuPage(driver);
            Assert.assertEquals(p7ContextMenuPage.getHeaderText(), "Context Menu");
        }

    @Epic("Page Seven Epic")
    @Feature("Covering Context Menu Feature")
    @Description("validate That Context Menu Box is displayed with dashed border, 5px border width, 250px width, 150px height")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 8, description = "validate That Context Menu Box is displayed with dashed border, 5px border width, 250px width, 150px height")
    public void validateContextMenuBoxIsdisplayedAndItsAttributes() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickContextMenu();
        P7ContextMenuPage p7ContextMenuPage = new P7ContextMenuPage(driver);
        Assert.assertTrue(p7ContextMenuPage.isContextMenuBoxDisplayed(), "Context Menu Box should be displayed");
        Assert.assertEquals(p7ContextMenuPage.getContextMenuBoxBorderStyle(), "dashed", "Border style should be dashed");
        Assert.assertEquals(p7ContextMenuPage.getContextMenuBoxBorderWidth(), "4.8px", "Border Width should be 4.8px");
        Assert.assertEquals(p7ContextMenuPage.getContextMenuBoxWidth(), "250px", "Width should be 250px");
        Assert.assertEquals(p7ContextMenuPage.getContextMenuBoxHeight(), "150px", "Height should be 150px");
    }

    @Epic("Page Seven Epic")
    @Feature("Covering Context Menu Feature")
    @Description("validate Context Menu box will display an alert 'You selected a context menu' after right clicking it")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 8, description = "validate Context Menu box will display an alert 'You selected a context menu' after right clicking it")
    public void validateContextMenuBoxFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickContextMenu();
        P7ContextMenuPage p7ContextMenuPage = new P7ContextMenuPage(driver);
        p7ContextMenuPage.rightClickContextMenuBox();
        Assert.assertEquals(p7ContextMenuPage.getAlertText(), "You selected a context menu");
        p7ContextMenuPage.acceptAlert();
    }
    }



