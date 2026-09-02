package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P39ShiftingContentPage;

import java.util.List;


public class P39ShiftingContentTest extends BaseTest {


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify Shifting Content page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that the Shifting Content page displays the correct header")
    public void verifyShiftingContentPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        Assert.assertEquals(
                p39ShiftingContentPage.getHeaderText(),
                "Shifting Content"
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify shifting content example links are displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that all Shifting Content example links are displayed")
    public void verifyShiftingContentExampleLinksAreDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        Assert.assertTrue(
                p39ShiftingContentPage.isMenuElementLinkDisplayed(),
                "Menu Element example link should be displayed"
        );

        Assert.assertTrue(
                p39ShiftingContentPage.isImageLinkDisplayed(),
                "Image example link should be displayed"
        );

        Assert.assertTrue(
                p39ShiftingContentPage.isListLinkDisplayed(),
                "List example link should be displayed"
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify shifting content examples count")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that the Shifting Content page contains three examples")
    public void verifyShiftingContentExamplesCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        Assert.assertEquals(
                p39ShiftingContentPage.getExamplesCount(),
                3
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify shifting content example names")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that the correct Shifting Content examples are available")
    public void verifyShiftingContentExampleNames() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        List<String> exampleNames =
                p39ShiftingContentPage.getExampleNames();

        Assert.assertTrue(
                exampleNames.contains(
                        "Example 1: Menu Element"
                )
        );

        Assert.assertTrue(
                exampleNames.contains(
                        "Example 2: An image"
                )
        );

        Assert.assertTrue(
                exampleNames.contains(
                        "Example 3: List"
                )
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify navigation to Menu Element example")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that clicking Menu Element opens the correct Shifting Content example")
    public void verifyNavigationToMenuElement() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        p39ShiftingContentPage.clickMenuElement();

        Assert.assertTrue(
                p39ShiftingContentPage
                        .getCurrentPageUrl()
                        .contains("/shifting_content/menu"),
                "URL should contain /shifting_content/menu"
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify navigation to Image example")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that clicking Image opens the correct Shifting Content example")
    public void verifyNavigationToImageExample() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        p39ShiftingContentPage.clickImage();

        Assert.assertTrue(
                p39ShiftingContentPage
                        .getCurrentPageUrl()
                        .contains("/shifting_content/image"),
                "URL should contain /shifting_content/image"
        );
    }


    @Epic("Page Thirty Nine Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Verify navigation to List example")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 39,
            description = "Verify that clicking List opens the correct Shifting Content example")
    public void verifyNavigationToListExample() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickShiftingContent();

        P39ShiftingContentPage p39ShiftingContentPage =
                new P39ShiftingContentPage(driver);

        p39ShiftingContentPage.clickList();

        Assert.assertTrue(
                p39ShiftingContentPage
                        .getCurrentPageUrl()
                        .contains("/shifting_content/list"),
                "URL should contain /shifting_content/list"
        );
    }
}