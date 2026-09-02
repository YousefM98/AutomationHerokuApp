package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P32LargeDeepDomPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By siblingHeaderLocator =
            By.xpath("//*[@id='sibling-1.1']");

    private By tableLocator =
            By.id("large-table");

    private By tableRowsLocator =
            By.cssSelector("#large-table tbody tr");

    private By tableHeadersLocator =
            By.cssSelector("#large-table thead th");


    // -------------------- Constructor --------------------

    public P32LargeDeepDomPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getSiblingHeaderElement() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(siblingHeaderLocator)
        );
    }

    private WebElement getTableElement() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(tableLocator)
        );
    }

    private List<WebElement> getTableRowsElements() {
        return wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(tableRowsLocator)
        );
    }

    private List<WebElement> getTableHeadersElements() {
        return wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(tableHeadersLocator)
        );
    }


    // -------------------- Dynamic Locators --------------------

    private By getSiblingLocator(int parent, int child) {
        return By.id(
                "sibling-" + parent + "." + child
        );
    }

    private By getTableCellLocator(int row, int column) {
        return By.cssSelector(
                "#large-table tbody tr:nth-child(" + row + ") " +
                        "td:nth-child(" + column + ")"
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Large and Deep DOM page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Large and Deep DOM page header");

        return headerText;
    }

    @Step("Verify large table is displayed")
    public boolean isTableDisplayed() {

        boolean displayed =
                getTableElement().isDisplayed();

        attachScreenshot("Verify large table is displayed");

        return displayed;
    }

    @Step("Get table rows count")
    public int getTableRowsCount() {

        int rowsCount =
                getTableRowsElements().size();

        attachScreenshot("Get table rows count");

        return rowsCount;
    }

    @Step("Get table columns count")
    public int getTableColumnsCount() {

        int columnsCount =
                getTableHeadersElements().size();

        attachScreenshot("Get table columns count");

        return columnsCount;
    }

    @Step("Get sibling 1.1 text")
    public String getSiblingHeaderText() {

        String siblingText =
                getSiblingHeaderElement().getText();

        attachScreenshot("Get sibling 1.1 text");

        return siblingText;
    }

    @Step("Get sibling text for parent {parent} and child {child}")
    public String getSiblingText(int parent, int child) {

        WebElement siblingElement =
                wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                getSiblingLocator(parent, child)
                        )
                );

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        String siblingText =
                (String) js.executeScript(
                        "return Array.from(arguments[0].childNodes)" +
                                ".filter(node => node.nodeType === Node.TEXT_NODE)" +
                                ".map(node => node.textContent.trim())" +
                                ".filter(text => text.length > 0)" +
                                ".join('');",
                        siblingElement
                );

        attachScreenshot("Get sibling text");

        return siblingText;
    }

    @Step("Get table cell value at row {row} and column {column}")
    public String getTableCellValue(int row, int column) {

        String cellValue =
                wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                getTableCellLocator(row, column)
                        )
                ).getText();

        attachScreenshot("Get table cell value");

        return cellValue;
    }

    @Step("Get table header at column {column}")
    public String getTableHeader(int column) {

        String headerText =
                getTableHeadersElements()
                        .get(column - 1)
                        .getText();

        attachScreenshot("Get table header");

        return headerText;
    }
}