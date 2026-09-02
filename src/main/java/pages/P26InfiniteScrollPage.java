package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P26InfiniteScrollPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    private By paragraphsLocator = By.cssSelector(".jscroll-added");


    // -------------------- Constructor --------------------

    public P26InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private List<WebElement> getParagraphsElements() {
        return wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(paragraphsLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Infinite Scroll page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Infinite Scroll page header");

        return headerText;
    }

    @Step("Get loaded content count")
    public int getLoadedContentCount() {

        int contentCount = getParagraphsElements().size();

        attachScreenshot("Get loaded content count");

        return contentCount;
    }

    @Step("Verify Infinite Scroll content is displayed")
    public boolean isContentDisplayed() {

        boolean displayed =
                !getParagraphsElements().isEmpty();

        attachScreenshot("Verify Infinite Scroll content is displayed");

        return displayed;
    }

    @Step("Get page height")
    public long getPageHeight() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        long pageHeight =
                ((Number) js.executeScript(
                        "return document.body.scrollHeight;"
                )).longValue();

        attachScreenshot("Get page height");

        return pageHeight;
    }

// -------------------- Scroll Actions --------------------

    @Step("Scroll to the bottom of the page")
    public void scrollToBottom() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight);"
        );

        attachScreenshot("Scroll to the bottom of the page");
    }

    @Step("Scroll down and wait for additional content")
    public void scrollAndWaitForMoreContent() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        long initialPageHeight =
                ((Number) js.executeScript(
                        "return document.body.scrollHeight;"
                )).longValue();

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight);"
        );

        wait.until(driver -> {

            long newPageHeight =
                    ((Number) js.executeScript(
                            "return document.body.scrollHeight;"
                    )).longValue();

            return newPageHeight > initialPageHeight;
        });

        attachScreenshot("Scroll down and wait for additional content");
    }

    @Step("Scroll multiple times {numberOfScrolls}")
    public void scrollMultipleTimes(int numberOfScrolls) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        for (int i = 0; i < numberOfScrolls; i++) {

            long initialPageHeight =
                    ((Number) js.executeScript(
                            "return document.body.scrollHeight;"
                    )).longValue();

            js.executeScript(
                    "window.scrollTo(0, document.body.scrollHeight);"
            );

            wait.until(driver -> {

                long newPageHeight =
                        ((Number) js.executeScript(
                                "return document.body.scrollHeight;"
                        )).longValue();

                return newPageHeight > initialPageHeight;
            });
        }

        attachScreenshot("Scroll multiple times");
    }}