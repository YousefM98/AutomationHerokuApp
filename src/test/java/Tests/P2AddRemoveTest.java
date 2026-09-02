package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P2AddRemovePage;

public class P2AddRemoveTest extends BaseTest {
    @Epic("Page two Epic")
    @Feature("covering Add Element Feature")
    @Description("Validate Add element button text")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Add element button text")
            public void validateAddElementButtonText(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
    P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
    Assert.assertEquals(P2AddRemovePage.getAddElementButtonText(), "Add Element");
    }

    @Epic("Page two Epic")
    @Feature("covering Add Element Feature")
    @Description("Validate Add element functionality")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Add element functionality")
    public void validateAddElementfunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElement();
        Assert.assertEquals(P2AddRemovePage.getNumberOfElements(), 1);
    }

    @Epic("Page two Epic")
    @Feature("covering Add Element Feature")
    @Description("Validate functionality of adding multiple elements")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate functionality of adding multiple elements")
    public void validateAddMultipleElementsfunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElementsNTimes(6);
        Assert.assertEquals(P2AddRemovePage.getNumberOfElements(), 6);
    }

    @Epic("Page two Epic")
    @Feature("covering Delete Element Feature")
    @Description("Validate Delete element button text")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Delete element button text")
    public void validateDeleteElementButtonText(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElement();
        Assert.assertEquals(P2AddRemovePage.getRemoveElementButtonText(), "Delete");
    }

    @Epic("Page two Epic")
    @Feature("covering Delete Element Feature")
    @Description("Validate Delete element functionality")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Delete element functionality")
    public void validateDeleteElementFunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElement();
        P2AddRemovePage.removeElement();
        Assert.assertEquals(P2AddRemovePage.getNumberOfElements(), 0);
    }

    @Epic("Page two Epic")
    @Feature("covering Delete Element Feature")
    @Description("Validate Deleting Multiple elements functionality")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Delete Multiple elements functionality")
    public void validateDeleteMultipleElementsFunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElementsNTimes(8);
        P2AddRemovePage.removeElementsNTimes(6);
        Assert.assertEquals(P2AddRemovePage.getNumberOfElements(), 2);
    }

    @Epic("Page two Epic")
    @Feature("covering Delete Element Feature")
    @Description("Validate Deleting All Elements functionality")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 3, description = "Validate Deleting All Elements functionality")
    public void validateDeleteALLElementsFunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        P2AddRemovePage P2AddRemovePage = new P2AddRemovePage(driver);
        P2AddRemovePage.addElementsNTimes(10);
        P2AddRemovePage.removeAllElements();
        Assert.assertEquals(P2AddRemovePage.getNumberOfElements(), 0);
    }
}
