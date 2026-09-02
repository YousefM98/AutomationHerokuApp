package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P31KeyPressesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By inputFieldLocator =
            By.id("target");

    private By resultLocator =
            By.id("result");

    private By bodyLocator =
            By.tagName("body");
    // -------------------- Constructor --------------------

    public P31KeyPressesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getInputFieldElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(inputFieldLocator)
        );
    }

    private WebElement getResultElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(resultLocator)
        );
    }
    private WebElement getBodyElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(bodyLocator)
        );
    }

    // -------------------- Page Validation --------------------

    @Step("Get Key Presses page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Key Presses page header");

        return headerText;
    }

    @Step("Get key press result")
    public String getResultText() {

        String resultText =
                getResultElement().getText();

        attachScreenshot("Get key press result");

        return resultText;
    }

    @Step("Get input field value")
    public String getInputValue() {

        String value =
                getInputFieldElement().getAttribute("value");

        attachScreenshot("Get input field value");

        return value;
    }

    @Step("Verify input field is displayed")
    public boolean isInputFieldDisplayed() {

        boolean displayed =
                getInputFieldElement().isDisplayed();

        attachScreenshot("Verify input field is displayed");

        return displayed;
    }


    // -------------------- Keyboard Actions --------------------

    @Step("Press key {key}")
    public void pressKey(Keys key) {

       getBodyElement().sendKeys(key);

        attachScreenshot("Press key");
    }

    @Step("Enter text {text}")
    public void enterText(String text) {

        getInputFieldElement().sendKeys(text);

        attachScreenshot("Enter text");
    }

    @Step("Press Enter key")
    public void pressEnter() {

        getBodyElement().sendKeys(Keys.ENTER);

        attachScreenshot("Press Enter key");
    }

    @Step("Press Escape key")
    public void pressEscape() {

        getBodyElement().sendKeys(Keys.ESCAPE);

        attachScreenshot("Press Escape key");
    }

    @Step("Press Tab key")
    public void pressTab() {

        getBodyElement().sendKeys(Keys.TAB);

        attachScreenshot("Press Tab key");
    }

    @Step("Press Arrow Up key")
    public void pressArrowUp() {

        getBodyElement().sendKeys(Keys.ARROW_UP);

        attachScreenshot("Press Arrow Up key");
    }

    @Step("Press Arrow Down key")
    public void pressArrowDown() {

        getBodyElement().sendKeys(Keys.ARROW_DOWN);

        attachScreenshot("Press Arrow Down key");
    }

    @Step("Press Backspace key")
    public void pressBackspace() {

        getBodyElement().sendKeys(Keys.BACK_SPACE);

        attachScreenshot("Press Backspace key");
    }

    @Step("Clear input field")
    public void clearInputField() {

        getInputFieldElement().clear();

        attachScreenshot("Clear input field");
    }
}