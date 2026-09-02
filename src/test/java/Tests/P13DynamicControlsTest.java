package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P13DynamicControlsPage;

public class P13DynamicControlsTest extends BaseTest {


    @Epic("Page Thirteen Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("validate Dynamic Controls Page Header ,first sub header and second sub header")
    @Severity(SeverityLevel.MINOR)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 14, description = "validate Dynamic Controls Page Header ,first sub header and second sub header")
    public void validateDynamicControlsHeaderAndSubHeaders(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        P13DynamicControlsPage p13DynamicControlsPage = new P13DynamicControlsPage(driver);
        Assert.assertEquals(p13DynamicControlsPage.getHeaderText(),"Dynamic Controls");
        Assert.assertEquals(p13DynamicControlsPage.getFirstSubHeaderText(),"Remove/add");
        Assert.assertEquals(p13DynamicControlsPage.getSecondSubHeaderText(),"Enable/disable");
    }


    @Epic("Page Thirteen Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("validate That checkbox is displayed, named A checkbox and is not selected and the button under it is named remove")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 14, description = "validate That checkbox is displayed, named A checkbox and is not selected and the button under it is named remove")
    public void validateCheckboxAndItsButtonAreDisplayed(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        P13DynamicControlsPage p13DynamicControlsPage = new P13DynamicControlsPage(driver);
        Assert.assertTrue(p13DynamicControlsPage.isCheckboxDisplayed(),"Checkbox should be displayed");
        Assert.assertEquals(p13DynamicControlsPage.getCheckboxLabelText(),"A checkbox");
        Assert.assertFalse(p13DynamicControlsPage.isCheckboxSelected(),"Checkbox should not be selected");
        Assert.assertEquals(p13DynamicControlsPage.getCheckboxButtonText(),"Remove");
    }

    @Epic("Page Thirteen Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("validate input field is displayed, not enabled and it's button text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 14, description = "validate input field is displayed, not enabled and it's button text")
    public void validateInputFieldAndItsButtonAreDisplayed(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        P13DynamicControlsPage p13DynamicControlsPage = new P13DynamicControlsPage(driver);
        Assert.assertFalse(p13DynamicControlsPage.isInputEnabled(),"Input field should be displayed but not enabled");
        Assert.assertEquals(p13DynamicControlsPage.getInputButtonText(),"Enable");
    }

    @Epic("Page Thirteen Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("validate the functionality of the check box and it's button addition and removal")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 14, description = "validate the functionality of the check box and it's button addition and removal")
    public void validateCheckboxAndButtonFunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        P13DynamicControlsPage p13DynamicControlsPage = new P13DynamicControlsPage(driver);
        p13DynamicControlsPage.selectCheckbox();
        Assert.assertTrue(p13DynamicControlsPage.isCheckboxSelected(),"Checkbox should be selected");
        p13DynamicControlsPage.removeCheckbox();
        Assert.assertFalse(p13DynamicControlsPage.isCheckboxDisplayed(),"Checkbox should not be displayed");
        Assert.assertEquals(p13DynamicControlsPage.getCheckboxButtonText(),"Add","Check box label text should be changed to Add");
Assert.assertTrue(p13DynamicControlsPage.isCheckBoxMessageDisplayed(),"Checkbox message should be displayed");
Assert.assertEquals(p13DynamicControlsPage.getCheckBoxMessageText(),"It's gone!");
        p13DynamicControlsPage.addCheckbox();
        Assert.assertTrue(p13DynamicControlsPage.isCheckboxDisplayed(),"Checkbox should be displayed");
        Assert.assertEquals(p13DynamicControlsPage.getCheckboxLabelText(),"A checkbox");
        Assert.assertFalse(p13DynamicControlsPage.isCheckboxSelected(),"Checkbox should not be selected");
        Assert.assertEquals(p13DynamicControlsPage.getCheckboxButtonText(),"Remove");
        Assert.assertEquals(p13DynamicControlsPage.getCheckBoxMessageText(),"It's back!");
    }


    @Epic("Page Thirteen Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("validate the functionality of the input field and it's button enable and disable")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 14, description = "validate the functionality of the input field and it's button enable and disable")
    public void validateInputFieldAndButtonFunctionality(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        P13DynamicControlsPage p13DynamicControlsPage = new P13DynamicControlsPage(driver);
        p13DynamicControlsPage.enableInput();
        Assert.assertTrue(p13DynamicControlsPage.isInputEnabled(),"Input field should be enabled");
        Assert.assertEquals(p13DynamicControlsPage.getInputFieldMessageText(),"It's enabled!");
        Assert.assertEquals(p13DynamicControlsPage.getInputButtonText(),"Disable");
        p13DynamicControlsPage.enterText("Test");
        Assert.assertEquals(p13DynamicControlsPage.getInputText(),"Test");
        p13DynamicControlsPage.disableInput();
        Assert.assertFalse(p13DynamicControlsPage.isInputEnabled(),"Input field should be disabled");
        Assert.assertEquals(p13DynamicControlsPage.getInputFieldMessageText(),"It's disabled!");
        Assert.assertEquals(p13DynamicControlsPage.getInputButtonText(),"Enable");
        Assert.assertEquals(p13DynamicControlsPage.getInputText(),"Test");
    }
}

