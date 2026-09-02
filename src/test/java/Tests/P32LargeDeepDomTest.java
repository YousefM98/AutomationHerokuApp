package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P31KeyPressesPage;
import pages.P32LargeDeepDomPage;


public class P32LargeDeepDomTest extends BaseTest {


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify Large and Deep DOM page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that the Large and Deep DOM page displays the correct header")
    public void verifyLargeDeepDomPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getHeaderText(),
                "Large & Deep DOM"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify large table is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that the large table is displayed")
    public void verifyLargeTableIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertTrue(
                p32LargeDeepDomPage.isTableDisplayed(),
                "Large table should be displayed"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify large table row count")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that the large table contains 50 rows")
    public void verifyTableRowsCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableRowsCount(),
                50
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify large table column count")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that the large table contains 50 columns")
    public void verifyTableColumnsCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableColumnsCount(),
                50
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify first table cell value")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify the value of the first table cell")
    public void verifyFirstTableCellValue() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableCellValue(1, 1),
                "1.1"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify table middle cell value")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that a cell in the middle of the large table can be located")
    public void verifyMiddleTableCellValue() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableCellValue(25, 25),
                "25.25"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify last table cell value")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that the last cell of the large table can be located")
    public void verifyLastTableCellValue() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableCellValue(50, 50),
                "50.50"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify table header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that a table column header can be retrieved")
    public void verifyTableHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getTableHeader(1),
                "1"
        );
    }


    @Epic("Page Thirty Two Epic")
    @Feature("Covering Large and Deep DOM Feature")
    @Description("Verify deeply nested sibling element")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 32,
            description = "Verify that an element inside the deeply nested DOM can be located")
    public void verifyDeepNestedSibling() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickLargeDeepDom();

        P32LargeDeepDomPage p32LargeDeepDomPage =
                new P32LargeDeepDomPage(driver);

        Assert.assertEquals(
                p32LargeDeepDomPage.getSiblingText(1, 1),
                "1.1"
        );
    }
}