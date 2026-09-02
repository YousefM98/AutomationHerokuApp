package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;

import pages.P19FloatingMenuPage;


import java.util.List;


public class P19FloatingMenuTest extends BaseTest {


    @Epic("Page Nineteen Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Verify Floating Menu page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the Floating Menu page displays the correct header")
    public void verifyFloatingMenuPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFloatingMenu();

        P19FloatingMenuPage p19FloatingMenuPage =
                new P19FloatingMenuPage(driver);

        Assert.assertEquals(
                p19FloatingMenuPage.getHeaderText(),
                "Floating Menu"
        );
    }


    @Epic("Page Nineteen Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Verify Floating Menu contains the correct number of menu items")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the Floating Menu contains four menu items")
    public void verifyFloatingMenuItemsCount() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFloatingMenu();

        P19FloatingMenuPage p19FloatingMenuPage =
                new P19FloatingMenuPage(driver);

        Assert.assertEquals(
                p19FloatingMenuPage.getMenuItemsCount(),
                4
        );
    }


    @Epic("Page Nineteen Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Verify Floating Menu contains the expected menu items")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the Floating Menu contains Home, News, Contact and About")
    public void verifyFloatingMenuItemsText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFloatingMenu();

        P19FloatingMenuPage p19FloatingMenuPage =
                new P19FloatingMenuPage(driver);

        List<String> expectedMenuItems =
                List.of(
                        "Home",
                        "News",
                        "Contact",
                        "About"
                );

        Assert.assertEquals(
                p19FloatingMenuPage.getMenuItemsText(),
                expectedMenuItems
        );
    }


    @Epic("Page Nineteen Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Verify Floating Menu remains visible after scrolling")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the Floating Menu remains displayed after scrolling to the bottom of the page")
    public void verifyFloatingMenuRemainsVisibleAfterScrolling() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFloatingMenu();

        P19FloatingMenuPage p19FloatingMenuPage =
                new P19FloatingMenuPage(driver);

        Assert.assertTrue(
                p19FloatingMenuPage.isFloatingMenuDisplayed(),
                "Floating menu should be displayed before scrolling"
        );

        p19FloatingMenuPage.scrollToBottom();

        Assert.assertTrue(
                p19FloatingMenuPage.isFloatingMenuDisplayed(),
                "Floating menu should remain displayed after scrolling"
        );
    }




    @Epic("Page Nineteen Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Verify Home menu item navigation")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that clicking Home updates the URL with the Home anchor")
    public void verifyHomeMenuItemNavigation() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFloatingMenu();

        P19FloatingMenuPage p19FloatingMenuPage =
                new P19FloatingMenuPage(driver);

        p19FloatingMenuPage.clickHome();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("#home"),
                "URL should contain #home"
        );
    }
}