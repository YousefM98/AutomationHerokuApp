package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P39ShiftingContentPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By descriptionLocator =
            By.xpath("//*[@id='content']/div/p[1]");

    private By menuElementLinkLocator =
            By.linkText("Example 1: Menu Element");

    private By imageLinkLocator =
            By.linkText("Example 2: An image");

    private By listLinkLocator =
            By.linkText("Example 3: List");

    private By exampleLinksLocator =
            By.cssSelector("#content .example a");


    // -------------------- Constructor --------------------

    public P39ShiftingContentPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        headerLocator
                )
        );
    }

    private WebElement getDescriptionElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        descriptionLocator
                )
        );
    }

    private WebElement getMenuElementLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        menuElementLinkLocator
                )
        );
    }

    private WebElement getImageLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        imageLinkLocator
                )
        );
    }

    private WebElement getListLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        listLinkLocator
                )
        );
    }

    private List<WebElement> getExampleLinksElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        exampleLinksLocator
                )
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Shifting Content page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Shifting Content page header"
        );

        return headerText;
    }

    @Step("Get Shifting Content page description")
    public String getDescriptionText() {

        String description =
                getDescriptionElement().getText();

        attachScreenshot(
                "Get Shifting Content page description"
        );

        return description;
    }

    @Step("Get shifting content examples count")
    public int getExamplesCount() {

        int count =
                getExampleLinksElements().size();

        attachScreenshot(
                "Get shifting content examples count"
        );

        return count;
    }

    @Step("Verify Menu Element example link is displayed")
    public boolean isMenuElementLinkDisplayed() {

        boolean displayed =
                getMenuElementLinkElement().isDisplayed();

        attachScreenshot(
                "Verify Menu Element example link is displayed"
        );

        return displayed;
    }

    @Step("Verify Image example link is displayed")
    public boolean isImageLinkDisplayed() {

        boolean displayed =
                getImageLinkElement().isDisplayed();

        attachScreenshot(
                "Verify Image example link is displayed"
        );

        return displayed;
    }

    @Step("Verify List example link is displayed")
    public boolean isListLinkDisplayed() {

        boolean displayed =
                getListLinkElement().isDisplayed();

        attachScreenshot(
                "Verify List example link is displayed"
        );

        return displayed;
    }

    @Step("Get shifting content example names")
    public List<String> getExampleNames() {

        List<String> examples =
                getExampleLinksElements()
                        .stream()
                        .map(WebElement::getText)
                        .toList();

        attachScreenshot(
                "Get shifting content example names"
        );

        return examples;
    }

    @Step("Get current page URL")
    public String getCurrentPageUrl() {

        String url =
                driver.getCurrentUrl();

        attachScreenshot(
                "Get current page URL"
        );

        return url;
    }


    // -------------------- Navigation Actions --------------------

    @Step("Click Menu Element shifting content example")
    public void clickMenuElement() {

        getMenuElementLinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/shifting_content/menu"
                )
        );

        attachScreenshot(
                "Click Menu Element shifting content example"
        );
    }

    @Step("Click Image shifting content example")
    public void clickImage() {

        getImageLinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/shifting_content/image"
                )
        );

        attachScreenshot(
                "Click Image shifting content example"
        );
    }

    @Step("Click List shifting content example")
    public void clickList() {

        getListLinkElement().click();

        wait.until(
                ExpectedConditions.urlContains(
                        "/shifting_content/list"
                )
        );

        attachScreenshot(
                "Click List shifting content example"
        );
    }
}