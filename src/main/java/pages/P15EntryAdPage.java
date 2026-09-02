package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P15EntryAdPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Entry Ad page header
    private By headerLocator = By.xpath("//*[@id='content']/div/h3");

    // Locates the entry ad modal
    private By modalLocator = By.id("modal");

    // Locates the modal content
    private By modalContentLocator = By.id("modal-content");

    // Locates the close button inside the modal
    private By closeButtonLocator = By.xpath("//p[contains(text(),'Close')]");

private By restartButtonLocator = By.xpath("//*[@id='restart-ad']");
    // -------------------- Constructor --------------------

    public P15EntryAdPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Returns the Entry Ad page header after waiting for it to be visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    // Returns the entry ad modal after waiting for it to be visible
    private WebElement getModalElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(modalLocator)
        );
    }

    // Returns the modal content after waiting for it to be visible
    private WebElement getModalContentElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(modalContentLocator)
        );
    }

    // Returns the modal close button after waiting for it to become clickable
    private WebElement getCloseButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(closeButtonLocator)
        );
    }
    private WebElement getRestartButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(restartButtonLocator)
        );
    }


    // -------------------- Page Validation --------------------

    // Returns the Entry Ad page header text
    @Step("Get Entry Ad page header")
    public String getHeaderText() {
        String headerText = getHeaderElement().getText();
        attachScreenshot("Get Entry Ad page header");
        return headerText;
    }


    // Verifies that the entry ad modal is displayed
    @Step("Verify Entry Ad modal is displayed")
    public boolean isModalDisplayed() {
        List<WebElement> modalElements = driver.findElements(modalLocator);

        boolean displayed = !modalElements.isEmpty()
                && modalElements.get(0).isDisplayed();

        attachScreenshot("Verify Entry Ad modal is displayed");

        return displayed;
    }

    // Returns the text displayed inside the entry ad modal
    @Step("Get Entry Ad modal text")
    public String getModalText() {
        String modalText = getModalContentElement().getText();
        attachScreenshot("Get Entry Ad modal text");
        return modalText;
    }

    // Verifies that the modal close button is displayed
    @Step("Verify modal close button is displayed")
    public boolean isCloseButtonDisplayed() {
        boolean displayed = getCloseButtonElement().isDisplayed();
        attachScreenshot("Verify modal close button is displayed");
        return displayed;
    }


    // -------------------- Modal Actions --------------------

    // Closes the Entry Ad modal
    @Step("Close Entry Ad modal")
    public void closeModal() {
        getCloseButtonElement().click();

        // Wait until the modal is no longer displayed
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(modalLocator)
        );

        attachScreenshot("Close Entry Ad modal");
    }


    // -------------------- Page Actions --------------------

    // Refreshes the Entry Ad page
    @Step("Refresh Entry Ad page")
    public void refreshPage() {
        driver.navigate().refresh();

        // Wait for the page header to confirm that the page has loaded
        getHeaderElement();

        attachScreenshot("Refresh Entry Ad page");
    }

    // Waits until the Entry Ad modal becomes visible
    @Step("Wait for Entry Ad modal to appear")
    public void waitForModal() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(modalLocator)
        );

        attachScreenshot("Entry Ad modal appeared");
    }

    @Step("Click Restart")
    public void clickRestart() {
       driver.findElement(restartButtonLocator).click();

        attachScreenshot("Click Restart");
    }

}

