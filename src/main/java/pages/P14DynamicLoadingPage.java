package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class P14DynamicLoadingPage extends BasePages {

    // =========================
    // Locators
    // =========================

    // Page header
    private By headerLocator = By.tagName("h3");

    // Start button
    private By startButtonLocator =
            By.cssSelector("#start button");

    // Loading indicator
    private By loadingIndicatorLocator =
            By.id("loading");

    // Loaded content
    private By loadedContentLocator =
            By.id("finish");

    // Loaded text
    private By loadedTextLocator =
            By.cssSelector("#finish h4");

    // Example 1
    private By example1Locator =
            By.xpath("//a[contains(text(),'Example 1')]");

    // Example 2
    private By example2Locator =
            By.xpath("//a[contains(text(),'Example 2')]");

    // =========================
    // Constructor
    // =========================

    public P14DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }


    // =========================
    // Page Methods
    // =========================

    /**
     * Returns the page header text.
     */
    @Step("Get page header text")
    public String getHeaderText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(headerLocator));

        return driver.findElement(headerLocator).getText();
    }

//open Example 1
@Step("Open Example 1")
public void openExample1() {
    wait.until(ExpectedConditions.elementToBeClickable(example1Locator));
    driver.findElement(example1Locator).click();
    attachScreenshot("Open Example 1");
}

    //open Example 2
    @Step("Open Example 2")
    public void openExample2() {
        wait.until(ExpectedConditions.elementToBeClickable(example2Locator));
        driver.findElement(example2Locator).click();
        attachScreenshot("Open Example 2");
    }

    /**
     * Checks whether the Start button is displayed.
     */
    @Step("Verify Start button is displayed")
    public boolean isStartButtonDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(startButtonLocator));

        boolean isDisplayed =
                driver.findElement(startButtonLocator).isDisplayed();

        attachScreenshot("Start Button");

        return isDisplayed;
    }


    /**
     * Clicks the Start button to begin loading.
     */
    @Step("Click Start button")
    public void clickStartButton() {

        WebElement startButton =
                wait.until(ExpectedConditions.elementToBeClickable(startButtonLocator));

        startButton.click();

        attachScreenshot("Loading Started");
    }


    /**
     * Checks whether the loading indicator is displayed.
     */
    @Step("Verify loading indicator is displayed")
    public boolean isLoadingDisplayed() {

        boolean isDisplayed =
                wait.until(ExpectedConditions.visibilityOfElementLocated(loadingIndicatorLocator))
                        .isDisplayed();

        return isDisplayed;
    }


    /**
     * Waits for the loading process to finish.
     */
    @Step("Wait for dynamic content to finish loading")
    public void waitForLoadingToFinish() {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                loadingIndicatorLocator
        ));
    }


    /**
     * Checks whether the loaded content is displayed.
     */
    @Step("Verify loaded content is displayed")
    public boolean isLoadedContentDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(loadedContentLocator));

        boolean isDisplayed =
                driver.findElement(loadedContentLocator).isDisplayed();

        attachScreenshot("Loaded Content");

        return isDisplayed;
    }


    /**
     * Returns the text displayed after loading finishes.
     */
    @Step("Get loaded content text")
    public String getLoadedText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(loadedTextLocator));

        return driver.findElement(loadedTextLocator).getText();
    }


    /**
     * Returns the current page URL.
     */
    @Step("Get current page URL")
    public String getURL() {

        return driver.getCurrentUrl();
    }
}
