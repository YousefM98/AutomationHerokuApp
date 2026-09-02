package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P35NotificationMessagesPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By clickHereLinkLocator =
            By.linkText("Click here");

    private By notificationMessageLocator =
            By.id("flash");


    // -------------------- Constructor --------------------

    public P35NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }

    private WebElement getClickHereLinkElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(clickHereLinkLocator)
        );
    }

    private WebElement getNotificationMessageElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(notificationMessageLocator)
        );
    }


    // -------------------- Page Validation --------------------

    @Step("Get Notification Messages page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot("Get Notification Messages page header");

        return headerText;
    }

    @Step("Verify Click here link is displayed")
    public boolean isClickHereLinkDisplayed() {

        boolean displayed =
                getClickHereLinkElement().isDisplayed();

        attachScreenshot("Verify Click here link is displayed");

        return displayed;
    }

    @Step("Get notification message")
    public String getNotificationMessageText() {

        String notificationText =
                getNotificationMessageElement().getText()
                        .replace("×", "")
                        .trim();

        attachScreenshot("Get notification message");

        return notificationText;
    }

    @Step("Verify notification message is displayed")
    public boolean isNotificationMessageDisplayed() {

        boolean displayed =
                getNotificationMessageElement().isDisplayed();

        attachScreenshot("Verify notification message is displayed");

        return displayed;
    }

    @Step("Verify notification message is valid")
    public boolean isNotificationMessageValid() {

        String message =
                getNotificationMessageText();

        boolean valid =
                message.equals("Action successful")
                        || message.equals("Action unsuccesful, please try again")
                        || message.equals("Action unsuccessful");

        attachScreenshot("Verify notification message is valid");

        return valid;
    }


    // -------------------- Notification Actions --------------------

    @Step("Click notification message link")
    public void clickHere() {

        getClickHereLinkElement().click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        notificationMessageLocator
                )
        );

        attachScreenshot("Click notification message link");
    }
}