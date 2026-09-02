package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P31KeyPressesPage;


public class P31KeyPressesTest extends BaseTest {


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Key Presses page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that the Key Presses page displays the correct header")
    public void verifyKeyPressesPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();
        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        Assert.assertEquals(
                p31KeyPressesPage.getHeaderText(),
                "Key Presses"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify key press input field is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that the key press input field is displayed")
    public void verifyInputFieldIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        Assert.assertTrue(
                p31KeyPressesPage.isInputFieldDisplayed(),
                "Key press input field should be displayed"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify letter key press")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing a letter key displays the correct result")
    public void verifyLetterKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.enterText("A");

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: A"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Enter key press")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Enter displays the correct result")
    public void verifyEnterKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.pressEnter();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: ENTER"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Escape key press")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Escape displays the correct result")
    public void verifyEscapeKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.pressEscape();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: ESCAPE"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Arrow Up key press")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Arrow Up displays the correct result")
    public void verifyArrowUpKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.pressArrowUp();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: UP"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Arrow Down key press")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Arrow Down displays the correct result")
    public void verifyArrowDownKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.pressArrowDown();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: DOWN"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Tab key press")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Tab displays the correct result")
    public void verifyTabKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.pressTab();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: TAB"
        );
    }


    @Epic("Page Thirty One Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Verify Backspace key press")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 31,
            description = "Verify that pressing Backspace displays the correct result")
    public void verifyBackspaceKeyPress() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickKeyPresses();

        P31KeyPressesPage p31KeyPressesPage =
                new P31KeyPressesPage(driver);

        p31KeyPressesPage.enterText("A");

        p31KeyPressesPage.pressBackspace();

        Assert.assertEquals(
                p31KeyPressesPage.getResultText(),
                "You entered: BACK_SPACE"
        );
    }
}