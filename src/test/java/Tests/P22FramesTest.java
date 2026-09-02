package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P22FramesPage;


public class P22FramesTest extends BaseTest {


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify Frames page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the Frames page displays the correct header")
    public void verifyFramesPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        Assert.assertEquals(
                p22FramesPage.getHeaderText(),
                "Frames"
        );
    }


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify Left nested frame content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the Left nested frame displays the correct text")
    public void verifyLeftFrameText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        p22FramesPage.clickNestedFrames();

        Assert.assertEquals(
                p22FramesPage.getLeftFrameText(),
                "LEFT"
        );
    }


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify Middle nested frame content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the Middle nested frame displays the correct text")
    public void verifyMiddleFrameText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        p22FramesPage.clickNestedFrames();

        Assert.assertEquals(
                p22FramesPage.getMiddleFrameText(),
                "MIDDLE"
        );
    }


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify Right nested frame content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the Right nested frame displays the correct text")
    public void verifyRightFrameText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        p22FramesPage.clickNestedFrames();

        Assert.assertEquals(
                p22FramesPage.getRightFrameText(),
                "RIGHT"
        );
    }


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify Bottom nested frame content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the Bottom nested frame displays the correct text")
    public void verifyBottomFrameText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        p22FramesPage.clickNestedFrames();

        Assert.assertEquals(
                p22FramesPage.getBottomFrameText(),
                "BOTTOM"
        );
    }


    @Epic("Page Twenty Two Epic")
    @Feature("Covering Frames Feature")
    @Description("Verify iFrame editor content")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 22, description = "Verify that the iFrame editor displays the expected text")
    public void verifyiFrameText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFrames();

        P22FramesPage p22FramesPage =
                new P22FramesPage(driver);

        p22FramesPage.clickiFrame();

        Assert.assertEquals(
                p22FramesPage.getiFrameText(),
                "Your content goes here."
        );
    }
}