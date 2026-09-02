package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;



public class P9DisappearingElementsPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Disappearing Elements page header
    private By headerLocator = By.tagName("h3");

    // Locates the error page heading displayed when navigation fails
    private By errorMessageLocator = By.tagName("h1");

    // Locates all navigation buttons
    private By buttonsLocator = By.tagName("li");

    // Locates the Home button
    private By homeButtonLocator = By.xpath("//a[text()='Home']");

    // Locates the About button
    private By aboutButtonLocator = By.xpath("//a[text()='About']");

    // Locates the Contact Us button
    private By contactUsButtonLocator = By.xpath("//a[text()='Contact Us']");

    // Locates the Portfolio button
    private By portfolioButtonLocator = By.xpath("//a[text()='Portfolio']");

    // Locates the Gallery button, which may randomly disappear
    private By galleryButtonLocator = By.xpath("//a[text()='Gallery']");


    // -------------------- Constructor --------------------

    public P9DisappearingElementsPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Returns the page header after waiting for it to become visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    // Returns the error message after waiting for it to become visible
    private WebElement getErrorMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessageLocator)
        );
    }

    // Returns all navigation buttons after waiting for the page to load
    private List<WebElement> getButtonsElements() {
        wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(buttonsLocator)
        );

        return driver.findElements(buttonsLocator);
    }

    // Returns the Home button after waiting for it to become clickable
    private WebElement getHomeButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(homeButtonLocator)
        );
    }

    // Returns the About button after waiting for it to become clickable
    private WebElement getAboutButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(aboutButtonLocator)
        );
    }

    // Returns the Contact Us button after waiting for it to become clickable
    private WebElement getContactUsButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(contactUsButtonLocator)
        );
    }

    // Returns the Portfolio button after waiting for it to become clickable
    private WebElement getPortfolioButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(portfolioButtonLocator)
        );
    }

    // Returns the Gallery button after waiting for it to become clickable
    private WebElement getGalleryButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(galleryButtonLocator)
        );
    }


    // -------------------- Page Validation --------------------

    // Returns the page header text
    @Step("Get Disappearing Elements page header")
    public String getHeaderText() {
        String headerText = getHeaderElement().getText();
        attachScreenshot("Get Disappearing Elements page header");
        return headerText;
    }

    // Returns the error message text
    @Step("Get error message")
    public String getErrorMessageText() {
        String errorMessage = getErrorMessageElement().getText();
        attachScreenshot("Get error message");
        return errorMessage;
    }

    // Returns the number of navigation buttons currently displayed
    @Step("Get navigation buttons count")
    public int getButtonsCount() {
        int buttonsCount = getButtonsElements().size();
        attachScreenshot("Get navigation buttons count");
        return buttonsCount;
    }

    // Verifies whether the Gallery button is currently displayed
    @Step("Verify Gallery button is displayed")
    public boolean isGalleryDisplayed() {
        boolean displayed = !driver.findElements(galleryButtonLocator).isEmpty();
        attachScreenshot("Verify Gallery button is displayed");
        return displayed;
    }

    // Returns the current page URL
    @Step("Get current page URL")
    public String getUrl() {
        String url = driver.getCurrentUrl();
        attachScreenshot("Get current page URL");
        return url;
    }


    // -------------------- Navigation Actions --------------------

    // Clicks the Home button
    @Step("Click Home button")
    public void clickHomeButton() {
        getHomeButtonElement().click();
        attachScreenshot("Click Home button");
    }

    // Clicks the About button
    @Step("Click About button")
    public void clickAboutButton() {
        getAboutButtonElement().click();
        attachScreenshot("Click About button");
    }

    // Clicks the Contact Us button
    @Step("Click Contact Us button")
    public void clickContactUsButton() {
        getContactUsButtonElement().click();
        attachScreenshot("Click Contact Us button");
    }

    // Clicks the Portfolio button
    @Step("Click Portfolio button")
    public void clickPortfolioButton() {
        getPortfolioButtonElement().click();
        attachScreenshot("Click Portfolio button");
    }

    // Clicks the Gallery button
    @Step("Click Gallery button")
    public void clickGalleryButton() {
        getGalleryButtonElement().click();
        attachScreenshot("Click Gallery button");
    }


    // -------------------- Page Actions --------------------

    // Refreshes the current page
    @Step("Refresh the page")
    public void refreshPage() {
        driver.navigate().refresh();

        // Wait for the page header to confirm the refresh has completed
        getHeaderElement();

        attachScreenshot("Refresh the page");
    }

    // Refreshes the page until the Gallery button appears
    @Step("Refresh page until Gallery button appears")
    public void refreshUntilGalleryAppears() {

        while (driver.findElements(galleryButtonLocator).isEmpty()) {
            driver.navigate().refresh();

            // Wait for the page to reload before checking again
            getHeaderElement();
        }

        attachScreenshot("Gallery button appeared after refresh");
    }


    // -------------------- Gallery Validation --------------------

    // Checks whether the Gallery button appears and disappears across multiple refreshes
    @Step("Verify Gallery button appears and disappears")
    public boolean galleryAppearsAndDisappears() {

        boolean galleryAppeared = false;
        boolean galleryDisappeared = false;

        for (int i = 0; i < 10; i++) {

            if (!driver.findElements(galleryButtonLocator).isEmpty()) {
                galleryAppeared = true;
            } else {
                galleryDisappeared = true;
            }

            driver.navigate().refresh();

            // Wait for the page to reload before the next check
            getHeaderElement();
        }

        boolean result = galleryAppeared && galleryDisappeared;

        attachScreenshot("Verify Gallery button appears and disappears");

        return result;
    }
}

