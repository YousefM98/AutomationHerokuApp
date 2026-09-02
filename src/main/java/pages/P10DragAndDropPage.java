package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P10DragAndDropPage extends BasePages {

    // =========================
    // Locators
    // =========================

    // Page header
    private By headerLocator = By.tagName("h3");

    // Both drag-and-drop boxes
    private By boxesLocator = By.cssSelector("#column-a, #column-b");

    // First box (A)
    private By firstBoxLocator = By.id("column-a");

    // Second box (B)
    private By secondBoxLocator = By.id("column-b");


    // =========================
    // Constructor
    // =========================

    public P10DragAndDropPage(WebDriver driver) {
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

        String headerText = driver.findElement(headerLocator).getText();

        attachScreenshot("Page Header");

        return headerText;
    }


    /**
     * Returns the number of drag-and-drop boxes displayed on the page.
     */
    @Step("Get number of drag-and-drop boxes")
    public int getBoxesCount() {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(boxesLocator));

        int boxesCount = driver.findElements(boxesLocator).size();

        attachScreenshot("Drag and Drop Boxes");

        return boxesCount;
    }


    /**
     * Returns the text of the first box.
     */
    @Step("Get first box text")
    public String getFirstBoxText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstBoxLocator));

        String firstBoxText = driver.findElement(firstBoxLocator).getText();

        attachScreenshot("First Box");

        return firstBoxText;
    }


    /**
     * Returns the text of the second box.
     */
    @Step("Get second box text")
    public String getSecondBoxText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(secondBoxLocator));

        String secondBoxText = driver.findElement(secondBoxLocator).getText();

        attachScreenshot("Second Box");

        return secondBoxText;
    }


    /**
     * Drags the first box (A) and drops it onto the second box (B).
     */
    @Step("Drag first box to second box")
    public void dragFirstBoxToSecondBox() {

        // Wait until both boxes are visible and ready for interaction
        WebElement firstBox =
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstBoxLocator));

        WebElement secondBox =
                wait.until(ExpectedConditions.visibilityOfElementLocated(secondBoxLocator));

        // Perform drag-and-drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(firstBox, secondBox).perform();

        // Capture the result after the drag-and-drop operation
        attachScreenshot("First Box Dragged To Second Box");
    }


    /**
     * Drags the second box (B) and drops it onto the first box (A).
     */
    @Step("Drag second box to first box")
    public void dragSecondBoxToFirstBox() {

        // Wait until both boxes are visible and ready for interaction
        WebElement secondBox =
                wait.until(ExpectedConditions.visibilityOfElementLocated(secondBoxLocator));

        WebElement firstBox =
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstBoxLocator));

        // Perform drag-and-drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(secondBox, firstBox).perform();

        // Capture the result after the drag-and-drop operation
        attachScreenshot("Second Box Dragged To First Box");
    }
}
