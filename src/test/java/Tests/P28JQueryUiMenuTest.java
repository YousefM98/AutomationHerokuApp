package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;


import pages.P27InputsPage;
import pages.P28JQueryUiMenuPage;


public class P28JQueryUiMenuTest extends BaseTest {


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify JQuery UI Menu page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that the JQuery UI Menu page displays the correct header")
    public void verifyJQueryUiMenuPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        Assert.assertEquals(
                p28JQueryUiMenuPage.getHeaderText(),
                "JQueryUI - Menu"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify main menu items are displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that Disabled and Enabled menu items are displayed")
    public void verifyMainMenuItemsAreDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        Assert.assertTrue(
                p28JQueryUiMenuPage.isDisabledMenuDisplayed(),
                "Disabled menu item should be displayed"
        );

        Assert.assertTrue(
                p28JQueryUiMenuPage.isEnabledMenuDisplayed(),
                "Enabled menu item should be displayed"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify Enabled submenu appears after hovering")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that hovering over Enabled displays its submenu")
    public void verifyEnabledSubmenuAppearsOnHover() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        p28JQueryUiMenuPage.hoverOverEnabledMenu();

        Assert.assertTrue(
                p28JQueryUiMenuPage.isDownloadsMenuDisplayed(),
                "Downloads submenu should be displayed"
        );

        Assert.assertTrue(
                p28JQueryUiMenuPage.isBackToJQueryUiDisplayed(),
                "Back to JQuery UI submenu should be displayed"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify Downloads submenu appears after hovering")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that hovering over Downloads displays the file download options")
    public void verifyDownloadsSubmenuAppearsOnHover() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        p28JQueryUiMenuPage.openDownloadsSubmenu();

        Assert.assertTrue(
                p28JQueryUiMenuPage.isPdfMenuDisplayed(),
                "PDF option should be displayed"
        );

        Assert.assertTrue(
                p28JQueryUiMenuPage.isCsvMenuDisplayed(),
                "CSV option should be displayed"
        );

        Assert.assertTrue(
                p28JQueryUiMenuPage.isExcelMenuDisplayed(),
                "Excel option should be displayed"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify PDF download link")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that the PDF menu option contains the correct download link")
    public void verifyPdfDownloadLink() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();
        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        p28JQueryUiMenuPage.openDownloadsSubmenu();

        Assert.assertTrue(
                p28JQueryUiMenuPage.getPdfLink()
                        .contains(".pdf"),
                "PDF link should point to a PDF file"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify CSV download link")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that the CSV menu option contains the correct download link")
    public void verifyCsvDownloadLink() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        p28JQueryUiMenuPage.openDownloadsSubmenu();

        Assert.assertTrue(
                p28JQueryUiMenuPage.getCsvLink()
                        .contains(".csv"),
                "CSV link should point to a CSV file"
        );
    }


    @Epic("Page Twenty Eight Epic")
    @Feature("Covering JQuery UI Menu Feature")
    @Description("Verify Excel download link")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 28,
            description = "Verify that the Excel menu option contains the correct download link")
    public void verifyExcelDownloadLink() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJQueryUiMenus();

        P28JQueryUiMenuPage p28JQueryUiMenuPage =
                new P28JQueryUiMenuPage(driver);

        p28JQueryUiMenuPage.openDownloadsSubmenu();

        Assert.assertTrue(
                p28JQueryUiMenuPage.getExcelLink()
                        .contains(".xls"),
                "Excel link should point to an Excel file"
        );
    }
}