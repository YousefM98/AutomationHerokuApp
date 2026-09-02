
package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P0_mainPage extends BasePages {

    // -------------------- Navigation Locators --------------------

    private By abTestLocator = By.linkText("A/B Testing");
    private By addRemoveElementsLocator = By.linkText("Add/Remove Elements");
    private By basicAuthLocator = By.linkText("Basic Auth");
    private By brokenImagesLocator = By.linkText("Broken Images");
    private By challengingDomLocator = By.linkText("Challenging DOM");
    private By checkBoxesLocator = By.linkText("Checkboxes");
    private By contextMenuLocator = By.linkText("Context Menu");
    private By digestAuthenticationLocator = By.linkText("Digest Authentication");
    private By disappearingElementsLocator = By.linkText("Disappearing Elements");
    private By dragAndDropLocator = By.linkText("Drag and Drop");
    private By dropDownLocator = By.linkText("Dropdown");
    private By dynamicContentLocator = By.linkText("Dynamic Content");
    private By dynamicControlsLocator = By.linkText("Dynamic Controls");
    private By dynamicLoadingLocator = By.linkText("Dynamic Loading");
    private By entryAdLocator = By.linkText("Entry Ad");
    private By exitIntentLocator = By.linkText("Exit Intent");
    private By fileDownloadLocator = By.linkText("File Download");
    private By fileUploadLocator = By.linkText("File Upload");
    private By floatingMenuLocator = By.linkText("Floating Menu");
    private By forgotPasswordLocator = By.linkText("Forgot Password");
    private By formAuthenticationLocator = By.linkText("Form Authentication");
    private By framesLocator = By.linkText("Frames");
    private By geoLocationLocator = By.linkText("Geolocation");
    private By horizontalSliderLocator = By.linkText("Horizontal Slider");
    private By hoversLocator = By.linkText("Hovers");
    private By infiniteScrollLocator = By.linkText("Infinite Scroll");
    private By inputsLocator = By.linkText("Inputs");
    private By jQueryUiMenusLocator = By.linkText("JQuery UI Menus");
    private By javaScriptAlertsLocator = By.linkText("JavaScript Alerts");
    private By javaScriptOnloadEventErrorLocator =
            By.linkText("JavaScript onload event error");
    private By keyPressesLocator = By.linkText("Key Presses");
    private By largeDeepDomLocator = By.linkText("Large & Deep DOM");
    private By multipleWindowsLocator = By.linkText("Multiple Windows");
    private By nestedFramesLocator = By.linkText("Nested Frames");
    private By notificationMessagesLocator = By.linkText("Notification Messages");
    private By redirectLinkLocator = By.linkText("Redirect Link");
    private By secureFileDownloadLocator = By.linkText("Secure File Download");
    private By shadowDomLocator = By.linkText("Shadow DOM");
    private By shiftingContentLocator = By.linkText("Shifting Content");
    private By slowResourcesLocator = By.linkText("Slow Resources");
    private By sortableDataTablesLocator = By.linkText("Sortable Data Tables");
    private By statusCodesLocator = By.linkText("Status Codes");
    private By typosLocator = By.linkText("Typos");
    private By wysiwygEditorLocator = By.linkText("WYSIWYG Editor");


    // -------------------- Constructor --------------------

    public P0_mainPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Element Getters --------------------

    private WebElement getABtestElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(abTestLocator)
        );
    }

    private WebElement getAddRemoveElementsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(addRemoveElementsLocator)
        );
    }

    private WebElement getBasicAuthElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(basicAuthLocator)
        );
    }

    private WebElement getBrokenImagesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(brokenImagesLocator)
        );
    }

    private WebElement getChallengingDomElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(challengingDomLocator)
        );
    }

    private WebElement getCheckBoxesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(checkBoxesLocator)
        );
    }

    private WebElement getContextMenuElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(contextMenuLocator)
        );
    }

    private WebElement getDigestAuthenticationElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(digestAuthenticationLocator)
        );
    }

    private WebElement getDisappearingElementsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(disappearingElementsLocator)
        );
    }

    private WebElement getDragAndDropElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(dragAndDropLocator)
        );
    }

    private WebElement getDropDownElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(dropDownLocator)
        );
    }

    private WebElement getDynamicContentElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(dynamicContentLocator)
        );
    }

    private WebElement getDynamicControlsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(dynamicControlsLocator)
        );
    }

    private WebElement getDynamicLoadingElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(dynamicLoadingLocator)
        );
    }

    private WebElement getEntryAdElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(entryAdLocator)
        );
    }

    private WebElement getExitIntentElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(exitIntentLocator)
        );
    }

    private WebElement getFileDownloadElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(fileDownloadLocator)
        );
    }

    private WebElement getFileUploadElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(fileUploadLocator)
        );
    }

    private WebElement getFloatingMenuElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(floatingMenuLocator)
        );
    }

    private WebElement getForgotPasswordElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(forgotPasswordLocator)
        );
    }

    private WebElement getFormAuthenticationElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(formAuthenticationLocator)
        );
    }

    private WebElement getFramesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(framesLocator)
        );
    }

    private WebElement getGeoLocationElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(geoLocationLocator)
        );
    }

    private WebElement getHorizontalSliderElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(horizontalSliderLocator)
        );
    }

    private WebElement getHoversElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(hoversLocator)
        );
    }

    private WebElement getInfiniteScrollElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(infiniteScrollLocator)
        );
    }

    private WebElement getInputsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(inputsLocator)
        );
    }

    private WebElement getJQueryUiMenusElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(jQueryUiMenusLocator)
        );
    }

    private WebElement getJavaScriptAlertsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(javaScriptAlertsLocator)
        );
    }

    private WebElement getJavaScriptOnloadEventErrorElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        javaScriptOnloadEventErrorLocator
                )
        );
    }

    private WebElement getKeyPressesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(keyPressesLocator)
        );
    }

    private WebElement getLargeDeepDomElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(largeDeepDomLocator)
        );
    }

    private WebElement getMultipleWindowsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(multipleWindowsLocator)
        );
    }

    private WebElement getNestedFramesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(nestedFramesLocator)
        );
    }

    private WebElement getNotificationMessagesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(notificationMessagesLocator)
        );
    }

    private WebElement getRedirectLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(redirectLinkLocator)
        );
    }

    private WebElement getSecureFileDownloadElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(secureFileDownloadLocator)
        );
    }

    private WebElement getShadowDomElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(shadowDomLocator)
        );
    }

    private WebElement getShiftingContentElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(shiftingContentLocator)
        );
    }

    private WebElement getSlowResourcesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(slowResourcesLocator)
        );
    }

    private WebElement getSortableDataTablesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(sortableDataTablesLocator)
        );
    }

    private WebElement getStatusCodesElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(statusCodesLocator)
        );
    }

    private WebElement getTyposElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(typosLocator)
        );
    }

    private WebElement getWysiwygEditorElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(wysiwygEditorLocator)
        );
    }


    // -------------------- Navigation Actions --------------------

    // Opens the A/B Testing page
    @Step("Click A/B Testing")
    public void clickABTesting() {
        getABtestElement().click();
        attachScreenshot("Click A/B Testing");
    }

    // Opens the Add/Remove Elements page
    @Step("Click Add/Remove Elements")
    public void clickAddRemoveElements() {
        getAddRemoveElementsElement().click();
        attachScreenshot("Click Add/Remove Elements");
    }

    // Opens the Basic Auth page
    @Step("Click Basic Auth")
    public void clickBasicAuth() {
        getBasicAuthElement().click();
        attachScreenshot("Click Basic Auth");
    }

    // Opens the Broken Images page
    @Step("Click Broken Images")
    public void clickBrokenImages() {
        getBrokenImagesElement().click();
        attachScreenshot("Click Broken Images");
    }

    // Opens the Challenging DOM page
    @Step("Click Challenging DOM")
    public void clickChallengingDom() {
        getChallengingDomElement().click();
        attachScreenshot("Click Challenging DOM");
    }

    // Opens the Checkboxes page
    @Step("Click Checkboxes")
    public void clickCheckBoxes() {
        getCheckBoxesElement().click();
        attachScreenshot("Click Checkboxes");
    }

    // Opens the Context Menu page
    @Step("Click Context Menu")
    public void clickContextMenu() {
        getContextMenuElement().click();
        attachScreenshot("Click Context Menu");
    }

    // Opens the Digest Authentication page
    @Step("Click Digest Authentication")
    public void clickDigestAuthentication() {
        getDigestAuthenticationElement().click();
        attachScreenshot("Click Digest Authentication");
    }

    // Opens the Disappearing Elements page
    @Step("Click Disappearing Elements")
    public void clickDisappearingElements() {
        getDisappearingElementsElement().click();
        attachScreenshot("Click Disappearing Elements");
    }

    // Opens the Drag and Drop page
    @Step("Click Drag and Drop")
    public void clickDragAndDrop() {
        getDragAndDropElement().click();
        attachScreenshot("Click Drag and Drop");
    }

    // Opens the Dropdown page
    @Step("Click Dropdown")
    public void clickDropDown() {
        getDropDownElement().click();
        attachScreenshot("Click Dropdown");
    }

    // Opens the Dynamic Content page
    @Step("Click Dynamic Content")
    public void clickDynamicContent() {
        getDynamicContentElement().click();
        attachScreenshot("Click Dynamic Content");
    }

    // Opens the Dynamic Controls page
    @Step("Click Dynamic Controls")
    public void clickDynamicControls() {
        getDynamicControlsElement().click();
        attachScreenshot("Click Dynamic Controls");
    }

    // Opens the Dynamic Loading page
    @Step("Click Dynamic Loading")
    public void clickDynamicLoading() {
        getDynamicLoadingElement().click();
        attachScreenshot("Click Dynamic Loading");
    }

    // Opens the Entry Ad page
    @Step("Click Entry Ad")
    public void clickEntryAd() {
        getEntryAdElement().click();
        attachScreenshot("Click Entry Ad");
    }

    // Opens the Exit Intent page
    @Step("Click Exit Intent")
    public void clickExitIntent() {
        getExitIntentElement().click();
        attachScreenshot("Click Exit Intent");
    }

    // Opens the File Download page
    @Step("Click File Download")
    public void clickFileDownload() {
        getFileDownloadElement().click();
        attachScreenshot("Click File Download");
    }

    // Opens the File Upload page
    @Step("Click File Upload")
    public void clickFileUpload() {
        getFileUploadElement().click();
        attachScreenshot("Click File Upload");
    }

    // Opens the Floating Menu page
    @Step("Click Floating Menu")
    public void clickFloatingMenu() {
        getFloatingMenuElement().click();
        attachScreenshot("Click Floating Menu");
    }

    // Opens the Forgot Password page
    @Step("Click Forgot Password")
    public void clickForgotPassword() {
        getForgotPasswordElement().click();
        attachScreenshot("Click Forgot Password");
    }

    // Opens the Form Authentication page
    @Step("Click Form Authentication")
    public void clickFormAuthentication() {
        getFormAuthenticationElement().click();
        attachScreenshot("Click Form Authentication");
    }

    // Opens the Frames page
    @Step("Click Frames")
    public void clickFrames() {
        getFramesElement().click();
        attachScreenshot("Click Frames");
    }

    // Opens the Geolocation page
    @Step("Click Geolocation")
    public void clickGeoLocation() {
        getGeoLocationElement().click();
        attachScreenshot("Click Geolocation");
    }

    // Opens the Horizontal Slider page
    @Step("Click Horizontal Slider")
    public void clickHorizontalSlider() {
        getHorizontalSliderElement().click();
        attachScreenshot("Click Horizontal Slider");
    }

    // Opens the Hovers page
    @Step("Click Hovers")
    public void clickHovers() {
        getHoversElement().click();
        attachScreenshot("Click Hovers");
    }

    // Opens the Infinite Scroll page
    @Step("Click Infinite Scroll")
    public void clickInfiniteScroll() {
        getInfiniteScrollElement().click();
        attachScreenshot("Click Infinite Scroll");
    }

    // Opens the Inputs page
    @Step("Click Inputs")
    public void clickInputs() {
        getInputsElement().click();
        attachScreenshot("Click Inputs");
    }

    // Opens the JQuery UI Menus page
    @Step("Click JQuery UI Menus")
    public void clickJQueryUiMenus() {
        getJQueryUiMenusElement().click();
        attachScreenshot("Click JQuery UI Menus");
    }

    // Opens the JavaScript Alerts page
    @Step("Click JavaScript Alerts")
    public void clickJavaScriptAlerts() {
        getJavaScriptAlertsElement().click();
        attachScreenshot("Click JavaScript Alerts");
    }

    // Opens the JavaScript onload event error page
    @Step("Click JavaScript onload event error")
    public void clickJavaScriptOnload() {
        getJavaScriptOnloadEventErrorElement().click();
        attachScreenshot("Click JavaScript onload event error");
    }

    // Opens the Key Presses page
    @Step("Click Key Presses")
    public void clickKeyPresses() {
        getKeyPressesElement().click();
        attachScreenshot("Click Key Presses");
    }

    // Opens the Large & Deep DOM page
    @Step("Click Large & Deep DOM")
    public void clickLargeDeepDom() {
        getLargeDeepDomElement().click();
        attachScreenshot("Click Large & Deep DOM");
    }

    // Opens the Multiple Windows page
    @Step("Click Multiple Windows")
    public void clickMultipleWindows() {
        getMultipleWindowsElement().click();
        attachScreenshot("Click Multiple Windows");
    }

    // Opens the Nested Frames page
    @Step("Click Nested Frames")
    public void clickNestedFrames() {
        getNestedFramesElement().click();
        attachScreenshot("Click Nested Frames");
    }

    // Opens the Notification Messages page
    @Step("Click Notification Messages")
    public void clickNotificationMessages() {
        getNotificationMessagesElement().click();
        attachScreenshot("Click Notification Messages");
    }

    // Opens the Redirect Link page
    @Step("Click Redirect Link")
    public void clickRedirectLink() {
        getRedirectLinkElement().click();
        attachScreenshot("Click Redirect Link");
    }

    // Opens the Secure File Download page
    @Step("Click Secure File Download")
    public void clickSecureFileDownload() {
        getSecureFileDownloadElement().click();
        attachScreenshot("Click Secure File Download");
    }

    // Opens the Shadow DOM page
    @Step("Click Shadow DOM")
    public void clickShadowDom() {
        getShadowDomElement().click();
        attachScreenshot("Click Shadow DOM");
    }

    // Opens the Shifting Content page
    @Step("Click Shifting Content")
    public void clickShiftingContent() {
        getShiftingContentElement().click();
        attachScreenshot("Click Shifting Content");
    }

    // Opens the Slow Resources page
    @Step("Click Slow Resources")
    public void clickSlowResources() {
        getSlowResourcesElement().click();
        attachScreenshot("Click Slow Resources");
    }

    // Opens the Sortable Data Tables page
    @Step("Click Sortable Data Tables")
    public void clickSortableDataTables() {
        getSortableDataTablesElement().click();
        attachScreenshot("Click Sortable Data Tables");
    }

    // Opens the Status Codes page
    @Step("Click Status Codes")
    public void clickStatusCodes() {
        getStatusCodesElement().click();
        attachScreenshot("Click Status Codes");
    }

    // Opens the Typos page
    @Step("Click Typos")
    public void clickTypos() {
        getTyposElement().click();
        attachScreenshot("Click Typos");
    }

    // Opens the WYSIWYG Editor page
    @Step("Click WYSIWYG Editor")
    public void clickWysiwygEditor() {
        getWysiwygEditorElement().click();
        attachScreenshot("Click WYSIWYG Editor");
    }
}

