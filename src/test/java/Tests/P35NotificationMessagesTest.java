package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P35NotificationMessagesPage;


public class P35NotificationMessagesTest extends BaseTest {


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify Notification Messages page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that the Notification Messages page displays the correct header")
    public void verifyNotificationMessagesPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        Assert.assertEquals(
                p35NotificationMessagesPage.getHeaderText(),
                "Notification Message"
        );
    }


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify Click here link is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that the Click here link is displayed")
    public void verifyClickHereLinkIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        Assert.assertTrue(
                p35NotificationMessagesPage.isClickHereLinkDisplayed(),
                "Click here link should be displayed"
        );
    }


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify notification message appears after clicking the link")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that clicking the link displays a notification message")
    public void verifyNotificationMessageIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        p35NotificationMessagesPage.clickHere();

        Assert.assertTrue(
                p35NotificationMessagesPage.isNotificationMessageDisplayed(),
                "Notification message should be displayed"
        );
    }


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify notification message contains a valid result")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that the displayed notification message is one of the expected messages")
    public void verifyNotificationMessageIsValid() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        p35NotificationMessagesPage.clickHere();

        Assert.assertTrue(
                p35NotificationMessagesPage.isNotificationMessageValid(),
                "Notification message should contain one of the expected results"
        );
    }


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify notification message text is not empty")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that the displayed notification message contains text")
    public void verifyNotificationMessageIsNotEmpty() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        p35NotificationMessagesPage.clickHere();

        Assert.assertFalse(
                p35NotificationMessagesPage.getNotificationMessageText().isEmpty(),
                "Notification message should not be empty"
        );
    }


    @Epic("Page Thirty Five Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Verify another notification can be generated")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 35,
            description = "Verify that clicking the link again generates another valid notification")
    public void verifyAnotherNotificationCanBeGenerated() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickNotificationMessages();

        P35NotificationMessagesPage p35NotificationMessagesPage =
                new P35NotificationMessagesPage(driver);

        p35NotificationMessagesPage.clickHere();

        Assert.assertTrue(
                p35NotificationMessagesPage.isNotificationMessageValid(),
                "First notification message should be valid"
        );

        p35NotificationMessagesPage.clickHere();

        Assert.assertTrue(
                p35NotificationMessagesPage.isNotificationMessageValid(),
                "Second notification message should be valid"
        );
    }
}