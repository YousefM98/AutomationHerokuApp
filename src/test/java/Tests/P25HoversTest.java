package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;


import pages.P25HoversPage;


public class P25HoversTest extends BaseTest {


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify Hovers page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the Hovers page displays the correct header")
    public void verifyHoversPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        Assert.assertEquals(
                p25HoversPage.getHeaderText(),
                "Hovers"
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify hoverable figures count")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the Hovers page contains three hoverable figures")
    public void verifyHoverableFiguresCount() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        Assert.assertEquals(
                p25HoversPage.getFiguresCount(),
                3
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify first user caption appears on hover")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the first user caption appears after hovering over the first figure")
    public void verifyFirstUserCaptionAppearsOnHover() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        p25HoversPage.hoverOverFigure(0);

        Assert.assertTrue(
                p25HoversPage.isCaptionDisplayed(0),
                "First user caption should be displayed after hover"
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify first user name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the first figure displays the correct user name on hover")
    public void verifyFirstUserName() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        p25HoversPage.hoverOverFigure(0);

        Assert.assertEquals(
                p25HoversPage.getUserName(0),
                "name: user1"
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify second user name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the second figure displays the correct user name on hover")
    public void verifySecondUserName() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        p25HoversPage.hoverOverFigure(1);

        Assert.assertEquals(
                p25HoversPage.getUserName(1),
                "name: user2"
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify third user name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the third figure displays the correct user name on hover")
    public void verifyThirdUserName() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        p25HoversPage.hoverOverFigure(2);

        Assert.assertEquals(
                p25HoversPage.getUserName(2),
                "name: user3"
        );
    }


    @Epic("Page Twenty Five Epic")
    @Feature("Covering Hovers Feature")
    @Description("Verify first user profile link")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 25, description = "Verify that the first user profile link points to the correct profile")
    public void verifyFirstUserProfileLink() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHovers();

        P25HoversPage p25HoversPage =
                new P25HoversPage(driver);

        p25HoversPage.hoverOverFigure(0);

        Assert.assertTrue(
                p25HoversPage.getProfileLink(0)
                        .contains("/users/1"),
                "First user profile link should contain /users/1"
        );
    }
}