package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P34NestedFramesPage;


public class P34NestedFramesTest extends BaseTest {


    @Epic("Page Thirty Four Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Verify left nested frame text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 34,
            description = "Verify that the left nested frame displays the correct text")
    public void verifyLeftFrameText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNestedFrames();

        P34NestedFramesPage p34NestedFramesPage =
                new P34NestedFramesPage(driver);

        Assert.assertEquals(
                p34NestedFramesPage.getLeftFrameText(),
                "LEFT"
        );
    }


    @Epic("Page Thirty Four Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Verify middle nested frame text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 34,
            description = "Verify that the middle nested frame displays the correct text")
    public void verifyMiddleFrameText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNestedFrames();

        P34NestedFramesPage p34NestedFramesPage =
                new P34NestedFramesPage(driver);

        Assert.assertEquals(
                p34NestedFramesPage.getMiddleFrameText(),
                "MIDDLE"
        );
    }


    @Epic("Page Thirty Four Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Verify right nested frame text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 34,
            description = "Verify that the right nested frame displays the correct text")
    public void verifyRightFrameText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNestedFrames();

        P34NestedFramesPage p34NestedFramesPage =
                new P34NestedFramesPage(driver);

        Assert.assertEquals(
                p34NestedFramesPage.getRightFrameText(),
                "RIGHT"
        );
    }


    @Epic("Page Thirty Four Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Verify bottom frame text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 34,
            description = "Verify that the bottom frame displays the correct text")
    public void verifyBottomFrameText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNestedFrames();

        P34NestedFramesPage p34NestedFramesPage =
                new P34NestedFramesPage(driver);

        Assert.assertEquals(
                p34NestedFramesPage.getBottomFrameText(),
                "BOTTOM"
        );
    }


    @Epic("Page Thirty Four Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Verify all nested frame texts")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 34,
            description = "Verify that all nested frames display the expected text")
    public void verifyAllNestedFrameTexts() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNestedFrames();

        P34NestedFramesPage p34NestedFramesPage =
                new P34NestedFramesPage(driver);

        Assert.assertEquals(
                p34NestedFramesPage.getLeftFrameText(),
                "LEFT"
        );

        Assert.assertEquals(
                p34NestedFramesPage.getMiddleFrameText(),
                "MIDDLE"
        );

        Assert.assertEquals(
                p34NestedFramesPage.getRightFrameText(),
                "RIGHT"
        );

        Assert.assertEquals(
                p34NestedFramesPage.getBottomFrameText(),
                "BOTTOM"
        );
    }
}