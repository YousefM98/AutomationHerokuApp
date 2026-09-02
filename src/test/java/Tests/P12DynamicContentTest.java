package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P12DynamicContentPage;

public class P12DynamicContentTest extends BaseTest {


    @Epic("Page Twelve Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("validate Dynamic Content Page Header text is Dynamic Content")
    @Severity(SeverityLevel.MINOR)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 13, description = "validate Dynamic Content Page Header text is Dynamic Content")
    public void validateDynamicContentHeaderText() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        P12DynamicContentPage p12DynamicContentPage = new P12DynamicContentPage(driver);
        Assert.assertEquals(p12DynamicContentPage.getHeaderText(),"Dynamic Content");
    }

    @Epic("Page Twelve Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("validate That page Contains three images and three paragraphs")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 13, description = "validate That page Contains three images and three paragraphs")
    public void validatePageContainsTwoImagesAndThreeParagraphs() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        P12DynamicContentPage p12DynamicContentPage = new P12DynamicContentPage(driver);
        Assert.assertEquals(p12DynamicContentPage.getImagesCount(),3,"Page should contain three images");
        Assert.assertEquals(p12DynamicContentPage.getParagraphsCount(),3,"Page should contain three paragraphs");
    }

    @Epic("Page Twelve Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("validate That images and paragraphs change after refresh")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 13, description = "validate That images and paragraphs change after refresh")
    public void validateImagesAndParagraphsChangeAfterRefresh() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        P12DynamicContentPage p12DynamicContentPage = new P12DynamicContentPage(driver);
        Assert.assertTrue(p12DynamicContentPage.allContentKeepsChangingAfterRefresh(),"Images and paragraphs should keep changing after refresh");//performs page refresh 10 times
    }

    @Epic("Page Twelve Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("validate That Click here link is displayed and when clicked navigates to a new URL")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 13, description = "validate That Click here link is displayed and when clicked navigates to a new URL")
    public void validateClickHereLinkIsDisplayedAndNavigatesToNewURL() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        P12DynamicContentPage p12DynamicContentPage = new P12DynamicContentPage(driver);
        Assert.assertTrue(p12DynamicContentPage.isClickHereDisplayed(),"Click Here Link should be displayed");
        p12DynamicContentPage.clickHereLink();
        Assert.assertEquals(p12DynamicContentPage.getURL(),"https://the-internet.herokuapp.com/dynamic_content?with_content=static","New URL should contain with_content=static");
    }

    @Epic("Page Twelve Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("validate That after clicking click here link, only third row image and paragraph change after refresh")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 13, description = "validate That after clicking click here link, only third row image and paragraph change after refresh")
    public void validateThirdImageAndParagraphChangeAfterRefresh() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        P12DynamicContentPage p12DynamicContentPage = new P12DynamicContentPage(driver);
        p12DynamicContentPage.clickHereLink();
        Assert.assertTrue(p12DynamicContentPage.onlyThirdContentKeepsChanging(),"Only third image and paragraph should change after each refresh");//performs page refresh 10 times
    }
}

