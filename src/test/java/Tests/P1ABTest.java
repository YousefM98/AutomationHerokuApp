package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P1ABPage;


public class P1ABTest extends BaseTest {

    @Epic("Page one Epic")
    @Feature("Covering A/B Feature")
    @Description("validate That AB testing Header is A/B Test Variation 1")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 2, description = "validate That AB testing Header is A/B Test Variation 1")
    public void validateABtestingHeader() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickABTesting();
        P1ABPage p1_AB_Page = new P1ABPage(driver);
        String headerText = p1_AB_Page.getHeaderText();

        Assert.assertTrue(
                headerText.equals("A/B Test Variation 1")
                        || headerText.equals("A/B Test Control"),
                "Header should be either A/B Test Variation 1 or A/B Test Control"
        );
    }
}
