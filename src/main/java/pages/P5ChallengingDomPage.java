package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class P5ChallengingDomPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Challenging DOM page header
    private By headerLocator = By.tagName("h3");

    // Locates the buttons displayed at the top of the page
    private By buttonsLocator = By.xpath(
            "//*[@class='large-2 columns']/a"
    );

    // Locates the main data table
    private By tableLocator = By.xpath(
            "//*[@class='large-10 columns']/table"
    );

    // Locates all rows in the table body
    private By tableRowsLocator = By.xpath(
            "//*[@class='large-10 columns']/table/tbody/tr"
    );

    // Locates all columns in the first table row
    private By tableColumnsLocator = By.xpath(
            "//*[@class='large-10 columns']/table/tbody/tr[1]/td"
    );

    // Locates the table header
    private By tableHeaderLocator = By.xpath(
            "//*[@class='large-10 columns']/table/thead/tr"
    );

    // Locates all Delete buttons in the table
    private By deleteLocator = By.xpath(
            "//*[@class='large-10 columns']/table/tbody/tr/td[7]/a[2]"
    );

    // Locates all Edit buttons in the table
    private By editLocator = By.xpath(
            "//*[@class='large-10 columns']/table/tbody/tr/td[7]/a[1]"
    );

    // Locates the canvas element
    private By canvasLocator = By.tagName("canvas");


    // -------------------- Constructor --------------------

    public P5ChallengingDomPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Waits until the page header is visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        headerLocator
                )
        );
    }

    // Waits until the main table is visible
    private WebElement getTableElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        tableLocator
                )
        );
    }

    // Waits until the table header is visible
    private WebElement getTableHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        tableHeaderLocator
                )
        );
    }

    // Waits until the canvas is visible
    private WebElement getCanvasElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        canvasLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    // Returns the text displayed in the page header
    @Step("Get Challenging DOM page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Challenging DOM page header");

        return headerText;
    }

    // Returns the number of buttons displayed at the top of the page
    @Step("Get number of page buttons")
    public int getNumberOfButtons() {

        int buttonCount = driver.findElements(buttonsLocator).size();

        attachScreenshot("Get number of page buttons");

        return buttonCount;
    }

    // Checks whether the main table is displayed
    @Step("Verify table is displayed")
    public boolean isTableDisplayed() {

        boolean displayed = getTableElement().isDisplayed();

        attachScreenshot("Verify table is displayed");

        return displayed;
    }

    // Checks whether the table header is displayed
    @Step("Verify table header is displayed")
    public boolean isTableHeaderDisplayed() {

        boolean displayed = getTableHeaderElement().isDisplayed();

        attachScreenshot("Verify table header is displayed");

        return displayed;
    }

    // Returns the number of rows in the table
    @Step("Get number of table rows")
    public int getNumberOfTableRows() {

        // Ensure the table has loaded before checking its rows
        getTableElement();

        int rowCount = driver.findElements(tableRowsLocator).size();

        attachScreenshot("Get number of table rows");

        return rowCount;
    }

    // Returns the number of columns in the first table row
    @Step("Get number of table columns")
    public int getNumberOfTableColumns() {

        // Ensure the table has loaded before checking its columns
        getTableElement();

        int columnCount = driver.findElements(tableColumnsLocator).size();

        attachScreenshot("Get number of table columns");

        return columnCount;
    }


    // -------------------- Edit / Delete Validation --------------------

    // Returns the number of Delete buttons in the table
    @Step("Get number of Delete buttons")
    public int getNumberOfDeleteButtons() {

        getTableElement();

        int deleteButtonCount = driver.findElements(deleteLocator).size();

        attachScreenshot("Get number of Delete buttons");

        return deleteButtonCount;
    }

    // Returns the number of Edit buttons in the table
    @Step("Get number of Edit buttons")
    public int getNumberOfEditButtons() {

        getTableElement();

        int editButtonCount = driver.findElements(editLocator).size();

        attachScreenshot("Get number of Edit buttons");

        return editButtonCount;
    }

    // Returns the text of the first Delete button
    @Step("Get Delete button text")
    public String getDeleteButtonText() {

        String buttonText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        deleteLocator
                )
        ).getText();

        attachScreenshot("Get Delete button text");

        return buttonText;
    }

    // Returns the text of the first Edit button
    @Step("Get Edit button text")
    public String getEditButtonText() {

        String buttonText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        editLocator
                )
        ).getText();

        attachScreenshot("Get Edit button text");

        return buttonText;
    }


    // -------------------- Row Actions --------------------

    // Clicks the Delete button for the specified table row
    @Step("Delete row {row}")
    public void chooseRowToDelete(int row) {

        By rowLocator = By.xpath(
                "//*[@class='large-10 columns']/table/tbody/tr["
                        + row + "]/td[7]/a[2]"
        );

        WebElement deleteButton = wait.until(
                ExpectedConditions.elementToBeClickable(rowLocator)
        );

        deleteButton.click();

        attachScreenshot("Delete row " + row);
    }

    // Clicks the Edit button for the specified table row
    @Step("Edit row {row}")
    public void chooseRowToEdit(int row) {

        By rowLocator = By.xpath(
                "//*[@class='large-10 columns']/table/tbody/tr["
                        + row + "]/td[7]/a[1]"
        );

        WebElement editButton = wait.until(
                ExpectedConditions.elementToBeClickable(rowLocator)
        );

        editButton.click();

        attachScreenshot("Edit row " + row);
    }


    // -------------------- Canvas Validation --------------------

    // Checks whether the canvas element is displayed
    @Step("Verify canvas is displayed")
    public boolean isCanvasDisplayed() {

        boolean displayed = getCanvasElement().isDisplayed();

        attachScreenshot("Verify canvas is displayed");

        return displayed;
    }

    // Returns the canvas width
    @Step("Get canvas width")
    public String getCanvasWidth() {

        String width = getCanvasElement().getAttribute("width");

        attachScreenshot("Get canvas width");

        return width;
    }

    // Returns the canvas height
    @Step("Get canvas height")
    public String getCanvasHeight() {

        String height = getCanvasElement().getAttribute("height");

        attachScreenshot("Get canvas height");

        return height;
    }


    // -------------------- Navigation Validation --------------------

    // Returns the current page URL
    @Step("Get current page URL")
    public String getUrl() {

        String url = driver.getCurrentUrl();

        attachScreenshot("Get current page URL");

        return url;
    }
}


