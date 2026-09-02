package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class P6CheckBoxesPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Checkboxes page header
    private By headerLocator = By.xpath(
            "//*[@id='content']/div/h3"
    );

    // Locates the first checkbox
    private By firstCheckboxLocator = By.xpath(
            "//*[@id='checkboxes']/input[1]"
    );

    // Locates the second checkbox
    private By secondCheckboxLocator = By.xpath(
            "//*[@id='checkboxes']/input[2]"
    );

    // Locates the checkbox container and its text
    private By checkboxTextLocator = By.id(
            "checkboxes"
    );


    // -------------------- Constructor --------------------

    public P6CheckBoxesPage(WebDriver driver) {
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

    // Waits until the first checkbox is visible
    private WebElement getFirstCheckboxElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        firstCheckboxLocator
                )
        );
    }

    // Waits until the second checkbox is visible
    private WebElement getSecondCheckboxElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        secondCheckboxLocator
                )
        );
    }

    // Waits until the checkbox container is visible
    private WebElement getCheckboxTextElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        checkboxTextLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    // Returns the text displayed in the page header
    @Step("Get Checkboxes page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Checkboxes page header");

        return headerText;
    }

    // Returns whether the first checkbox is selected
    @Step("Verify first checkbox selection state")
    public boolean isFirstCheckboxSelected() {

        boolean selected = getFirstCheckboxElement().isSelected();

        attachScreenshot("Verify first checkbox selection state");

        return selected;
    }

    // Returns whether the second checkbox is selected
    @Step("Verify second checkbox selection state")
    public boolean isSecondCheckboxSelected() {

        boolean selected = getSecondCheckboxElement().isSelected();

        attachScreenshot("Verify second checkbox selection state");

        return selected;
    }

    // Checks whether the first checkbox is displayed
    @Step("Verify first checkbox is displayed")
    public boolean isFirstCheckboxDisplayed() {

        boolean displayed = getFirstCheckboxElement().isDisplayed();

        attachScreenshot("Verify first checkbox is displayed");

        return displayed;
    }

    // Checks whether the second checkbox is displayed
    @Step("Verify second checkbox is displayed")
    public boolean isSecondCheckboxDisplayed() {

        boolean displayed = getSecondCheckboxElement().isDisplayed();

        attachScreenshot("Verify second checkbox is displayed");

        return displayed;
    }

    // Returns the text displayed in the checkbox section
    @Step("Get checkbox section text")
    public String getCheckboxText() {

        String checkboxText = getCheckboxTextElement().getText();

        attachScreenshot("Get checkbox section text");

        return checkboxText;
    }


    // -------------------- Checkbox Actions --------------------

    // Clicks the first checkbox
    @Step("Click first checkbox")
    public void clickFirstCheckbox() {

        getFirstCheckboxElement().click();

        attachScreenshot("Click first checkbox");
    }

    // Clicks the second checkbox
    @Step("Click second checkbox")
    public void clickSecondCheckbox() {

        getSecondCheckboxElement().click();

        attachScreenshot("Click second checkbox");
    }
}


