package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class P37SecureFileDownloadPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By downloadLinksLocator =
            By.cssSelector(".example a");


    // -------------------- Constructor --------------------

    public P37SecureFileDownloadPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private List<WebElement> getDownloadLinksElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        downloadLinksLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Secure File Download page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Secure File Download page header");

        return headerText;
    }

    @Step("Get secure download files count")
    public int getDownloadFilesCount() {

        int filesCount =
                getDownloadLinksElements().size();

        attachScreenshot("Get secure download files count");

        return filesCount;
    }

    @Step("Get first secure download file name")
    public String getFirstDownloadFileName() {

        String fileName =
                getDownloadLinksElements()
                        .get(0)
                        .getText();

        attachScreenshot("Get first secure download file name");

        return fileName;
    }

    @Step("Get secure download file names")
    public List<String> getDownloadFileNames() {

        List<String> fileNames =
                getDownloadLinksElements()
                        .stream()
                        .map(WebElement::getText)
                        .toList();

        attachScreenshot("Get secure download file names");

        return fileNames;
    }

    @Step("Verify secure download files exist")
    public boolean areDownloadFilesAvailable() {

        boolean available =
                !getDownloadLinksElements().isEmpty();

        attachScreenshot("Verify secure download files exist");

        return available;
    }

    @Step("Verify file {fileName} is downloaded")
    public boolean isFileDownloaded(String fileName) {

        Path filePath =
                Paths.get(
                        System.getProperty("user.dir"),
                        "downloads",
                        fileName
                );

        boolean downloaded =
                wait.until(driver ->
                        Files.exists(filePath)
                );

        attachScreenshot("Verify secure file is downloaded");

        return downloaded;
    }


    // -------------------- Download Actions --------------------

    @Step("Download first secure file")
    public void downloadFirstFile() {

        getDownloadLinksElements()
                .get(0)
                .click();

        attachScreenshot("Download first secure file");
    }
    @Step("Delete downloaded file {fileName} if it exists")
    public void deleteDownloadedFile(String fileName) {

        Path filePath =
                Paths.get(
                        System.getProperty("user.dir"),
                        "downloads",
                        fileName
                );

        try {
            Files.deleteIfExists(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        attachScreenshot("Delete existing downloaded file");
    }
    @Step("Authenticate to Secure File Download page")
    public void authenticate(String username, String password) {

        ((HasAuthentication) driver).register(
                uri -> uri.getHost().contains("the-internet.herokuapp.com"),
                UsernameAndPassword.of(username, password)
        );

        attachScreenshot("Register secure file download authentication");
    }
}