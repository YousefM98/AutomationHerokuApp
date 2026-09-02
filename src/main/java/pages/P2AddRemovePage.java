package pages;

import Base.BasePages;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class P2AddRemovePage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the button used to add a new element
    private By addElementButtonLocator = By.xpath(
            "//*[@id='content']/div/button"
    );

    // Locates the first Remove button
    private By removeElementButtonLocator = By.xpath(
            "//*[@id='elements']/button[1]"
    );

    // Locates all dynamically added elements
    private By elementsCounterLocator = By.xpath(
            "//*[@id='elements']/button"
    );


    // -------------------- Constructor --------------------

    public P2AddRemovePage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Waits until the Add Element button is visible
    private WebElement getAddElementButtonElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        addElementButtonLocator
                )
        );
    }

    // Waits until the Remove button is clickable
    private WebElement getRemoveElementButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        removeElementButtonLocator
                )
        );
    }


    // -------------------- Validation --------------------

    // Returns the text displayed on the Add Element button
    @Step("Get Add Element button text")
    public String getAddElementButtonText() {
        String buttonText = getAddElementButtonElement().getText();

        attachScreenshot("Get Add Element button text");

        return buttonText;
    }

    // Returns the text displayed on the Remove button
    @Step("Get Remove Element button text")
    public String getRemoveElementButtonText() {
        String buttonText = getRemoveElementButtonElement().getText();

        attachScreenshot("Get Remove Element button text");

        return buttonText;
    }

    // Returns the number of dynamically added elements
    @Step("Get number of elements")
    public int getNumberOfElements() {
        return driver.findElements(elementsCounterLocator).size();
    }


    // -------------------- Add Actions --------------------

    // Clicks the Add Element button
    @Step("Add element")
    public void addElement() {
        int currentCount = getNumberOfElements();

        getAddElementButtonElement().click();

        // Wait until the number of elements increases
        wait.until(
                driver -> getNumberOfElements() > currentCount
        );

        attachScreenshot("Add element");
    }

    // Adds the specified number of elements
    @Step("Add {number} elements")
    public void addElementsNTimes(int number) {
        for (int i = 0; i < number; i++) {
            addElement();
        }
    }


    // -------------------- Remove Actions --------------------

    // Removes the first dynamically added element
    @Step("Remove element")
    public void removeElement() {
        int currentCount = getNumberOfElements();

        getRemoveElementButtonElement().click();

        // Wait until the number of elements decreases
        wait.until(
                driver -> getNumberOfElements() < currentCount
        );

        attachScreenshot("Remove element");
    }

    // Removes the specified number of elements
    @Step("Remove {number} elements")
    public void removeElementsNTimes(int number) {
        for (int i = 0; i < number; i++) {
            removeElement();
        }
    }

    // Removes all dynamically added elements
    @Step("Remove all elements")
    public void removeAllElements() {

        while (getNumberOfElements() > 0) {
            removeElement();
        }

        attachScreenshot("Remove all elements");
    }
}



