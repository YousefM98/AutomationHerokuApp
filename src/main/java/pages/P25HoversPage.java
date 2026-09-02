package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P25HoversPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    private By figuresLocator = By.cssSelector(".figure");
    private By captionsLocator = By.cssSelector(".figcaption");
    private By userNamesLocator = By.cssSelector(".figcaption h5");
    private By profileLinksLocator = By.cssSelector(".figcaption a");


    // -------------------- Constructor --------------------

    public P25HoversPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private List<WebElement> getFiguresElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(figuresLocator)
        );
    }

    private List<WebElement> getCaptionsElements() {
        return driver.findElements(captionsLocator);
    }

    private List<WebElement> getUserNamesElements() {
        return driver.findElements(userNamesLocator);
    }

    private List<WebElement> getProfileLinksElements() {
        return driver.findElements(profileLinksLocator);
    }


    // -------------------- Page Validation --------------------

    @Step("Get Hovers page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Hovers page header");

        return headerText;
    }

    @Step("Get hoverable figures count")
    public int getFiguresCount() {

        int figuresCount = getFiguresElements().size();

        attachScreenshot("Get hoverable figures count");

        return figuresCount;
    }

    @Step("Verify caption for figure {index} is displayed")
    public boolean isCaptionDisplayed(int index) {

        boolean displayed =
                getCaptionsElements()
                        .get(index)
                        .isDisplayed();

        attachScreenshot("Verify hover caption is displayed");

        return displayed;
    }

    @Step("Get username for figure {index}")
    public String getUserName(int index) {

        String userName =
                getUserNamesElements()
                        .get(index)
                        .getText();

        attachScreenshot("Get hover username");

        return userName;
    }

    @Step("Get profile link for figure {index}")
    public String getProfileLink(int index) {

        String profileLink =
                getProfileLinksElements()
                        .get(index)
                        .getAttribute("href");

        attachScreenshot("Get hover profile link");

        return profileLink;
    }


    // -------------------- Hover Actions --------------------

    @Step("Hover over figure {index}")
    public void hoverOverFigure(int index) {

        WebElement figure =
                getFiguresElements()
                        .get(index);

        Actions actions = new Actions(driver);

        actions.moveToElement(figure)
                .perform();

        wait.until(driver ->
                getCaptionsElements()
                        .get(index)
                        .isDisplayed()
        );

        attachScreenshot("Hover over figure");
    }
}