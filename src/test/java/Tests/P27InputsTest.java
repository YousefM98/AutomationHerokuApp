package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;



import pages.P26InfiniteScrollPage;
import pages.P27InputsPage;


public class P27InputsTest extends BaseTest {


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify Inputs page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that the Inputs page displays the correct header")
    public void verifyInputsPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();
        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        Assert.assertEquals(
                p27InputsPage.getHeaderText(),
                "Inputs"
        );
    }


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify numeric value can be entered")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that a numeric value can be entered in the number input")
    public void verifyNumberCanBeEntered() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();

        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        p27InputsPage.enterNumber("25");

        Assert.assertEquals(
                p27InputsPage.getNumberValue(),
                "25"
        );
    }


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify number input can be cleared")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that the number input can be cleared")
    public void verifyNumberInputCanBeCleared() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();

        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        p27InputsPage.enterNumber("25");

        p27InputsPage.clearNumberInput();

        Assert.assertEquals(
                p27InputsPage.getNumberValue(),
                ""
        );
    }


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify number can be increased using Arrow Up")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that the number value increases when Arrow Up is pressed")
    public void verifyNumberCanBeIncreased() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();

        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        p27InputsPage.enterNumber("10");

        p27InputsPage.increaseNumber();

        Assert.assertEquals(
                p27InputsPage.getNumberValue(),
                "11"
        );
    }


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify number can be decreased using Arrow Down")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that the number value decreases when Arrow Down is pressed")
    public void verifyNumberCanBeDecreased() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();

        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        p27InputsPage.enterNumber("10");

        p27InputsPage.decreaseNumber();

        Assert.assertEquals(
                p27InputsPage.getNumberValue(),
                "9"
        );
    }


    @Epic("Page Twenty Seven Epic")
    @Feature("Covering Inputs Feature")
    @Description("Verify negative number can be entered")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 27, description = "Verify that a negative number can be entered in the number input")
    public void verifyNegativeNumberCanBeEntered() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickInputs();

        P27InputsPage p27InputsPage =
                new P27InputsPage(driver);

        p27InputsPage.enterNumber("-5");

        Assert.assertEquals(
                p27InputsPage.getNumberValue(),
                "-5"
        );
    }
}