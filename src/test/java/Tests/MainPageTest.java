package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;

public class MainPageTest extends BaseTest {
    @Epic("Main page Epic")
    @Feature("Covering A/B Feature")
    @Description("Validate that A/B testing function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "validate That ABtesting Is Clickable")
    public void validateThatABtestingIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickABTesting();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("abtest"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Add/Remove Elements Feature")
    @Description("Validate that Add/Remove Elements function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "validate That Add Remove Elements Is Clickable")
    public void validateThatAddRemoveElementsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickAddRemoveElements();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("add_remove_elements/"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Basic Auth Feature")
    @Description("Validate that Basic Auth function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "validate That Basic Auth Is Clickable")
    public void validateThatBasicAuthIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBasicAuth();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("basic_auth"));
    }
    @Epic("Main page Epic")
    @Feature("Covering Broken Images Feature")
    @Description("Validate that Broken Images function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Broken Images function is clickable")
    public void validateThatBrokenImagesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("broken_images"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Challenging Dom Feature")
    @Description("Validate that Challenging Dom function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Challenging Dom function is clickable")
    public void validateThatChallengingDomIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickChallengingDom();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("challenging_dom"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Check boxes Feature")
    @Description("Validate that Check boxes function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Check boxes function is clickable")
    public void validateThatCheckBoxesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickCheckBoxes();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("checkboxes"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Context menu Feature")
    @Description("Validate that Context menu function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Context menu function is clickable")
    public void validateThatContextMenuIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickContextMenu();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("context_menu"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Digest Authentication Feature")
    @Description("Validate that Digest Authentication function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Digest Authentication function is clickable")
    public void validateThatDigestAuthenticationIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDigestAuthentication();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("digest_auth"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Disappearing Elements Feature")
    @Description("Validate that Disappearing Elements function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Disappearing Elements function is clickable")
    public void validateThatDisappearingElementsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDisappearingElements();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("disappearing_elements"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Drag And Drop Feature")
    @Description("Validate that Drag And Drop function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Drag And Drop function is clickable")
    public void validateThatDragAndDropIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDragAndDrop();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("drag_and_drop"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Drop Down Feature")
    @Description("Validate that Drop Down function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Drop Down function is clickable")
    public void validateThatDropDownIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDropDown();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("dropdown"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Dynamic Content Feature")
    @Description("Validate that Dynamic Content function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Dynamic Content function is clickable")
    public void validateThatDynamicContentIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicContent();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("dynamic_content"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Dynamic Controls Feature")
    @Description("Validate that Dynamic Controls function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Dynamic Controls function is clickable")
    public void validateThatDynamicControlsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicControls();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("dynamic_controls"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Dynamic Loading Feature")
    @Description("Validate that Dynamic Loading function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Dynamic Loading function is clickable")
    public void validateThatDynamicLoadingIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicLoading();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("dynamic_loading"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Entry Ad Feature")
    @Description("Validate that Entry Ad function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Entry Ad function is clickable")
    public void validateThatEntryAdIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickEntryAd();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("entry_ad"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Exit Intent Feature")
    @Description("Validate that Exit Intent function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Exit Intent function is clickable")
    public void validateThatExitIntentIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickExitIntent();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("exit_intent"));
    }

    @Epic("Main page Epic")
    @Feature("Covering File Download Feature")
    @Description("Validate that File Download function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that File Download function is clickable")
    public void validateThatFileDownloadIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileDownload();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("download"));
    }

    @Epic("Main page Epic")
    @Feature("Covering File Upload Feature")
    @Description("Validate that File Upload function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that File Upload function is clickable")
    public void validateThatFileUploadIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileUpload();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("upload"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Floating Menu Feature")
    @Description("Validate that Floating Menu function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Floating Menu function is clickable")
    public void validateThatFloatingMenuIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFloatingMenu();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("floating_menu"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Forgot Password Feature")
    @Description("Validate that Forgot Password function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Forgot Password function is clickable")
    public void validateThatForgotPasswordIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickForgotPassword();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("forgot_password"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Form Authentication Feature")
    @Description("Validate that Form Authentication function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Form Authentication function is clickable")
    public void validateThatFormAuthenticationIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFormAuthentication();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("login"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Frames Feature")
    @Description("Validate that Frames function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Frames function is clickable")
    public void validateThatFramesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFrames();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("frames"));
    }

    @Epic("Main page Epic")
    @Feature("Covering GeoLocation Feature")
    @Description("Validate that GeoLocation function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that GeoLocation function is clickable")
    public void validateThatGeoLocationIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickGeoLocation();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("geolocation"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Horizontal Slider Feature")
    @Description("Validate that Horizontal Slider function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Horizontal Slider function is clickable")
    public void validateThatHorizontalSliderIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickHorizontalSlider();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("horizontal_slider"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Hovers Feature")
    @Description("Validate that Hovers function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Hovers function is clickable")
    public void validateThatHoversIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickHovers();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("hovers"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Infinite Scroll Feature")
    @Description("Validate that Infinite Scroll function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Infinite Scroll function is clickable")
    public void validateThatInfiniteScrollIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickInfiniteScroll();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("infinite_scroll"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Inputs Feature")
    @Description("Validate that Inputs function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Inputs function is clickable")
    public void validateThatInputsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickInputs();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("inputs"));
    }

    @Epic("Main page Epic")
    @Feature("Covering JQuery UI Menus Feature")
    @Description("Validate that JQuery UI Menus function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that JQuery UI Menus function is clickable")
    public void validateThatJQueryUIMenusIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickJQueryUiMenus();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("jqueryui/menu"));
    }

    @Epic("Main page Epic")
    @Feature("Covering JavaScript Alerts Feature")
    @Description("Validate that JavaScript Alerts function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that JavaScript Alerts function is clickable")
    public void validateThatJavaScriptAlertsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickJavaScriptAlerts();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("javascript_alerts"));
    }

    @Epic("Main page Epic")
    @Feature("Covering JavaScript onload event error Feature")
    @Description("Validate that JavaScript onload event error function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that JavaScript onload event error function is clickable")
    public void validateThatJavaScriptOnloadEventErrorIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickJavaScriptOnload();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("javascript_error"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Key Presses Feature")
    @Description("Validate that Key Presses function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Key Presses function is clickable")
    public void validateThatKeyPressesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickKeyPresses();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("key_presses"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Large & Deep DOM Feature")
    @Description("Validate that Large & Deep DOM function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Large & Deep DOM function is clickable")
    public void validateThatLargeAndDeepDOMIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickLargeDeepDom();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("large"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Multiple Windows Feature")
    @Description("Validate that Multiple Windows function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Multiple Windows function is clickable")
    public void validateThatMultipleWindowsIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickMultipleWindows();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("windows"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Nested Frames Feature")
    @Description("Validate that Nested Frames function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Nested Frames function is clickable")
    public void validateThatNestedFramesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickNestedFrames();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("nested_frames"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Notification Messages Feature")
    @Description("Validate that Notification Messages function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Notification Messages function is clickable")
    public void validateThatNotificationMessagesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickNotificationMessages();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("notification_message_rendered"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Redirect Link Feature")
    @Description("Validate that Redirect Link function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Redirect Link function is clickable")
    public void validateThatRedirectLinkIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickRedirectLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("redirector"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Validate that Secure File Download function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Secure File Download function is clickable")
    public void validateThatSecureFileDownloadIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickSecureFileDownload();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("download_secure"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Shadow DOM Feature")
    @Description("Validate that Shadow DOM function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Shadow DOM function is clickable")
    public void validateThatShadowDOMIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickShadowDom();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("shadowdom"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Shifting Content Feature")
    @Description("Validate that Shifting Content function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Shifting Content function is clickable")
    public void validateThatShiftingContentIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickShiftingContent();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("shifting_content"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Slow Resources Feature")
    @Description("Validate that Slow Resources function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Slow Resources function is clickable")
    public void validateThatSlowResourcesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickSlowResources();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("slow"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Sortable Data Tables Feature")
    @Description("Validate that Sortable Data Tables function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Sortable Data Tables function is clickable")
    public void validateThatSortableDataTablesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickSortableDataTables();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("tables"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Status Codes Feature")
    @Description("Validate that Status Codes function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Status Codes function is clickable")
    public void validateThatStatusCodesIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickStatusCodes();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("status_codes"));
    }

    @Epic("Main page Epic")
    @Feature("Covering Typos Feature")
    @Description("Validate that Typos function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that Typos function is clickable")
    public void validateThatTyposIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickTypos();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("typos"));
    }

    @Epic("Main page Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Validate that WYSIWYG Editor function is clickable")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 1, description = "Validate that WYSIWYG Editor function is clickable")
    public void validateThatWYSIWYGEditorIsClickable() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickWysiwygEditor();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("tinymce"));
    }
}
