package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P43TyposPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By firstParagraphLocator =
            By.xpath("//*[@id='content']/div/p[1]");

    private By secondParagraphLocator =
            By.xpath("//*[@id='content']/div/p[2]");


    // -------------------- Constructor --------------------

    public P43TyposPage(WebDriver driver) {
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

    private WebElement getFirstParagraphElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        firstParagraphLocator
                )
        );
    }

    private WebElement getSecondParagraphElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        secondParagraphLocator
                )
        );
    }
    // -------------------- Page Validation --------------------

    @Step("Get Typos page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get Typos page header"
        );

        return headerText;
    }

    @Step("Get first paragraph text")
    public String getFirstParagraphText() {

        String paragraphText =
                getFirstParagraphElement().getText();

        attachScreenshot(
                "Get first paragraph text"
        );

        return paragraphText;
    }

    @Step("Get second paragraph text")
    public String getSecondParagraphText() {

        String paragraphText =
                getSecondParagraphElement().getText();

        attachScreenshot(
                "Get second paragraph text"
        );

        return paragraphText;
    }

    @Step("Verify first paragraph is displayed")
    public boolean isFirstParagraphDisplayed() {

        boolean displayed =
                getFirstParagraphElement().isDisplayed();

        attachScreenshot(
                "Verify first paragraph is displayed"
        );

        return displayed;
    }

    @Step("Verify second paragraph is displayed")
    public boolean isSecondParagraphDisplayed() {

        boolean displayed =
                getSecondParagraphElement().isDisplayed();

        attachScreenshot(
                "Verify second paragraph is displayed"
        );

        return displayed;
    }

    @Step("Verify first paragraph is not empty")
    public boolean isFirstParagraphNotEmpty() {

        boolean notEmpty =
                !getFirstParagraphElement()
                        .getText()
                        .isEmpty();

        attachScreenshot(
                "Verify first paragraph is not empty"
        );

        return notEmpty;
    }

    @Step("Verify second paragraph is not empty")
    public boolean isSecondParagraphNotEmpty() {

        boolean notEmpty =
                !getSecondParagraphElement()
                        .getText()
                        .isEmpty();

        attachScreenshot(
                "Verify second paragraph is not empty"
        );

        return notEmpty;
    }
    @Step("Verify second paragraph contains one of the expected versions")
    public boolean isSecondParagraphValid() {

        String paragraphText =
                getSecondParagraphElement().getText();

        boolean valid =
                paragraphText.equals(
                        "Sometimes you'll see a typo, other times you won't."
                )
                        ||
                        paragraphText.equals(
                                "Sometimes you'll see a typo, other times you won,t."
                        );

        attachScreenshot(
                "Verify second paragraph contains one of the expected versions"
        );

        return valid;
    }}