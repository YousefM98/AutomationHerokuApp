package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class P4BrokenImagesPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the Broken Images page header
    private By headerLocator = By.xpath(
            "//*[@id='content']/div/h3"
    );

    // Locates the first image
    private By firstImageLocator = By.xpath(
            "//*[@class='example']/img[1]"
    );

    // Locates the second image
    private By secondImageLocator = By.xpath(
            "//*[@class='example']/img[2]"
    );

    // Locates the third image
    private By thirdImageLocator = By.xpath(
            "//*[@class='example']/img[3]"
    );

    // Locates all images on the page
    private By imagesLocator = By.xpath(
            "//*[@class='example']/img"
    );


    // -------------------- Constructor --------------------

    public P4BrokenImagesPage(WebDriver driver) {
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

    // Waits until the first image is visible
    private WebElement getFirstImageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        firstImageLocator
                )
        );
    }

    // Waits until the second image is visible
    private WebElement getSecondImageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        secondImageLocator
                )
        );
    }

    // Waits until the third image is visible
    private WebElement getThirdImageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        thirdImageLocator
                )
        );
    }


    // -------------------- Image Validation --------------------

    // Checks whether an image has successfully loaded
    public boolean isImageLoaded(WebElement image) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        return (Boolean) js.executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0;", image);
    }


    // Checks whether the first image is loaded
    @Step("Verify first image is loaded")
    public boolean isFirstImageLoaded() {

        boolean loaded = isImageLoaded(getFirstImageElement());

        attachScreenshot("Verify first image is loaded");

        return loaded;
    }

    // Checks whether the second image is loaded
    @Step("Verify second image is loaded")
    public boolean isSecondImageLoaded() {

        boolean loaded = isImageLoaded(getSecondImageElement());

        attachScreenshot("Verify second image is loaded");

        return loaded;
    }

    // Checks whether the third image is loaded
    @Step("Verify third image is loaded")
    public boolean isThirdImageLoaded() {

        boolean loaded = isImageLoaded(getThirdImageElement());

        attachScreenshot("Verify third image is loaded");

        return loaded;
    }


    // -------------------- Image Dimensions --------------------

    // Returns the first image width
    @Step("Get first image width")
    public String getFirstImageWidth() {

        String width = getFirstImageElement()
                .getCssValue("width");

        attachScreenshot("Get first image width");

        return width;
    }

    // Returns the first image height
    @Step("Get first image height")
    public String getFirstImageHeight() {

        String height = getFirstImageElement()
                .getCssValue("height");

        attachScreenshot("Get first image height");

        return height;
    }

    // Returns the second image width
    @Step("Get second image width")
    public String getSecondImageWidth() {

        String width = getSecondImageElement()
                .getCssValue("width");

        attachScreenshot("Get second image width");

        return width;
    }

    // Returns the second image height
    @Step("Get second image height")
    public String getSecondImageHeight() {

        String height = getSecondImageElement()
                .getCssValue("height");

        attachScreenshot("Get second image height");

        return height;
    }

    // Returns the third image width
    @Step("Get third image width")
    public String getThirdImageWidth() {

        String width = getThirdImageElement()
                .getCssValue("width");

        attachScreenshot("Get third image width");

        return width;
    }

    // Returns the third image height
    @Step("Get third image height")
    public String getThirdImageHeight() {

        String height = getThirdImageElement()
                .getCssValue("height");

        attachScreenshot("Get third image height");

        return height;
    }


    // -------------------- Page Validation --------------------

    // Returns the text displayed in the page header
    @Step("Get Broken Images page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Broken Images page header");

        return headerText;
    }

    // Returns the total number of images on the page
    @Step("Get number of images")
    public int getImagesCount() {

        int imageCount = driver.findElements(imagesLocator).size();

        attachScreenshot("Get number of images");

        return imageCount;
    }
}


