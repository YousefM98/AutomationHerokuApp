package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P9DisappearingElementsPage;


public class P9DisappearingElementsTest extends BaseTest {


    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate Disappering Elements Page Header text is Disappearing Elements")
    @Severity(SeverityLevel.MINOR)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate Disappering Elements Page Header text is Disappearing Elements")
    public void validateDisappearingElementsHeaderText() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        Assert.assertEquals(p9DisappearingElementsPage.getHeaderText(), "Disappearing Elements");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Disappering Elements Page contains 4 or 5 buttons")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Disappering Elements Page contains 4 or 5 buttons")
    public void validateDisappearingElementsButtonsCount() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        Assert.assertTrue(p9DisappearingElementsPage.getButtonsCount() == 4 || p9DisappearingElementsPage.getButtonsCount() == 5, "Expected buttons count to be either 4 or 5");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Clicking home button reverts to home page of heroku app")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Clicking home button reverts to home page of heroku app")
    public void validateHomeButtonRevertsToHomePage() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        p9DisappearingElementsPage.clickHomeButton();
       Assert.assertEquals(p9DisappearingElementsPage.getUrl(),"https://the-internet.herokuapp.com/");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Clicking About button navigates to Not found page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Clicking About button navigates to Not found page")
    public void validateAboutButtonNavigatesToNotFoundPage() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        p9DisappearingElementsPage.clickAboutButton();
        Assert.assertEquals(p9DisappearingElementsPage.getErrorMessageText(),"Not Found");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Clicking Contact us button navigates to Not found page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Clicking Contact us button navigates to Not found page")
    public void validateContactUsButtonNavigatesToNotFoundPage() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        p9DisappearingElementsPage.clickContactUsButton();
        Assert.assertEquals(p9DisappearingElementsPage.getErrorMessageText(),"Not Found");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Clicking Portfolio button navigates to Not found page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Clicking Portfolio button navigates to Not found page")
    public void validatePortfolioButtonNavigatesToNotFoundPage() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        p9DisappearingElementsPage.clickPortfolioButton();
        Assert.assertEquals(p9DisappearingElementsPage.getErrorMessageText(),"Not Found");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Clicking Gallery button navigates to Not found page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Clicking Gallery button navigates to Not found page")
    public void validateGalleryButtonNavigatesToNotFoundPage() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        p9DisappearingElementsPage.refreshUntilGalleryAppears();
        p9DisappearingElementsPage.clickGalleryButton();
        Assert.assertEquals(p9DisappearingElementsPage.getErrorMessageText(),"Not Found");
    }

    @Epic("Page Nine Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("validate that Gallery button appears and disappears randomly after refreshing page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 10, description = "validate that Gallery button appears and disappears randomly after refreshing page")
    public void validateGalleryButtonAppearsAndDisappearsRandomly() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        P9DisappearingElementsPage p9DisappearingElementsPage = new P9DisappearingElementsPage(driver);
        Assert.assertTrue(p9DisappearingElementsPage.galleryAppearsAndDisappears(),"Gallery should appear and disappear during 10 refreshes");
    }
}

