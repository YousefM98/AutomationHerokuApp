package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class P19FloatingMenuPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator = By.xpath("//*[@id='content']/div/h3");
    private By floatingMenuLocator = By.id("menu");
    private By menuItemsLocator = By.cssSelector("#menu a");
    private By homeLocator = By.cssSelector("#menu a[href='#home']");
    private By newsLocator = By.cssSelector("#menu a[href='#news']");
    private By contactLocator = By.cssSelector("#menu a[href='#contact']");
    private By aboutLocator = By.cssSelector("#menu a[href='#about']");


    // -------------------- Constructor --------------------

    public P19FloatingMenuPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getFloatingMenuElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(floatingMenuLocator)
        );
    }

    private List<WebElement> getMenuItemsElements() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(menuItemsLocator)
        );
    }

    private WebElement getHomeElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(homeLocator)
        );
    }

    private WebElement getNewsElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(newsLocator)
        );
    }

    private WebElement getContactElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(contactLocator)
        );
    }

    private WebElement getAboutElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(aboutLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Floating Menu page header")
    public String getHeaderText() {

        String headerText = getHeaderElement().getText();

        attachScreenshot("Get Floating Menu page header");

        return headerText;
    }

    @Step("Get floating menu items count")
    public int getMenuItemsCount() {

        int menuItemsCount = getMenuItemsElements().size();

        attachScreenshot("Get floating menu items count");

        return menuItemsCount;
    }

    @Step("Get floating menu items text")
    public List<String> getMenuItemsText() {

        List<String> menuItemsText = getMenuItemsElements()
                .stream()
                .map(WebElement::getText)
                .toList();

        attachScreenshot("Get floating menu items text");

        return menuItemsText;
    }

    @Step("Verify floating menu is displayed")
    public boolean isFloatingMenuDisplayed() {

        boolean displayed = getFloatingMenuElement().isDisplayed();

        attachScreenshot("Verify floating menu is displayed");

        return displayed;
    }

    @Step("Get floating menu position")
    public String getFloatingMenuPosition() {

        String position = getFloatingMenuElement()
                .getCssValue("position");

        attachScreenshot("Get floating menu position");

        return position;
    }


    // -------------------- Scroll Actions --------------------

    @Step("Scroll to the bottom of the page")
    public void scrollToBottom() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight);"
        );

        attachScreenshot("Scroll to the bottom of the page");
    }


    // -------------------- Menu Actions --------------------

    @Step("Click Home menu item")
    public void clickHome() {

        getHomeElement().click();

        attachScreenshot("Click Home menu item");
    }

    @Step("Click News menu item")
    public void clickNews() {

        getNewsElement().click();

        attachScreenshot("Click News menu item");
    }

    @Step("Click Contact menu item")
    public void clickContact() {

        getContactElement().click();

        attachScreenshot("Click Contact menu item");
    }

    @Step("Click About menu item")
    public void clickAbout() {

        getAboutElement().click();

        attachScreenshot("Click About menu item");
    }
}
