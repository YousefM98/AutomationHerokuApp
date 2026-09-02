package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P28JQueryUiMenuPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.tagName("h3");

    private By disabledMenuLocator =
            By.xpath("//ul[@id='menu']/li/a[text()='Disabled']");

    private By enabledMenuLocator =
            By.xpath("//ul[@id='menu']/li/a[text()='Enabled']");

    private By downloadsMenuLocator =
            By.xpath("//a[text()='Downloads']");

    private By backToJQueryUiLocator =
            By.xpath("//a[text()='Back to JQuery UI']");

    private By pdfMenuLocator =
            By.xpath("//a[text()='PDF']");

    private By csvMenuLocator =
            By.xpath("//a[text()='CSV']");

    private By excelMenuLocator =
            By.xpath("//a[text()='Excel']");


    // -------------------- Constructor --------------------

    public P28JQueryUiMenuPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getDisabledMenuElement() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(disabledMenuLocator)
        );
    }

    private WebElement getEnabledMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(enabledMenuLocator)
        );
    }

    private WebElement getDownloadsMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(downloadsMenuLocator)
        );
    }

    private WebElement getBackToJQueryUiElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(backToJQueryUiLocator)
        );
    }

    private WebElement getPdfMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(pdfMenuLocator)
        );
    }

    private WebElement getCsvMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(csvMenuLocator)
        );
    }

    private WebElement getExcelMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(excelMenuLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get JQuery UI Menu page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get JQuery UI Menu page header");

        return headerText;
    }

    @Step("Verify Disabled menu item is displayed")
    public boolean isDisabledMenuDisplayed() {

        boolean displayed =
                getDisabledMenuElement().isDisplayed();

        attachScreenshot("Verify Disabled menu item is displayed");

        return displayed;
    }

    @Step("Verify Enabled menu item is displayed")
    public boolean isEnabledMenuDisplayed() {

        boolean displayed =
                getEnabledMenuElement().isDisplayed();

        attachScreenshot("Verify Enabled menu item is displayed");

        return displayed;
    }

    @Step("Verify Downloads submenu is displayed")
    public boolean isDownloadsMenuDisplayed() {

        boolean displayed =
                !driver.findElements(downloadsMenuLocator).isEmpty()
                        && driver.findElement(downloadsMenuLocator).isDisplayed();

        attachScreenshot("Verify Downloads submenu is displayed");

        return displayed;
    }

    @Step("Verify Back to JQuery UI submenu is displayed")
    public boolean isBackToJQueryUiDisplayed() {

        boolean displayed =
                !driver.findElements(backToJQueryUiLocator).isEmpty()
                        && driver.findElement(backToJQueryUiLocator).isDisplayed();

        attachScreenshot("Verify Back to JQuery UI submenu is displayed");

        return displayed;
    }

    @Step("Verify PDF download option is displayed")
    public boolean isPdfMenuDisplayed() {

        boolean displayed =
                !driver.findElements(pdfMenuLocator).isEmpty()
                        && driver.findElement(pdfMenuLocator).isDisplayed();

        attachScreenshot("Verify PDF download option is displayed");

        return displayed;
    }

    @Step("Verify CSV download option is displayed")
    public boolean isCsvMenuDisplayed() {

        boolean displayed =
                !driver.findElements(csvMenuLocator).isEmpty()
                        && driver.findElement(csvMenuLocator).isDisplayed();

        attachScreenshot("Verify CSV download option is displayed");

        return displayed;
    }

    @Step("Verify Excel download option is displayed")
    public boolean isExcelMenuDisplayed() {

        boolean displayed =
                !driver.findElements(excelMenuLocator).isEmpty()
                        && driver.findElement(excelMenuLocator).isDisplayed();

        attachScreenshot("Verify Excel download option is displayed");

        return displayed;
    }

    @Step("Get PDF download link")
    public String getPdfLink() {

        String link =
                getPdfMenuElement().getAttribute("href");

        attachScreenshot("Get PDF download link");

        return link;
    }

    @Step("Get CSV download link")
    public String getCsvLink() {

        String link =
                getCsvMenuElement().getAttribute("href");

        attachScreenshot("Get CSV download link");

        return link;
    }

    @Step("Get Excel download link")
    public String getExcelLink() {

        String link =
                getExcelMenuElement().getAttribute("href");

        attachScreenshot("Get Excel download link");

        return link;
    }


    // -------------------- Menu Actions --------------------

    @Step("Hover over Enabled menu")
    public void hoverOverEnabledMenu() {

        Actions actions =
                new Actions(driver);

        actions.moveToElement(
                getEnabledMenuElement()
        ).perform();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(downloadsMenuLocator)
        );

        attachScreenshot("Hover over Enabled menu");
    }

    @Step("Hover over Downloads menu")
    public void hoverOverDownloadsMenu() {

        Actions actions =
                new Actions(driver);

        actions.moveToElement(
                getDownloadsMenuElement()
        ).perform();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pdfMenuLocator)
        );

        attachScreenshot("Hover over Downloads menu");
    }

    @Step("Open Downloads submenu")
    public void openDownloadsSubmenu() {

        Actions actions =
                new Actions(driver);

        actions.moveToElement(
                getEnabledMenuElement()
        ).perform();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(downloadsMenuLocator)
        );

        actions.moveToElement(
                getDownloadsMenuElement()
        ).perform();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pdfMenuLocator)
        );

        attachScreenshot("Open Downloads submenu");
    }

    @Step("Click PDF download option")
    public void clickPdf() {

        getPdfMenuElement().click();

        attachScreenshot("Click PDF download option");
    }

    @Step("Click CSV download option")
    public void clickCsv() {

        getCsvMenuElement().click();

        attachScreenshot("Click CSV download option");
    }

    @Step("Click Excel download option")
    public void clickExcel() {

        getExcelMenuElement().click();

        attachScreenshot("Click Excel download option");
    }

    @Step("Click Back to JQuery UI")
    public void clickBackToJQueryUi() {

        getBackToJQueryUiElement().click();

        attachScreenshot("Click Back to JQuery UI");
    }
}