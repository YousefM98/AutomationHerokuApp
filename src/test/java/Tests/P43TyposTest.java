package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P42StatusCodesPage;
import pages.P43TyposPage;


public class P43TyposTest extends BaseTest {


    @Epic("Page Forty Three Epic")
    @Feature("Covering Typos Feature")
    @Description("Verify Typos page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 43,
            description = "Verify that the Typos page displays the correct header")
    public void verifyTyposPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        p0_mainPage.clickTypos();

        P43TyposPage p43TyposPage =
                new P43TyposPage(driver);

        Assert.assertEquals(
                p43TyposPage.getHeaderText(),
                "Typos"
        );
    }


    @Epic("Page Forty Three Epic")
    @Feature("Covering Typos Feature")
    @Description("Verify Typos paragraph is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 43,
            description = "Verify that the Typos page paragraph is displayed")
    public void verifyTyposParagraphIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickTypos();

        P43TyposPage p43TyposPage =
                new P43TyposPage(driver);

        Assert.assertTrue(
                p43TyposPage.isFirstParagraphDisplayed(),
                "First Typos paragraph should be displayed"
        );
        Assert.assertTrue(
                p43TyposPage.isSecondParagraphDisplayed(),
                "Second Typos paragraph should be displayed"
        );
    }


    @Epic("Page Forty Three Epic")
    @Feature("Covering Typos Feature")
    @Description("Verify Typos paragraph is not empty")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 43,
            description = "Verify that the Typos paragraph contains text")
    public void verifyTyposParagraphIsNotEmpty() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickTypos();

        P43TyposPage p43TyposPage =
                new P43TyposPage(driver);

        Assert.assertTrue(
                p43TyposPage.isFirstParagraphNotEmpty(),
                "First Typos paragraph should not be empty"
        );
        Assert.assertTrue(
                p43TyposPage.isSecondParagraphNotEmpty(),
                "Second Typos paragraph should not be empty"
        );
    }


    @Epic("Page Forty Three Epic")
    @Feature("Covering Typos Feature")
    @Description("Verify Typos paragraph opening text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 43,
            description = "Verify that the Typos paragraph contains the expected opening text")
    public void verifyTyposParagraphOpeningText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickTypos();

        P43TyposPage p43TyposPage =
                new P43TyposPage(driver);

        Assert.assertEquals(
                p43TyposPage.getFirstParagraphText(),
                "This example demonstrates a typo being introduced. It does it randomly on each page load."
        );
    }


    @Epic("Page Forty Three Epic")
    @Feature("Covering Typos Feature")
    @Description("Verify Typos paragraph ending text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 43,
            description = "Verify that the Typos paragraph contains the expected ending text")
    public void verifyTyposParagraphEndingText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickTypos();

        P43TyposPage p43TyposPage =
                new P43TyposPage(driver);

        Assert.assertTrue(
                p43TyposPage.isSecondParagraphValid()
        );
    }
}