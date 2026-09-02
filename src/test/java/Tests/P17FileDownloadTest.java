package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P17FileDownloadPage;


public class P17FileDownloadTest extends BaseTest {


    @Epic("Page Seventeen Epic")
    @Feature("Covering File Download Feature")
    @Description("Verify File Download page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 18, description = "Verify that the File Download page displays the correct header")
    public void verifyFileDownloadPageHeader() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileDownload();
        P17FileDownloadPage p17FileDownloadPage = new P17FileDownloadPage(driver);
        Assert.assertEquals(p17FileDownloadPage.getHeaderText(), "File Downloader");
    }


    @Epic("Page Seventeen Epic")
    @Feature("Covering File Download Feature")
    @Description("Verify downloadable files are displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 18, description = "Verify that downloadable files are displayed on the File Download page")
    public void verifyDownloadFilesAreDisplayed() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileDownload();
        P17FileDownloadPage p17FileDownloadPage = new P17FileDownloadPage(driver);
        Assert.assertTrue(
                p17FileDownloadPage.getDownloadFilesCount() > 0,
                "At least one downloadable file should be displayed"
        );
    }


    @Epic("Page Seventeen Epic")
    @Feature("Covering File Download Feature")
    @Description("Verify downloadable file names")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 18, description = "Verify that downloadable files have valid file names")
    public void verifyDownloadFileNames() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileDownload();
        P17FileDownloadPage p17FileDownloadPage = new P17FileDownloadPage(driver);

        Assert.assertFalse(
                p17FileDownloadPage.getDownloadFileNames().isEmpty(),
                "Download file list should not be empty"
        );
    }


    @Epic("Page Seventeen Epic")
    @Feature("Covering File Download Feature")
    @Description("Verify file can be downloaded")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 18, description = "Verify that a downloadable file can be successfully downloaded")
    public void verifyFileCanBeDownloaded() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickFileDownload();
        P17FileDownloadPage p17FileDownloadPage = new P17FileDownloadPage(driver);

        String fileName = p17FileDownloadPage.getFirstDownloadFileName();

        p17FileDownloadPage.downloadFirstFile();

        Assert.assertTrue(
                p17FileDownloadPage.isFileDownloaded(fileName),
                "Downloaded file should exist"
        );
    }
}

