package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;



import pages.P29JavaScriptAlertsPage;


public class P29JavaScriptAlertsTest extends BaseTest {


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Alerts page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that the JavaScript Alerts page displays the correct header")
    public void verifyJavaScriptAlertsPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getHeaderText(),
                "JavaScript Alerts"
        );
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Alert text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that the JavaScript Alert displays the correct text")
    public void verifyJavaScriptAlertText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        p29JavaScriptAlertsPage.clickJavaScriptAlertButton();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getAlertText(),
                "I am a JS Alert"
        );

        p29JavaScriptAlertsPage.acceptJavaScriptAlert();
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Alert can be accepted")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that accepting the JavaScript Alert displays the correct result")
    public void verifyJavaScriptAlertCanBeAccepted() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        p29JavaScriptAlertsPage.clickJavaScriptAlertButton();

        p29JavaScriptAlertsPage.acceptJavaScriptAlert();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getResultText(),
                "You successfully clicked an alert"
        );
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Confirm can be accepted")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that accepting the JavaScript Confirm displays the correct result")
    public void verifyJavaScriptConfirmCanBeAccepted() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        p29JavaScriptAlertsPage.clickJavaScriptConfirmButton();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getAlertText(),
                "I am a JS Confirm"
        );

        p29JavaScriptAlertsPage.acceptJavaScriptConfirm();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getResultText(),
                "You clicked: Ok"
        );
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Confirm can be dismissed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that dismissing the JavaScript Confirm displays the correct result")
    public void verifyJavaScriptConfirmCanBeDismissed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        p29JavaScriptAlertsPage.clickJavaScriptConfirmButton();

        p29JavaScriptAlertsPage.dismissJavaScriptConfirm();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getResultText(),
                "You clicked: Cancel"
        );
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Prompt accepts entered text")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that text can be entered and accepted in the JavaScript Prompt")
    public void verifyJavaScriptPromptAcceptsEnteredText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        String promptText =
                "Selenium Test";

        p29JavaScriptAlertsPage.clickJavaScriptPromptButton();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getAlertText(),
                "I am a JS prompt"
        );

        p29JavaScriptAlertsPage.enterTextInPrompt(promptText);

        p29JavaScriptAlertsPage.acceptJavaScriptPrompt();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getResultText(),
                "You entered: " + promptText
        );
    }


    @Epic("Page Twenty Nine Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Verify JavaScript Prompt can be dismissed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 29,
            description = "Verify that dismissing the JavaScript Prompt displays the correct result")
    public void verifyJavaScriptPromptCanBeDismissed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickJavaScriptAlerts();

        P29JavaScriptAlertsPage p29JavaScriptAlertsPage =
                new P29JavaScriptAlertsPage(driver);

        p29JavaScriptAlertsPage.clickJavaScriptPromptButton();

        p29JavaScriptAlertsPage.dismissJavaScriptPrompt();

        Assert.assertEquals(
                p29JavaScriptAlertsPage.getResultText(),
                "You entered: null"
        );
    }
}