package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P24HorizontalSliderPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.tagName("h3");
    private By sliderLocator = By.cssSelector("input[type='range']");
    private By sliderValueLocator = By.id("range");


    // -------------------- Constructor --------------------

    public P24HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getSliderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(sliderLocator)
        );
    }

    private WebElement getSliderValueElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(sliderValueLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Horizontal Slider page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Horizontal Slider page header");

        return headerText;
    }

    @Step("Get displayed slider value")
    public String getSliderValue() {

        String sliderValue = getSliderValueElement().getText();

        attachScreenshot("Get displayed slider value");

        return sliderValue;
    }

    @Step("Get slider value attribute")
    public String getSliderValueAttribute() {

        String sliderValue =
                getSliderElement().getAttribute("value");

        attachScreenshot("Get slider value attribute");

        return sliderValue;
    }

    @Step("Get slider minimum value")
    public String getSliderMinimumValue() {

        String minimumValue =
                getSliderElement().getAttribute("min");

        attachScreenshot("Get slider minimum value");

        return minimumValue;
    }

    @Step("Get slider maximum value")
    public String getSliderMaximumValue() {

        String maximumValue =
                getSliderElement().getAttribute("max");

        attachScreenshot("Get slider maximum value");

        return maximumValue;
    }

    @Step("Get slider step value")
    public String getSliderStepValue() {

        String stepValue =
                getSliderElement().getAttribute("step");

        attachScreenshot("Get slider step value");

        return stepValue;
    }


    // -------------------- Slider Actions --------------------

    @Step("Move slider one step to the right")
    public void moveSliderRight() {

        getSliderElement().sendKeys(Keys.ARROW_RIGHT);

        attachScreenshot("Move slider one step to the right");
    }

    @Step("Move slider one step to the left")
    public void moveSliderLeft() {

        getSliderElement().sendKeys(Keys.ARROW_LEFT);

        attachScreenshot("Move slider one step to the left");
    }

    @Step("Move slider to minimum value")
    public void moveSliderToMinimum() {

        getSliderElement().sendKeys(Keys.HOME);

        attachScreenshot("Move slider to minimum value");
    }

    @Step("Move slider to maximum value")
    public void moveSliderToMaximum() {

        getSliderElement().sendKeys(Keys.END);

        attachScreenshot("Move slider to maximum value");
    }

    @Step("Set slider value to {targetValue}")
    public void setSliderValue(double targetValue) {

        WebElement slider = getSliderElement();

        double currentValue =
                Double.parseDouble(
                        slider.getAttribute("value")
                );

        while (currentValue < targetValue) {

            slider.sendKeys(Keys.ARROW_RIGHT);

            currentValue =
                    Double.parseDouble(
                            slider.getAttribute("value")
                    );
        }

        while (currentValue > targetValue) {

            slider.sendKeys(Keys.ARROW_LEFT);

            currentValue =
                    Double.parseDouble(
                            slider.getAttribute("value")
                    );
        }

        attachScreenshot("Set slider value");
    }
}