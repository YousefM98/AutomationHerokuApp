package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;



import pages.P26InfiniteScrollPage;


public class P26InfiniteScrollTest extends BaseTest {


    @Epic("Page Twenty Six Epic")
    @Feature("Covering Infinite Scroll Feature")
    @Description("Verify Infinite Scroll page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 26, description = "Verify that the Infinite Scroll page displays the correct header")
    public void verifyInfiniteScrollPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInfiniteScroll();

        P26InfiniteScrollPage p26InfiniteScrollPage =
                new P26InfiniteScrollPage(driver);

        Assert.assertEquals(
                p26InfiniteScrollPage.getHeaderText(),
                "Infinite Scroll"
        );
    }


    @Epic("Page Twenty Six Epic")
    @Feature("Covering Infinite Scroll Feature")
    @Description("Verify initial content is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 26, description = "Verify that initial content is displayed on the Infinite Scroll page")
    public void verifyInitialContentIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInfiniteScroll();

        P26InfiniteScrollPage p26InfiniteScrollPage =
                new P26InfiniteScrollPage(driver);

        Assert.assertTrue(
                p26InfiniteScrollPage.isContentDisplayed(),
                "Initial Infinite Scroll content should be displayed"
        );
    }


    @Epic("Page Twenty Six Epic")
    @Feature("Covering Infinite Scroll Feature")
    @Description("Verify additional content loads after scrolling")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 26, description = "Verify that additional content is dynamically loaded after scrolling")
    public void verifyAdditionalContentLoadsAfterScrolling() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInfiniteScroll();

        P26InfiniteScrollPage p26InfiniteScrollPage =
                new P26InfiniteScrollPage(driver);

        long initialPageHeight =
                p26InfiniteScrollPage.getPageHeight();

        p26InfiniteScrollPage.scrollAndWaitForMoreContent();

        long newPageHeight =
                p26InfiniteScrollPage.getPageHeight();

        Assert.assertTrue(
                newPageHeight > initialPageHeight,
                "Page height should increase after loading additional content"
        );
    }


    @Epic("Page Twenty Six Epic")
    @Feature("Covering Infinite Scroll Feature")
    @Description("Verify content continues loading after multiple scrolls")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 26, description = "Verify that additional content continues loading after multiple scrolls")
    public void verifyContentContinuesLoadingAfterMultipleScrolls() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInfiniteScroll();

        P26InfiniteScrollPage p26InfiniteScrollPage =
                new P26InfiniteScrollPage(driver);

        long initialPageHeight =
                p26InfiniteScrollPage.getPageHeight();

        p26InfiniteScrollPage.scrollMultipleTimes(3);

        long finalPageHeight =
                p26InfiniteScrollPage.getPageHeight();

        Assert.assertTrue(
                finalPageHeight > initialPageHeight,
                "Page height should increase after multiple scrolls"
        );
    }
}