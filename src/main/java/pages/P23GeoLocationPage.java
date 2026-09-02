package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;


public class P23GeoLocationPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    private By instructionTextLocator = By.xpath("//*[@id='content']/div/p");
    private By whereAmIButtonLocator = By.xpath("//button[text()='Where am I?']");
    private By latitudeLocator = By.id("lat-value");
    private By longitudeLocator = By.id("long-value");


    // -------------------- Constructor --------------------

    public P23GeoLocationPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getInstructionTextElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(instructionTextLocator)
        );
    }

    private WebElement getWhereAmIButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(whereAmIButtonLocator)
        );
    }

    private WebElement getLatitudeElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(latitudeLocator)
        );
    }

    private WebElement getLongitudeElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(longitudeLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Geolocation page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Geolocation page header");

        return headerText;
    }

    @Step("Get Geolocation instruction text")
    public String getInstructionText() {

        String instructionText =
                getInstructionTextElement().getText();

        attachScreenshot("Get Geolocation instruction text");

        return instructionText;
    }

    @Step("Verify Where am I button is displayed")
    public boolean isWhereAmIButtonDisplayed() {

        boolean displayed =
                getWhereAmIButtonElement().isDisplayed();

        attachScreenshot("Verify Where am I button is displayed");

        return displayed;
    }

    @Step("Get latitude")
    public String getLatitude() {

        String latitude =
                getLatitudeElement().getText();

        attachScreenshot("Get latitude");

        return latitude;
    }

    @Step("Get longitude")
    public String getLongitude() {

        String longitude =
                getLongitudeElement().getText();

        attachScreenshot("Get longitude");

        return longitude;
    }


    // -------------------- Page Actions --------------------

    @Step("Click Where am I button")
    public void clickWhereAmIButton() {

        getWhereAmIButtonElement().click();

        attachScreenshot("Click Where am I button");
    }

}