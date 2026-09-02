package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class P27InputsPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/div/h3");
    private By numberInputLocator = By.cssSelector("input[type='number']");


    // -------------------- Constructor --------------------

    public P27InputsPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getNumberInputElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(numberInputLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Inputs page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Inputs page header");

        return headerText;
    }

    @Step("Get entered number value")
    public String getNumberValue() {

        String value =
                getNumberInputElement().getAttribute("value");

        attachScreenshot("Get entered number value");

        return value;
    }


    // -------------------- Input Actions --------------------

    @Step("Enter number {number}")
    public void enterNumber(String number) {

        getNumberInputElement().sendKeys(number);

        attachScreenshot("Enter number");
    }

    @Step("Clear number input")
    public void clearNumberInput() {

        getNumberInputElement().clear();

        attachScreenshot("Clear number input");
    }

    @Step("Increase number using Arrow Up")
    public void increaseNumber() {

        getNumberInputElement().sendKeys(Keys.ARROW_UP);

        attachScreenshot("Increase number using Arrow Up");
    }

    @Step("Decrease number using Arrow Down")
    public void decreaseNumber() {

        getNumberInputElement().sendKeys(Keys.ARROW_DOWN);

        attachScreenshot("Decrease number using Arrow Down");
    }
}