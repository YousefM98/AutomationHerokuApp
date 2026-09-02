package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P33MultipleWindowsPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By clickHereLinkLocator =
            By.linkText("Click Here");

    private By newWindowHeaderLocator =
            By.xpath("/html/body/div/h3");


    // -------------------- Constructor --------------------

    public P33MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getClickHereLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(clickHereLinkLocator)
        );
    }

    private WebElement getNewWindowHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(newWindowHeaderLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Multiple Windows page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Multiple Windows page header");

        return headerText;
    }

    @Step("Verify Click Here link is displayed")
    public boolean isClickHereLinkDisplayed() {

        boolean displayed =
                getClickHereLinkElement().isDisplayed();

        attachScreenshot("Verify Click Here link is displayed");

        return displayed;
    }

    @Step("Get new window header")
    public String getNewWindowHeaderText() {

        String headerText =
                getNewWindowHeaderElement().getText();

        attachScreenshot("Get new window header");

        return headerText;
    }

    @Step("Get current window URL")
    public String getCurrentWindowUrl() {

        String currentUrl =
                driver.getCurrentUrl();

        attachScreenshot("Get current window URL");

        return currentUrl;
    }

    @Step("Get number of opened windows")
    public int getWindowCount() {

        int windowCount =
                driver.getWindowHandles().size();

        attachScreenshot("Get number of opened windows");

        return windowCount;
    }


    // -------------------- Window Actions --------------------

    @Step("Get current window handle")
    public String getCurrentWindowHandle() {

        String windowHandle =
                driver.getWindowHandle();

        attachScreenshot("Get current window handle");

        return windowHandle;
    }

    @Step("Click Click Here link")
    public void clickHere() {

        getClickHereLinkElement().click();

        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );

        attachScreenshot("Click Click Here link");
    }

    @Step("Switch to newly opened window")
    public void switchToNewWindow(String originalWindow) {

        for (String windowHandle : driver.getWindowHandles()) {

            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        attachScreenshot("Switch to newly opened window");
    }

    @Step("Close current window")
    public void closeCurrentWindow() {

        driver.close();
    }

    @Step("Switch back to original window")
    public void switchToOriginalWindow(String originalWindow) {

        driver.switchTo().window(originalWindow);

        attachScreenshot("Switch back to original window");
    }
}