package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P4BrokenImagesPage;
public class P4BrokenImagesTest extends BaseTest {


        @Epic("Page Four Epic")
        @Feature("Covering Broken Images Feature")
        @Description("validate That Broken Images Header is Broken images")
        @Severity(SeverityLevel.BLOCKER)
        @Owner("Yousef Mohsen")
        @Test(groups = "smoke", priority = 5, description = "validate That Broken Images Header is Broken images")
        public void validateBrokenImagesHeader() {
            P0_mainPage p0_mainPage = new P0_mainPage(driver);
            p0_mainPage.clickBrokenImages();
            P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
            Assert.assertEquals(p4BrokenImagesPage.getHeaderText(), "Broken Images");
        }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That number of images is 3")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That number of images is 3")
    public void validateNumberOfImages() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertEquals(p4BrokenImagesPage.getImagesCount(), 3);
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That First Image exists with 90 height and 120 width")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That First Image exists with 90 height and 120 width")
    public void validateFirstImageExistenceAndDimensions() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertEquals(p4BrokenImagesPage.getFirstImageHeight(), "90px");
        Assert.assertEquals(p4BrokenImagesPage.getFirstImageWidth(), "120px");
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That First Image is Broken")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That First Image is Broken")
    public void validateFirstImageisBroken() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertFalse(p4BrokenImagesPage.isFirstImageLoaded(), "First image should be broken");
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That Second Image exists with 90 height and 120 width")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That Second Image exists with 90 height and 120 width")
    public void validateSecondImageExistenceAndDimensions() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertEquals(p4BrokenImagesPage.getSecondImageHeight(), "90px");
        Assert.assertEquals(p4BrokenImagesPage.getSecondImageWidth(), "120px");
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That Second Image is Broken")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That Second Image is Broken")
    public void validateSecondImageisBroken() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertFalse(p4BrokenImagesPage.isSecondImageLoaded(), "Second image should be broken");
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That Third Image exists with 90 height and 120 width")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That Third Image exists with 90 height and 120 width")
    public void validateThirdImageExistenceAndDimensions() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertEquals(p4BrokenImagesPage.getThirdImageHeight(), "90px");
        Assert.assertEquals(p4BrokenImagesPage.getThirdImageWidth(), "120px");
    }

    @Epic("Page Four Epic")
    @Feature("Covering Broken Images Feature")
    @Description("validate That Third image is Loaded")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 5, description = "validate That Third image is Loaded")
    public void validateThirdImageIsLoaded() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickBrokenImages();
        P4BrokenImagesPage p4BrokenImagesPage = new P4BrokenImagesPage(driver);
        Assert.assertTrue(p4BrokenImagesPage.isThirdImageLoaded(), "Third image should be Loaded");
    }
    }



