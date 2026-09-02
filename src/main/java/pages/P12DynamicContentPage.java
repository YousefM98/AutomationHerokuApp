package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class P12DynamicContentPage extends BasePages {

    // =========================
    // Locators
    // =========================

    // Page header
    private By headerLocator =
            By.tagName("h3");

    // Images displayed in the dynamic content rows
    private By imagesLocator =
            By.cssSelector(
                    "#content .row .large-2.columns img"
            );

    // Paragraphs displayed in the dynamic content rows
    private By paragraphsLocator =
            By.cssSelector(
                    "#content .row .large-2.columns + .large-10.columns"
            );

    // "click here" link used to enable static content
    private By clickHereLinkLocator =
            By.linkText("click here");


    // =========================
    // Constructor
    // =========================

    public P12DynamicContentPage(WebDriver driver) {
        super(driver);
    }


    // =========================
    // Elements
    // =========================

    /**
     * Returns the page header element.
     */
    private WebElement getHeaderElement() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        headerLocator
                )
        );
    }


    /**
     * Returns the "click here" link element.
     */
    private WebElement getClickHereLinkElement() {

        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        clickHereLinkLocator
                )
        );
    }


    // =========================
    // Page Validation
    // =========================

    /**
     * Returns the page header text.
     */
    @Step("Get page header text")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Dynamic Content Header Text"
        );

        return headerText;
    }


    /**
     * Returns the number of images displayed
     * in the dynamic content section.
     */
    @Step("Get dynamic content images count")
    public int getImagesCount() {

        int imagesCount =
                wait.until(
                        ExpectedConditions.presenceOfAllElementsLocatedBy(
                                imagesLocator
                        )
                ).size();

        attachScreenshot(
                "Get Dynamic Content Images Count"
        );

        return imagesCount;
    }


    /**
     * Returns the number of paragraphs displayed
     * in the dynamic content section.
     */
    @Step("Get dynamic content paragraphs count")
    public int getParagraphsCount() {

        int paragraphsCount =
                wait.until(
                        ExpectedConditions.presenceOfAllElementsLocatedBy(
                                paragraphsLocator
                        )
                ).size();

        attachScreenshot(
                "Get Dynamic Content Paragraphs Count"
        );

        return paragraphsCount;
    }


    /**
     * Checks whether the "click here" link is displayed.
     */
    @Step("Verify click here link is displayed")
    public boolean isClickHereDisplayed() {

        boolean isDisplayed =
                getClickHereLinkElement().isDisplayed();

        attachScreenshot(
                "Verify Click Here Link Is Displayed"
        );

        return isDisplayed;
    }


    /**
     * Returns the current page URL.
     */
    @Step("Get current page URL")
    public String getURL() {

        String currentURL =
                driver.getCurrentUrl();

        attachScreenshot(
                "Get Dynamic Content Page URL"
        );

        return currentURL;
    }


    // =========================
    // Actions
    // =========================

    /**
     * Clicks the "click here" link.
     *
     * This enables the static-content mode where
     * the first two rows remain unchanged while
     * the third row remains dynamic.
     */
    @Step("Click click here link")
    public void clickHereLink() {

        getClickHereLinkElement().click();

        // Wait until the static-content URL is loaded
        wait.until(
                ExpectedConditions.urlContains(
                        "static"
                )
        );

        // Wait until all three images are available
        wait.until(driver ->
                driver.findElements(
                        imagesLocator
                ).size() >= 3
        );

        // Wait until all three paragraphs are available
        wait.until(driver ->
                driver.findElements(
                        paragraphsLocator
                ).size() >= 3
        );

        attachScreenshot(
                "After Clicking Click Here"
        );
    }


    // =========================
    // Dynamic Content Validation
    // =========================

    /**
     * Refreshes the page multiple times and verifies
     * that the dynamic images and paragraphs change.
     */
    @Step("Verify all dynamic content changes after refresh")
    public boolean allContentKeepsChangingAfterRefresh() {

        boolean allContentChanged = true;

        for (int i = 0; i < 10; i++) {

            // Store current images before refresh
            List<String> oldImages =
                    wait.until(
                                    ExpectedConditions.presenceOfAllElementsLocatedBy(
                                            imagesLocator
                                    )
                            )
                            .stream()
                            .map(element ->
                                    element.getAttribute("src"))
                            .toList();

            // Store current paragraphs before refresh
            List<String> oldParagraphs =
                    wait.until(
                                    ExpectedConditions.presenceOfAllElementsLocatedBy(
                                            paragraphsLocator
                                    )
                            )
                            .stream()
                            .map(WebElement::getText)
                            .toList();

            // Refresh the page
            driver.navigate().refresh();

            // Wait until all three images are available
            wait.until(driver ->
                    driver.findElements(
                            imagesLocator
                    ).size() >= 3
            );

            // Wait until all three paragraphs are available
            wait.until(driver ->
                    driver.findElements(
                            paragraphsLocator
                    ).size() >= 3
            );

            // Wait until at least some dynamic content changes
            wait.until(driver -> {

                List<String> currentImages =
                        driver.findElements(
                                        imagesLocator
                                )
                                .stream()
                                .map(element ->
                                        element.getAttribute("src"))
                                .toList();

                List<String> currentParagraphs =
                        driver.findElements(
                                        paragraphsLocator
                                )
                                .stream()
                                .map(WebElement::getText)
                                .toList();

                return !oldImages.equals(
                        currentImages
                )
                        ||
                        !oldParagraphs.equals(
                                currentParagraphs
                        );
            });

            // Store images after refresh
            List<String> newImages =
                    driver.findElements(
                                    imagesLocator
                            )
                            .stream()
                            .map(element ->
                                    element.getAttribute("src"))
                            .toList();

            // Store paragraphs after refresh
            List<String> newParagraphs =
                    driver.findElements(
                                    paragraphsLocator
                            )
                            .stream()
                            .map(WebElement::getText)
                            .toList();

            // Both image content and paragraph content
            // should not remain completely unchanged
            if (oldImages.equals(newImages)
                    ||
                    oldParagraphs.equals(newParagraphs)) {

                allContentChanged = false;
                break;
            }
        }

        attachScreenshot(
                "Verify All Dynamic Content Changes After Refresh"
        );

        return allContentChanged;
    }


    /**
     * Verifies across ten page refreshes that:
     *
     * - First image remains unchanged
     * - Second image remains unchanged
     * - Third image changes
     * - First paragraph remains unchanged
     * - Second paragraph remains unchanged
     * - Third paragraph changes
     *
     * This method should be called after clickHereLink().
     */
    @Step("Verify only third dynamic content changes")
    public boolean onlyThirdContentKeepsChanging() {
        // Store the initial images
        List<String> firstImages = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(imagesLocator)) .stream() .map(element -> element.getAttribute("src")) .toList();
        // Store the initial paragraphs
        List<String> firstParagraphs = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(paragraphsLocator)) .stream() .map(WebElement::getText) .toList();
        // Click the link to change the dynamic content
        clickHereLink();
        // Wait until the third paragraph changes
        wait.until(driver -> { List<WebElement> paragraphs = driver.findElements(paragraphsLocator);
            return paragraphs.size() >= 3 && !paragraphs.get(2) .getText() .equals(firstParagraphs.get(2)); });
        // Get the new images
        List<String> secondImages = driver.findElements(imagesLocator) .stream() .map(element -> element.getAttribute("src")) .toList();
        //Get the new paragraphs
        List<String> secondParagraphs = driver.findElements(paragraphsLocator) .stream() .map(WebElement::getText) .toList();
        // Verify that:
        // First image remains unchanged
        // Second image remains unchanged
        // hird image changes
        // - First paragraph remains unchanged
        // - Second paragraph remains unchanged
        // - Third paragraph changes
        boolean onlyThirdContentChanged = firstImages.get(0).equals(secondImages.get(0)) && firstImages.get(1).equals(secondImages.get(1)) && !firstImages.get(2).equals(secondImages.get(2)) && firstParagraphs.get(0).equals(secondParagraphs.get(0)) && firstParagraphs.get(1).equals(secondParagraphs.get(1)) && !firstParagraphs.get(2).equals(secondParagraphs.get(2));
        attachScreenshot("Third Dynamic Content Changed"); return onlyThirdContentChanged; }
    }
