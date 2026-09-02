package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;

import pages.P24HorizontalSliderPage;


public class P24HorizontalSliderTest extends BaseTest {


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider page displays the correct header")
    public void verifyHorizontalSliderPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        Assert.assertEquals(
                p24HorizontalSliderPage.getHeaderText(),
                "Horizontal Slider"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider initial value")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider starts with the correct initial value")
    public void verifySliderInitialValue() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                "0"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider moves to the right")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider value increases when moved to the right")
    public void verifySliderMovesRight() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        p24HorizontalSliderPage.moveSliderRight();

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                "0.5"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider can reach maximum value")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider can be moved to its maximum value")
    public void verifySliderMaximumValue() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        p24HorizontalSliderPage.moveSliderToMaximum();

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                "5"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider can reach minimum value")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider can be moved to its minimum value")
    public void verifySliderMinimumValue() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        p24HorizontalSliderPage.moveSliderToMaximum();

        p24HorizontalSliderPage.moveSliderToMinimum();

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                "0"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify Horizontal Slider can be set to a specific value")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the Horizontal Slider can be moved to a specific value")
    public void verifySliderCanBeSetToSpecificValue() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        p24HorizontalSliderPage.setSliderValue(3.5);

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                "3.5"
        );
    }


    @Epic("Page Twenty Four Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Verify displayed slider value matches the slider value attribute")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 24, description = "Verify that the displayed slider value matches the actual slider value")
    public void verifyDisplayedValueMatchesSliderValue() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickHorizontalSlider();

        P24HorizontalSliderPage p24HorizontalSliderPage =
                new P24HorizontalSliderPage(driver);

        p24HorizontalSliderPage.setSliderValue(4);

        Assert.assertEquals(
                p24HorizontalSliderPage.getSliderValue(),
                p24HorizontalSliderPage.getSliderValueAttribute()
        );
    }
}