package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P17FileDownloadPage;
import pages.P18FileUploadPage;

import java.io.File;


public class P18FileUploadTest extends BaseTest {


    @Epic("Page Eighteen Epic")
    @Feature("Covering File Upload Feature")
    @Description("Verify File Upload page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the File Upload page displays the correct header")
    public void verifyFileUploadPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFileUpload();

        P18FileUploadPage p18FileUploadPage =
                new P18FileUploadPage(driver);

        Assert.assertEquals(
                p18FileUploadPage.getHeaderText(),
                "File Uploader"
        );
    }


    @Epic("Page Eighteen Epic")
    @Feature("Covering File Upload Feature")
    @Description("Verify file can be selected for upload")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that a file can be selected for upload")
    public void verifyFileCanBeSelected() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFileUpload();

        P18FileUploadPage p18FileUploadPage =
                new P18FileUploadPage(driver);

        String filePath =
                System.getProperty("user.dir")
                        + File.separator
                        + "src"
                        + File.separator
                        + "test"
                        + File.separator
                        + "resources"
                        + File.separator
                        + "uploadTest.txt";

        p18FileUploadPage.chooseFile(filePath);

        Assert.assertTrue(
                p18FileUploadPage.getSelectedFilePath()
                        .contains("uploadTest.txt"),
                "Selected file should be uploadTest.txt"
        );
    }


    @Epic("Page Eighteen Epic")
    @Feature("Covering File Upload Feature")
    @Description("Verify file can be successfully uploaded")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that a selected file can be successfully uploaded")
    public void verifyFileCanBeUploaded() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFileUpload();

        P18FileUploadPage p18FileUploadPage =
                new P18FileUploadPage(driver);

        String filePath =
                System.getProperty("user.dir")
                        + File.separator
                        + "src"
                        + File.separator
                        + "test"
                        + File.separator
                        + "resources"
                        + File.separator
                        + "uploadTest.txt";

        p18FileUploadPage.chooseFile(filePath);

        p18FileUploadPage.clickUploadButton();

        Assert.assertEquals(
                p18FileUploadPage.getUploadedHeaderText(),
                "File Uploaded!"
        );
    }


    @Epic("Page Eighteen Epic")
    @Feature("Covering File Upload Feature")
    @Description("Verify uploaded file name")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 19, description = "Verify that the uploaded file name is displayed correctly")
    public void verifyUploadedFileName() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickFileUpload();

        P18FileUploadPage p18FileUploadPage =
                new P18FileUploadPage(driver);

        String filePath =
                System.getProperty("user.dir")
                        + File.separator
                        + "src"
                        + File.separator
                        + "test"
                        + File.separator
                        + "resources"
                        + File.separator
                        + "uploadTest.txt";

        p18FileUploadPage.chooseFile(filePath);

        p18FileUploadPage.clickUploadButton();

        Assert.assertEquals(
                p18FileUploadPage.getUploadedFileName(),
                "uploadTest.txt"
        );
    }
}