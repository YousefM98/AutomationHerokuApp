package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P34NestedFramesPage extends BasePages {

    // -------------------- Locators --------------------

    private By topFrameLocator =
            By.name("frame-top");

    private By leftFrameLocator =
            By.name("frame-left");

    private By middleFrameLocator =
            By.name("frame-middle");

    private By rightFrameLocator =
            By.name("frame-right");

    private By bottomFrameLocator =
            By.name("frame-bottom");

    private By bodyLocator =
            By.tagName("body");


    // -------------------- Constructor --------------------

    public P34NestedFramesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getBodyElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(bodyLocator)
        );
    }


    // -------------------- Frame Validation --------------------

    @Step("Get left frame text")
    public String getLeftFrameText() {

        driver.switchTo().defaultContent();

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        topFrameLocator
                )
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        leftFrameLocator
                )
        );

        String frameText =
                getBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get left frame text");

        return frameText;
    }

    @Step("Get middle frame text")
    public String getMiddleFrameText() {

        driver.switchTo().defaultContent();

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        topFrameLocator
                )
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        middleFrameLocator
                )
        );

        String frameText =
                getBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get middle frame text");

        return frameText;
    }

    @Step("Get right frame text")
    public String getRightFrameText() {

        driver.switchTo().defaultContent();

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        topFrameLocator
                )
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        rightFrameLocator
                )
        );

        String frameText =
                getBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get right frame text");

        return frameText;
    }

    @Step("Get bottom frame text")
    public String getBottomFrameText() {

        driver.switchTo().defaultContent();

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        bottomFrameLocator
                )
        );

        String frameText =
                getBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get bottom frame text");

        return frameText;
    }
}