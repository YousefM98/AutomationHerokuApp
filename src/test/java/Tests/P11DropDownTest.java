package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P11DropDownPage;

public class P11DropDownTest extends BaseTest {


    @Epic("Page ELeven Epic")
    @Feature("Covering Drop Down Feature")
    @Description("validate Drop Down Page Header text is Dropdown List")
    @Severity(SeverityLevel.MINOR)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 12, description = "validate Drop Down Page Header text is Dropdown List")
    public void validateDropDownHeaderText() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDropDown();
        P11DropDownPage p11DropDownPage = new P11DropDownPage(driver);
        Assert.assertEquals(p11DropDownPage.getHeaderText(),"Dropdown List");
    }

    @Epic("Page ELeven Epic")
    @Feature("Covering Drop Down Feature")
    @Description("validate that page contains a drop down list which contains three options")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 12, description = "validate that page contains a drop down list which contains three options")
    public void validateDropDownListExistAndContainsThreeOptions() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDropDown();
        P11DropDownPage p11DropDownPage = new P11DropDownPage(driver);
        Assert.assertTrue(p11DropDownPage.isDropdownDisplayed(),"Dropdown List Should be Displayed");
        Assert.assertEquals(p11DropDownPage.getDropdownValuesCount(),3);
    }

    @Epic("Page ELeven Epic")
    @Feature("Covering Drop Down Feature")
    @Description("validate the functionality of selecting options from dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 12, description = "validate the functionality of selecting options from dropdown list")
    public void validateDropDownListFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDropDown();
        P11DropDownPage p11DropDownPage = new P11DropDownPage(driver);
        Assert.assertEquals(p11DropDownPage.getSelectedDropdownValue(),"Please select an option");
        p11DropDownPage.selectDropdownValue("Option 1");
        Assert.assertEquals(p11DropDownPage.getSelectedDropdownValue(),"Option 1");
        p11DropDownPage.selectDropdownValue("Option 2");
        Assert.assertEquals(p11DropDownPage.getSelectedDropdownValue(),"Option 2");
    }
}

