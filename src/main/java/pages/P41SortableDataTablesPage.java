package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P41SortableDataTablesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By firstTableLocator =
            By.id("table1");

    private By secondTableLocator =
            By.id("table2");

    private By firstTableRowsLocator =
            By.cssSelector("#table1 tbody tr");

    private By secondTableRowsLocator =
            By.cssSelector("#table2 tbody tr");

    private By firstTableHeadersLocator =
            By.cssSelector("#table1 thead th");

    private By secondTableHeadersLocator =
            By.cssSelector("#table2 thead th");


    // -------------------- Constructor --------------------

    public P41SortableDataTablesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Dynamic Locators --------------------

    private By getFirstTableCellLocator(int row, int column) {

        return By.cssSelector(
                "#table1 tbody tr:nth-child(" + row + ") " +
                        "td:nth-child(" + column + ")"
        );
    }

    private By getSecondTableCellLocator(int row, int column) {

        return By.cssSelector(
                "#table2 tbody tr:nth-child(" + row + ") " +
                        "td:nth-child(" + column + ")"
        );
    }

    private By getFirstTableHeaderLocator(int column) {

        return By.cssSelector(
                "#table1 thead th:nth-child(" + column + ")"
        );
    }

    private By getSecondTableHeaderLocator(int column) {

        return By.cssSelector(
                "#table2 thead th:nth-child(" + column + ")"
        );
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        headerLocator
                )
        );
    }

    private WebElement getFirstTableElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        firstTableLocator
                )
        );
    }

    private WebElement getSecondTableElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        secondTableLocator
                )
        );
    }

    private List<WebElement> getFirstTableRowsElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        firstTableRowsLocator
                )
        );
    }

    private List<WebElement> getSecondTableRowsElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        secondTableRowsLocator
                )
        );
    }

    private List<WebElement> getFirstTableHeadersElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        firstTableHeadersLocator
                )
        );
    }

    private List<WebElement> getSecondTableHeadersElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        secondTableHeadersLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Sortable Data Tables page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Sortable Data Tables page header"
        );

        return headerText;
    }

    @Step("Verify first table is displayed")
    public boolean isFirstTableDisplayed() {

        boolean displayed =
                getFirstTableElement().isDisplayed();

        attachScreenshot(
                "Verify first table is displayed"
        );

        return displayed;
    }

    @Step("Verify second table is displayed")
    public boolean isSecondTableDisplayed() {

        boolean displayed =
                getSecondTableElement().isDisplayed();

        attachScreenshot(
                "Verify second table is displayed"
        );

        return displayed;
    }

    @Step("Get first table rows count")
    public int getFirstTableRowsCount() {

        int count =
                getFirstTableRowsElements().size();

        attachScreenshot(
                "Get first table rows count"
        );

        return count;
    }

    @Step("Get second table rows count")
    public int getSecondTableRowsCount() {

        int count =
                getSecondTableRowsElements().size();

        attachScreenshot(
                "Get second table rows count"
        );

        return count;
    }

    @Step("Get first table headers count")
    public int getFirstTableHeadersCount() {

        int count =
                getFirstTableHeadersElements().size();

        attachScreenshot(
                "Get first table headers count"
        );

        return count;
    }

    @Step("Get second table headers count")
    public int getSecondTableHeadersCount() {

        int count =
                getSecondTableHeadersElements().size();

        attachScreenshot(
                "Get second table headers count"
        );

        return count;
    }

    @Step("Get first table header at column {column}")
    public String getFirstTableHeader(int column) {

        String headerText =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                getFirstTableHeaderLocator(column)
                        )
                ).getText();

        attachScreenshot(
                "Get first table header"
        );

        return headerText;
    }

    @Step("Get second table header at column {column}")
    public String getSecondTableHeader(int column) {

        String headerText =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                getSecondTableHeaderLocator(column)
                        )
                ).getText();

        attachScreenshot(
                "Get second table header"
        );

        return headerText;
    }

    @Step("Get first table cell value at row {row} and column {column}")
    public String getFirstTableCellValue(int row, int column) {

        String value =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                getFirstTableCellLocator(row, column)
                        )
                ).getText();

        attachScreenshot(
                "Get first table cell value"
        );

        return value;
    }

    @Step("Get second table cell value at row {row} and column {column}")
    public String getSecondTableCellValue(int row, int column) {

        String value =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                getSecondTableCellLocator(row, column)
                        )
                ).getText();

        attachScreenshot(
                "Get second table cell value"
        );

        return value;
    }


    // -------------------- Sorting Actions --------------------

    @Step("Click first table header at column {column}")
    public void clickFirstTableHeader(int column) {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        getFirstTableHeaderLocator(column)
                )
        ).click();

        attachScreenshot(
                "Click first table header"
        );
    }

    @Step("Click second table header at column {column}")
    public void clickSecondTableHeader(int column) {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        getSecondTableHeaderLocator(column)
                )
        ).click();

        attachScreenshot(
                "Click second table header"
        );
    }
}