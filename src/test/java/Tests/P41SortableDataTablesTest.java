package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;


import pages.P41SortableDataTablesPage;


public class P41SortableDataTablesTest extends BaseTest {


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify Sortable Data Tables page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that the Sortable Data Tables page displays the correct header")
    public void verifySortableDataTablesPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertEquals(
                p41SortableDataTablesPage.getHeaderText(),
                "Data Tables"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify both sortable tables are displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that both sortable data tables are displayed")
    public void verifyBothTablesAreDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertTrue(
                p41SortableDataTablesPage.isFirstTableDisplayed(),
                "First table should be displayed"
        );

        Assert.assertTrue(
                p41SortableDataTablesPage.isSecondTableDisplayed(),
                "Second table should be displayed"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify sortable data tables row counts")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that both sortable tables contain four data rows")
    public void verifyTableRowsCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableRowsCount(),
                4
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getSecondTableRowsCount(),
                4
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify sortable data tables header counts")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that both sortable tables contain six columns")
    public void verifyTableHeadersCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeadersCount(),
                6
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getSecondTableHeadersCount(),
                6
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify first table column headers")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that the first table contains the correct column headers")
    public void verifyFirstTableHeaders() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(1),
                "Last Name"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(2),
                "First Name"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(3),
                "Email"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(4),
                "Due"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(5),
                "Web Site"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableHeader(6),
                "Action"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify table cell values")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that sortable table cells contain the expected values")
    public void verifyTableCellValues() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 1),
                "Smith"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 2),
                "John"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 3),
                "jsmith@gmail.com"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 4),
                "$50.00"
        );

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 5),
                "http://www.jsmith.com"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify first table sorting by last name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that the first table can be sorted by Last Name")
    public void verifyFirstTableSortingByLastName() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        p41SortableDataTablesPage.clickFirstTableHeader(1);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 1),
                "Bach"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify first table reverse sorting by last name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that clicking Last Name twice sorts the table in reverse order")
    public void verifyFirstTableReverseSortingByLastName() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        p41SortableDataTablesPage.clickFirstTableHeader(1);
        p41SortableDataTablesPage.clickFirstTableHeader(1);

        Assert.assertEquals(
                p41SortableDataTablesPage.getFirstTableCellValue(1, 1),
                "Smith"
        );
    }


    @Epic("Page Forty One Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Verify second table sorting by first name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 41,
            description = "Verify that the second table can be sorted by First Name")
    public void verifySecondTableSortingByFirstName() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickSortableDataTables();

        P41SortableDataTablesPage p41SortableDataTablesPage =
                new P41SortableDataTablesPage(driver);

        p41SortableDataTablesPage.clickSecondTableHeader(2);

        Assert.assertEquals(
                p41SortableDataTablesPage.getSecondTableCellValue(1, 2),
                "Frank"
        );
    }
}