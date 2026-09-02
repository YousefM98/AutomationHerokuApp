package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P37SecureFileDownloadPage;

import java.util.List;


public class P37SecureFileDownloadTest extends BaseTest {


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify Secure File Download page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that the Secure File Download page displays the correct header")
    public void verifySecureFileDownloadPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();

        Assert.assertEquals(
                p37SecureFileDownloadPage.getHeaderText(),
                "Secure File Downloader"
        );
    }


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify secure downloadable files exist")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that downloadable files are available on the Secure File Download page")
    public void verifySecureDownloadFilesAreAvailable() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();
        Assert.assertTrue(
                p37SecureFileDownloadPage.areDownloadFilesAvailable(),
                "At least one secure downloadable file should exist"
        );
    }


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify secure download files count")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that the Secure File Download page contains downloadable files")
    public void verifySecureDownloadFilesCount() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();
        Assert.assertTrue(
                p37SecureFileDownloadPage.getDownloadFilesCount() > 0,
                "Secure File Download page should contain at least one file"
        );
    }


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify first secure file has a valid name")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that the first secure downloadable file has a non-empty name")
    public void verifyFirstSecureDownloadFileName() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();
        Assert.assertFalse(
                p37SecureFileDownloadPage
                        .getFirstDownloadFileName()
                        .isEmpty(),
                "Secure download file name should not be empty"
        );
    }


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify secure download filenames can be retrieved")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that downloadable secure file names can be retrieved")
    public void verifySecureDownloadFileNamesCanBeRetrieved() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();
        List<String> fileNames =
                p37SecureFileDownloadPage.getDownloadFileNames();

        Assert.assertFalse(
                fileNames.isEmpty(),
                "Secure file names list should not be empty"
        );

        Assert.assertTrue(
                fileNames.stream()
                        .allMatch(fileName -> !fileName.isBlank()),
                "All secure downloadable files should have a name"
        );
    }


    @Epic("Page Thirty Seven Epic")
    @Feature("Covering Secure File Download Feature")
    @Description("Verify secure file can be downloaded")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 37,
            description = "Verify that a file can be downloaded from the Secure File Download page")
    public void verifySecureFileCanBeDownloaded() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);
        P37SecureFileDownloadPage p37SecureFileDownloadPage =
                new P37SecureFileDownloadPage(driver);
        p37SecureFileDownloadPage.authenticate(
                "admin",
                "admin"
        );
        p0_mainPage.clickSecureFileDownload();
        String fileName =
                p37SecureFileDownloadPage.getFirstDownloadFileName();

        p37SecureFileDownloadPage.deleteDownloadedFile(fileName);

        p37SecureFileDownloadPage.downloadFirstFile();

        Assert.assertTrue(
                p37SecureFileDownloadPage.isFileDownloaded(fileName),
                "Secure file should be downloaded successfully"
        );
    }
}