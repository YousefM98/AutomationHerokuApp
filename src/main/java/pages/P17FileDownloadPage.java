package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class P17FileDownloadPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the File Download page header
    private By headerLocator = By.xpath("//*[@id='content']/div/h3");

    // Locates all downloadable file links
    private By downloadLinksLocator = By.cssSelector(".example a");


    // -------------------- Constructor --------------------

    public P17FileDownloadPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Returns the File Download page header after waiting for it to be visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    // Returns all downloadable file links after waiting for at least one link
    private List<WebElement> getDownloadLinksElements() {
        return wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(downloadLinksLocator)
        );
    }

    // Returns the first downloadable file link
    private WebElement getFirstDownloadLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(downloadLinksLocator)
        );
    }


    // -------------------- Page Validation --------------------

    // Returns the File Download page header text
    @Step("Get File Download page header")
    public String getHeaderText() {
        String headerText = getHeaderElement().getText();
        attachScreenshot("Get File Download page header");
        return headerText;
    }

    // Returns the number of downloadable files
    @Step("Get downloadable files count")
    public int getDownloadFilesCount() {
        int filesCount = getDownloadLinksElements().size();
        attachScreenshot("Get downloadable files count");
        return filesCount;
    }

    // Returns the name of the first downloadable file
    @Step("Get first downloadable file name")
    public String getFirstDownloadFileName() {
        String fileName = getFirstDownloadLinkElement().getText();
        attachScreenshot("Get first downloadable file name");
        return fileName;
    }

    // Returns all downloadable file names
    @Step("Get downloadable file names")
    public List<String> getDownloadFileNames() {

        List<String> fileNames = new ArrayList<>();

        for (WebElement downloadLink : getDownloadLinksElements()) {
            fileNames.add(downloadLink.getText());
        }

        attachScreenshot("Get downloadable file names");

        return fileNames;
    }

    // -------------------- File Validation --------------------

    // Verifies that the specified file has been downloaded
    @Step("Verify file is downloaded")
    public boolean isFileDownloaded(String fileName) {
        Path filePath = Paths.get(
                System.getProperty("user.dir"),
                "downloads",
                fileName
        );

        boolean downloaded = wait.until(driver -> Files.exists(filePath));

        attachScreenshot("Verify file is downloaded");

        return downloaded;
    }

    // -------------------- Download Actions --------------------

    // Clicks the first downloadable file
    @Step("Download the first available file")
    public void downloadFirstFile() {

        getFirstDownloadLinkElement().click();

        attachScreenshot("Download the first available file");
    }


    // -------------------- Page Actions --------------------

    // Refreshes the File Download page
    @Step("Refresh File Download page")
    public void refreshPage() {

        driver.navigate().refresh();

        // Wait for the page to reload
        getHeaderElement();

        attachScreenshot("Refresh File Download page");
    }
}



