package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P13DynamicControlsPage extends BasePages {

    // =========================
    // Locators
    // =========================

    // Main page header
    private By headerLocator =
            By.xpath("//h4[text()='Dynamic Controls']");

    // Checkbox section
    private By checkboxLocator =
            By.cssSelector("#checkbox-example input[type='checkbox']");

    private By checkboxLabelLocator =
            By.xpath("//*[normalize-space()='A checkbox']");

    private By removeAddButtonLocator =
            By.cssSelector("#checkbox-example button");

    private By firstSubHeaderLocator =
            By.xpath("//*[@id='content']/div[1]/h4[2]");

    private By checkBoxMessageLocator =
            By.xpath("//*[@id='checkbox-example']/p");


    // Input section
    private By inputField =
            By.cssSelector("#input-example input");

    private By enableDisableButton =
            By.cssSelector("#input-example button");

    private By secondSubHeaderLocator =
            By.xpath("//*[@id='content']/div[1]/h4[3]");

    private By inputFieldMessageLocator =
            By.xpath("//*[@id='input-example']/p");


    // =========================
    // Constructor
    // =========================

    public P13DynamicControlsPage(WebDriver driver) {
        super(driver);
    }


    // =========================
    // Page Information
    // =========================

    /**
     * Returns the main page header text.
     */
    @Step("Get page header text")
    public String getHeaderText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(headerLocator));

        return driver.findElement(headerLocator).getText();
    }


    /**
     * Returns the first section sub-header text.
     */
    @Step("Get first sub-header text")
    public String getFirstSubHeaderText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstSubHeaderLocator));

        return driver.findElement(firstSubHeaderLocator).getText();
    }


    /**
     * Returns the second section sub-header text.
     */
    @Step("Get second sub-header text")
    public String getSecondSubHeaderText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(secondSubHeaderLocator));

        return driver.findElement(secondSubHeaderLocator).getText();
    }


    // =========================
    // Checkbox Methods
    // =========================

    /**
     * Checks whether the checkbox message is displayed.
     */
    @Step("Verify checkbox message is displayed")
    public boolean isCheckBoxMessageDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxMessageLocator));

        boolean isDisplayed =
                driver.findElement(checkBoxMessageLocator).isDisplayed();

        attachScreenshot("Checkbox Message");

        return isDisplayed;
    }


    /**
     * Checks whether the input field message is displayed.
     */
    @Step("Verify input field message is displayed")
    public boolean isInputFieldMessageDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldMessageLocator));

        boolean isDisplayed =
                driver.findElement(inputFieldMessageLocator).isDisplayed();

        attachScreenshot("Input Field Message");

        return isDisplayed;
    }


    /**
     * Returns the checkbox message text.
     */
    @Step("Get checkbox message text")
    public String getCheckBoxMessageText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxMessageLocator));

        return driver.findElement(checkBoxMessageLocator).getText();
    }


    /**
     * Returns the input field message text.
     */
    @Step("Get input field message text")
    public String getInputFieldMessageText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldMessageLocator));

        return driver.findElement(inputFieldMessageLocator).getText();
    }


    /**
     * Checks whether the checkbox currently exists on the page.
     *
     * findElements() is used because the checkbox is removed
     * from the DOM when the Remove button is clicked.
     */
    @Step("Verify checkbox is displayed")
    public boolean isCheckboxDisplayed() {

        return !driver.findElements(checkboxLocator).isEmpty();
    }


    /**
     * Selects the checkbox.
     */
    @Step("Select checkbox")
    public void selectCheckbox() {

        WebElement checkbox =
                wait.until(ExpectedConditions.elementToBeClickable(checkboxLocator));

        checkbox.click();

        attachScreenshot("Checkbox Selected");
    }


    /**
     * Checks whether the checkbox is selected.
     */
    @Step("Verify checkbox is selected")
    public boolean isCheckboxSelected() {

        WebElement checkbox =
                wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLocator));

        return checkbox.isSelected();
    }


    /**
     * Removes the checkbox from the page.
     */
    @Step("Remove checkbox")
    public void removeCheckbox() {

        WebElement button =
                wait.until(ExpectedConditions.elementToBeClickable(removeAddButtonLocator));

        button.click();

        // Wait until the checkbox is removed from the DOM/display.
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkboxLocator));

        attachScreenshot("Checkbox Removed");
    }


    /**
     * Adds the checkbox back to the page.
     */
    @Step("Add checkbox")
    public void addCheckbox() {

        WebElement button =
                wait.until(ExpectedConditions.elementToBeClickable(removeAddButtonLocator));

        button.click();

        // Wait until the checkbox becomes visible again.
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLocator));

        attachScreenshot("Checkbox Added");
    }


    /**
     * Returns the current text of the checkbox button.
     *
     * The button text changes between "Remove" and "Add".
     */
    @Step("Get checkbox button text")
    public String getCheckboxButtonText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(removeAddButtonLocator));

        return driver.findElement(removeAddButtonLocator).getText();
    }


    /**
     * Returns the checkbox label text.
     */
    @Step("Get checkbox label text")
    public String getCheckboxLabelText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLabelLocator));

        return driver.findElement(checkboxLabelLocator).getText();
    }


    // =========================
    // Input Field Methods
    // =========================

    /**
     * Checks whether the input field is enabled.
     */
    @Step("Verify input field is enabled")
    public boolean isInputEnabled() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(inputField));

        return driver.findElement(inputField).isEnabled();
    }


    /**
     * Enables the input field.
     */
    @Step("Enable input field")
    public void enableInput() {

        WebElement button =
                wait.until(ExpectedConditions.elementToBeClickable(enableDisableButton));

        button.click();

        // Wait until the input becomes enabled.
        wait.until(ExpectedConditions.elementToBeClickable(inputField));

        attachScreenshot("Input Field Enabled");
    }


    /**
     * Disables the input field.
     */
    @Step("Disable input field")
    public void disableInput() {

        WebElement button =
                wait.until(ExpectedConditions.elementToBeClickable(enableDisableButton));

        button.click();

        // Wait until the input becomes disabled.
        wait.until(driver ->
                !driver.findElement(inputField).isEnabled()
        );

        attachScreenshot("Input Field Disabled");
    }


    /**
     * Enters text into the input field.
     */
    @Step("Enter text into input field: {text}")
    public void enterText(String text) {

        WebElement input =
                wait.until(ExpectedConditions.elementToBeClickable(inputField));

        input.sendKeys(text);

        attachScreenshot("Text Entered");
    }


    /**
     * Returns the current value of the input field.
     */
    @Step("Get input field text")
    public String getInputText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(inputField));

        return driver.findElement(inputField).getAttribute("value");
    }


    /**
     * Returns the current text of the Enable/Disable button.
     */
    @Step("Get input button text")
    public String getInputButtonText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(enableDisableButton));

        return driver.findElement(enableDisableButton).getText();
    }


    // =========================
    // General Methods
    // =========================

    /**
     * Returns the current page URL.
     */
    @Step("Get current page URL")
    public String getURL() {

        return driver.getCurrentUrl();
    }
}
