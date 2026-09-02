package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P5ChallengingDomPage;

public class P5ChallengingDomTest extends BaseTest {


        @Epic("Page Five Epic")
        @Feature("Covering Challenging DOM Feature")
        @Description("validate That Challenging DOM Header is Challenging DOM")
        @Severity(SeverityLevel.BLOCKER)
        @Owner("Yousef Mohsen")
        @Test(groups = "smoke", priority = 6, description = "validate That Challenging DOM Header is Challenging DOM")
        public void validateBrokenImagesHeader() {
            P0_mainPage p0_mainPage = new P0_mainPage(driver);
            p0_mainPage.clickChallengingDom();
            P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
            Assert.assertEquals(p5ChallengingDomPage.getHeaderText(), "Challenging DOM");
        }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate That Page contains three buttons")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate That Page contains three buttons")
    public void validatePageContainsThreeButtons() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        Assert.assertEquals(p5ChallengingDomPage.getNumberOfButtons(), 3);
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate That Table is displayed")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate That Table is displayed")
    public void validateTabelIsDisplayed() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        Assert.assertTrue(p5ChallengingDomPage.isTableDisplayed(), "Table should be displayed");
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate That Table contains header, 10 rows and 7 columns")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate That Table contains header, 10 rows and 7 columns")
    public void validateTabelHeaderRowsColumns() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        Assert.assertTrue(p5ChallengingDomPage.isTableHeaderDisplayed(), "Table Header should be displayed");
Assert.assertEquals(p5ChallengingDomPage.getNumberOfTableRows(),10);
        Assert.assertEquals(p5ChallengingDomPage.getNumberOfTableColumns(),7);
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate That Every Table row contains delete and edit buttons")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate That Every Table row contains delete and edit buttons")
    public void validateRowsContainsDeleteAndEditButtons() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        Assert.assertEquals(p5ChallengingDomPage.getDeleteButtonText(),"delete");
        Assert.assertEquals(p5ChallengingDomPage.getEditButtonText(),"edit");
        Assert.assertEquals(p5ChallengingDomPage.getNumberOfDeleteButtons(),10);
        Assert.assertEquals(p5ChallengingDomPage.getNumberOfEditButtons(),10);
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate the functionality of delete button in table")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate the functionality of delete button in table")
    public void validateDeleteButtonFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        p5ChallengingDomPage.chooseRowToDelete(5);
        Assert.assertEquals(p5ChallengingDomPage.getUrl(),"https://the-internet.herokuapp.com/challenging_dom#delete");
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate the functionality of Edit button in table")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate the functionality of Edit button in table")
    public void validateEditButtonFunctionality() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        p5ChallengingDomPage.chooseRowToEdit(5);
        Assert.assertEquals(p5ChallengingDomPage.getUrl(),"https://the-internet.herokuapp.com/challenging_dom#edit");
    }

    @Epic("Page Five Epic")
    @Feature("Covering Challenging DOM Feature")
    @Description("validate that canvas is displayed with width 599 and height 200")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 6, description = "validate that canvas is displayed with width 599 and height 200")
    public void validateCanvasExistenceWidthHeight() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        P5ChallengingDomPage p5ChallengingDomPage = new P5ChallengingDomPage(driver);
        Assert.assertTrue(p5ChallengingDomPage.isCanvasDisplayed(),"Canvas should be displayed");
        Assert.assertEquals(p5ChallengingDomPage.getCanvasHeight(),"200");
        Assert.assertEquals(p5ChallengingDomPage.getCanvasWidth(),"599");
    }
    }



