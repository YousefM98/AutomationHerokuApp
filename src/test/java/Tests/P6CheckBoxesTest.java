package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P6CheckBoxesPage;

public class P6CheckBoxesTest extends BaseTest {


        @Epic("Page Six Epic")
        @Feature("Covering Check Boxes Feature")
        @Description("validate That Check Boxes Header is Check Boxes")
        @Severity(SeverityLevel.BLOCKER)
        @Owner("Yousef Mohsen")
        @Test(groups = "smoke", priority = 7, description = "validate That Check Boxes Header is Check Boxes")
        public void validateCheckBoxesHeader() {
            P0_mainPage p0_mainPage = new P0_mainPage(driver);
            p0_mainPage.clickCheckBoxes();
            P6CheckBoxesPage p6CheckBoxesPage = new P6CheckBoxesPage(driver);
            Assert.assertEquals(p6CheckBoxesPage.getHeaderText(), "Checkboxes");
        }

    @Epic("Page Six Epic")
    @Feature("Covering Check Boxes Feature")
    @Description("validate That First Check Box is displayed and named checkbox 1")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 7, description = "validate That First Check Box is displayed and named checkbox 1")
    public void validateFirstCheckBoxIsDisplayedAndItsName() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickCheckBoxes();
        P6CheckBoxesPage p6CheckBoxesPage = new P6CheckBoxesPage(driver);
        Assert.assertTrue(p6CheckBoxesPage.isFirstCheckboxDisplayed(), "First checkbox should be displayed");
        Assert.assertTrue(p6CheckBoxesPage.getCheckboxText().startsWith("checkbox 1"),"The name of the first checkbox should be checkbox 1");
    }

    @Epic("Page Six Epic")
    @Feature("Covering Check Boxes Feature")
    @Description("validate That Second Check Box is displayed and named checkbox 2")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 7, description = "validate That Second Check Box is displayed and named checkbox 2")
    public void validateSecondCheckBoxIsDisplayedAndItsName() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickCheckBoxes();
        P6CheckBoxesPage p6CheckBoxesPage = new P6CheckBoxesPage(driver);
        Assert.assertTrue(p6CheckBoxesPage.isSecondCheckboxDisplayed(), "Second checkbox should be displayed");
        Assert.assertTrue(p6CheckBoxesPage.getCheckboxText().endsWith("checkbox 2"),"The name of the first checkbox should be checkbox 2");
    }

    @Epic("Page Six Epic")
    @Feature("Covering Check Boxes Feature")
    @Description("validate the status and functionality of first checkbox")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 7, description = "validate the status and functionality of first checkbox")
    public void validateFirstCheckBoxStatusAndFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickCheckBoxes();
        P6CheckBoxesPage p6CheckBoxesPage = new P6CheckBoxesPage(driver);
        Assert.assertFalse(p6CheckBoxesPage.isFirstCheckboxSelected(), "First checkbox should be not selected");
        p6CheckBoxesPage.clickFirstCheckbox();
        Assert.assertTrue(p6CheckBoxesPage.isFirstCheckboxSelected(), "First checkbox should be selected now");
    }

    @Epic("Page Six Epic")
    @Feature("Covering Check Boxes Feature")
    @Description("validate the status and functionality of second checkbox")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate the status and functionality of second checkbox")
    public void validateSecondCheckBoxStatusAndFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickCheckBoxes();
        P6CheckBoxesPage p6CheckBoxesPage = new P6CheckBoxesPage(driver);
        Assert.assertTrue(p6CheckBoxesPage.isSecondCheckboxSelected(), "Second checkbox should be selected");
        p6CheckBoxesPage.clickSecondCheckbox();
        Assert.assertFalse(p6CheckBoxesPage.isSecondCheckboxSelected(), "Second checkbox should not be selected now");
    }
    }



