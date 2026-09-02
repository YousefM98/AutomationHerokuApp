package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class P18FileUploadPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div[1]/h3");
    private By chooseFileLocator = By.id("file-upload");
    private By uploadButtonLocator = By.id("file-submit");
    private By uploadedHeaderLocator = By.xpath("//*[@id='content']/div/h3");
    private By uploadedFileNameLocator = By.id("uploaded-files");


    // -------------------- Constructor --------------------

    public P18FileUploadPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getChooseFileElement() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(chooseFileLocator)
        );
    }

    private WebElement getUploadButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(uploadButtonLocator)
        );
    }

    private WebElement getUploadedHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(uploadedHeaderLocator)
        );
    }

    private WebElement getUploadedFileNameElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(uploadedFileNameLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get File Upload page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get File Upload page header");

        return headerText;
    }

    @Step("Get selected file path")
    public String getSelectedFilePath() {

        String filePath = getChooseFileElement().getAttribute("value");

        attachScreenshot("Get selected file path");

        return filePath;
    }

    @Step("Get successful upload header")
    public String getUploadedHeaderText() {

        String headerText = getUploadedHeaderElement().getText();

        attachScreenshot("Get successful upload header");

        return headerText;
    }

    @Step("Get uploaded file name")
    public String getUploadedFileName() {

        String fileName = getUploadedFileNameElement().getText();

        attachScreenshot("Get uploaded file name");

        return fileName;
    }


    // -------------------- File Upload Actions --------------------

    @Step("Choose file for upload")
    public void chooseFile(String filePath) {

        getChooseFileElement().sendKeys(filePath);

        attachScreenshot("Choose file for upload");
    }

    @Step("Click Upload button")
    public void clickUploadButton() {

        getUploadButtonElement().click();

        attachScreenshot("Click Upload button");
    }
}



