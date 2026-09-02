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



public class P16ExitIntentPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Exit Intent page header
    private By headerLocator = By.xpath("//*[@id='content']/div/h3");

    // Locates the Exit Intent modal
    private By modalLocator = By.id("ouibounce-modal");

    // Locates the modal content
    private By modalContentLocator = By.xpath("//h3[text()='This is a modal window']");

    // Locates the modal close button
    private By closeButtonLocator = By.xpath("//p[contains(text(),'Close')]");


    // -------------------- Constructor --------------------

    public P16ExitIntentPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Returns the Exit Intent page header after waiting for it to be visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    // Returns the Exit Intent modal after waiting for it to become visible
    private WebElement getModalElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(modalLocator)
        );
    }

    // Returns the modal content after waiting for it to become visible
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


    // -------------------- Page Validation --------------------

    // Returns the Exit Intent page header text
    @Step("Get Exit Intent page header")
    public String getHeaderText() {
        String headerText = getHeaderElement().getText();
        attachScreenshot("Get Exit Intent page header");
        return headerText;
    }

    // Verifies whether the Exit Intent modal is currently displayed
    @Step("Verify Exit Intent modal is displayed")
    public boolean isModalDisplayed() {

        List<WebElement> modalElements = driver.findElements(modalLocator);

        boolean displayed = !modalElements.isEmpty()
                && modalElements.get(0).isDisplayed();

        attachScreenshot("Verify Exit Intent modal is displayed");

        return displayed;
    }

    // Returns the text displayed inside the Exit Intent modal
    @Step("Get Exit Intent modal text")
    public String getModalText() {
        String modalText = getModalContentElement().getText();
        attachScreenshot("Get Exit Intent modal text");
        return modalText;
    }


    // -------------------- Exit Intent Actions --------------------


// Triggers the Exit Intent event by dispatching a mouseleave event from the top of the viewport
    @Step("Trigger Exit Intent modal")
    public void triggerExitIntent() {

        // Wait for the Exit Intent page to load
        getHeaderElement();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        // Give the Exit Intent listener time to initialize
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Dispatch mouseleave from the top of the viewport
        javascriptExecutor.executeScript(
                "document.documentElement.dispatchEvent(" +
                        "new MouseEvent('mouseleave', {" +
                        "bubbles: true," +
                        "cancelable: true," +
                        "clientY: 0" +
                        "}));"
        );

        // Wait for the modal to become visible
        getModalElement();

        attachScreenshot("Trigger Exit Intent modal");
    }



    // Closes the Exit Intent modal
    @Step("Close Exit Intent modal")
    public void closeModal() {
        getCloseButtonElement().click();

        // Wait until the modal becomes invisible
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(modalLocator)
        );

        attachScreenshot("Close Exit Intent modal");
    }
}



