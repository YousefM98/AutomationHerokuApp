package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P22FramesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    private By nestedFramesLinkLocator = By.linkText("Nested Frames");
    private By iFrameLinkLocator = By.linkText("iFrame");

    private By topFrameLocator = By.name("frame-top");
    private By leftFrameLocator = By.name("frame-left");
    private By middleFrameLocator = By.name("frame-middle");
    private By rightFrameLocator = By.name("frame-right");
    private By bottomFrameLocator = By.name("frame-bottom");

    private By frameBodyLocator = By.tagName("body");

    private By iFrameLocator = By.id("mce_0_ifr");
    private By iFrameBodyLocator = By.id("tinymce");


    // -------------------- Constructor --------------------

    public P22FramesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getNestedFramesLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(nestedFramesLinkLocator)
        );
    }

    private WebElement getiFrameLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(iFrameLinkLocator)
        );
    }

    private WebElement getFrameBodyElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(frameBodyLocator)
        );
    }

    private WebElement getiFrameBodyElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(iFrameBodyLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Frames page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Frames page header");

        return headerText;
    }

    @Step("Get Left frame text")
    public String getLeftFrameText() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(topFrameLocator)
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(leftFrameLocator)
        );

        String frameText = getFrameBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get Left frame text");

        return frameText;
    }

    @Step("Get Middle frame text")
    public String getMiddleFrameText() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(topFrameLocator)
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(middleFrameLocator)
        );

        String frameText = getFrameBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get Middle frame text");

        return frameText;
    }

    @Step("Get Right frame text")
    public String getRightFrameText() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(topFrameLocator)
        );

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(rightFrameLocator)
        );

        String frameText = getFrameBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get Right frame text");

        return frameText;
    }

    @Step("Get Bottom frame text")
    public String getBottomFrameText() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(bottomFrameLocator)
        );

        String frameText = getFrameBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get Bottom frame text");

        return frameText;
    }

    @Step("Get iFrame editor text")
    public String getiFrameText() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrameLocator)
        );

        String frameText = getiFrameBodyElement().getText();

        driver.switchTo().defaultContent();

        attachScreenshot("Get iFrame editor text");

        return frameText;
    }


    // -------------------- Page Actions --------------------

    @Step("Click Nested Frames link")
    public void clickNestedFrames() {

        getNestedFramesLinkElement().click();

        attachScreenshot("Click Nested Frames link");
    }

    @Step("Click iFrame link")
    public void clickiFrame() {

        getiFrameLinkElement().click();

        attachScreenshot("Click iFrame link");
    }
}