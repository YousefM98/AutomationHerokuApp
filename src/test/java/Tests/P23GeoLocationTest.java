package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P23GeoLocationPage;

//PCs don't have a GPS chip, A mock location is implemented in chrome driver in base tests
public class P23GeoLocationTest extends BaseTest {


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify Geolocation page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that the Geolocation page displays the correct header")
    public void verifyGeoLocationPageHeader() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        Assert.assertEquals(
                p23GeoLocationPage.getHeaderText(),
                "Geolocation"
        );
    }


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify Geolocation instruction text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that the Geolocation page displays the correct instruction text")
    public void verifyGeoLocationInstructionText() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        Assert.assertEquals(
                p23GeoLocationPage.getInstructionText(),
                "Click the button to get your current latitude and longitude"
        );
    }


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify Where am I button is displayed")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that the Where am I button is displayed")
    public void verifyWhereAmIButtonIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        Assert.assertTrue(
                p23GeoLocationPage.isWhereAmIButtonDisplayed(),
                "Where am I button should be displayed"
        );
    }


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify latitude is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that latitude is displayed after clicking Where am I")
    public void verifyLatitudeIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        p23GeoLocationPage.clickWhereAmIButton();

        Assert.assertFalse(
                p23GeoLocationPage.getLatitude().isEmpty(),
                "Latitude should be displayed"
        );
    }


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify longitude is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that longitude is displayed after clicking Where am I")
    public void verifyLongitudeIsDisplayed() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        p23GeoLocationPage.clickWhereAmIButton();

        Assert.assertFalse(
                p23GeoLocationPage.getLongitude().isEmpty(),
                "Longitude should be displayed"
        );
    }


    @Epic("Page Twenty Three Epic")
    @Feature("Covering Geolocation Feature")
    @Description("Verify latitude and longitude are valid numbers")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 23, description = "Verify that returned latitude and longitude values are valid numeric coordinates")
    public void verifyGeoLocationCoordinatesAreValid() {

        P0_mainPage p0_mainPage = new P0_mainPage(driver);

        p0_mainPage.clickGeoLocation();

        P23GeoLocationPage p23GeoLocationPage =
                new P23GeoLocationPage(driver);

        p23GeoLocationPage.clickWhereAmIButton();

        double latitude =
                Double.parseDouble(
                        p23GeoLocationPage.getLatitude()
                );

        double longitude =
                Double.parseDouble(
                        p23GeoLocationPage.getLongitude()
                );

        Assert.assertTrue(
                latitude >= -90 && latitude <= 90,
                "Latitude should be between -90 and 90"
        );

        Assert.assertTrue(
                longitude >= -180 && longitude <= 180,
                "Longitude should be between -180 and 180"
        );
    }
}