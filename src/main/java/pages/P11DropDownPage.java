package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class P11DropDownPage extends BasePages {

    // =========================
    // Locators
    // =========================

    // Page header
    private By headerLocator = By.tagName("h3");

    // Dropdown element
    private By dropdownLocator = By.id("dropdown");


    // =========================
    // Constructor
    // =========================

    public P11DropDownPage(WebDriver driver) {
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

        return driver.findElement(headerLocator).getText();
    }


    /**
     * Checks whether the dropdown is displayed.
     */
    @Step("Verify dropdown is displayed")
    public boolean isDropdownDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));

        boolean isDisplayed = driver.findElement(dropdownLocator).isDisplayed();

        attachScreenshot("Dropdown Displayed");

        return isDisplayed;
    }


    /**
     * Returns the number of options available in the dropdown.
     */
    @Step("Get dropdown options count")
    public int getDropdownValuesCount() {

        WebElement dropdown =
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));

        Select select = new Select(dropdown);

        int optionsCount = select.getOptions().size();

        attachScreenshot("Dropdown Options");

        return optionsCount;
    }


    /**
     * Verifies that the first two dropdown options
     * match the expected values.
     */
    @Step("Verify dropdown options are {firstOption} and {secondOption}")
    public boolean areDropdownValuesCorrect(String firstOption, String secondOption) {

        WebElement dropdown =
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));

        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();

        boolean valuesCorrect =
                options.get(0).getText().equals(firstOption)
                        && options.get(1).getText().equals(secondOption);

        attachScreenshot("Dropdown Values Verification");

        return valuesCorrect;
    }


    /**
     * Selects a dropdown option by its visible text.
     */
    @Step("Select dropdown value: {value}")
    public void selectDropdownValue(String value) {

        WebElement dropdown =
                wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

        Select select = new Select(dropdown);

        select.selectByVisibleText(value);

        // Capture the dropdown after selecting the value
        attachScreenshot("Selected Dropdown Value");
    }


    /**
     * Returns the currently selected dropdown option.
     */
    @Step("Get selected dropdown value")
    public String getSelectedDropdownValue() {

        WebElement dropdown =
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));

        Select select = new Select(dropdown);

        return select.getFirstSelectedOption().getText();
    }
}
