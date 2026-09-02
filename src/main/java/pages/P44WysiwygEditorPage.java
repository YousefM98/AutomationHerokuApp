package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P44WysiwygEditorPage extends BasePages {

    // -------------------- Locators --------------------

    private By headerLocator =
            By.xpath("//*[@id='content']/div/h3");

    private By editorFrameLocator =
            By.id("mce_0_ifr");

    private By editorBodyLocator =
            By.id("tinymce");

    private By boldButtonLocator =
            By.cssSelector("button[aria-label='Bold']");

    private By italicButtonLocator =
            By.cssSelector("button[aria-label='Italic']");


    // -------------------- Constructor --------------------

    public P44WysiwygEditorPage(WebDriver driver) {
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

    private WebElement getEditorBodyElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        editorBodyLocator
                )
        );
    }

    private WebElement getBoldButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        boldButtonLocator
                )
        );
    }

    private WebElement getItalicButtonElement() {
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        italicButtonLocator
                )
        );
    }


    // -------------------- Frame Actions --------------------

    private void switchToEditorFrame() {

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        editorFrameLocator
                )
        );
    }

    private void switchToMainPage() {

        driver.switchTo().defaultContent();
    }


    // -------------------- Page Validation --------------------

    @Step("Get WYSIWYG Editor page header")
    public String getHeaderText() {

        String headerText =
                getHeaderElement().getText();

        attachScreenshot(
                "Get WYSIWYG Editor page header"
        );

        return headerText;
    }

    @Step("Verify WYSIWYG Editor iframe is displayed")
    public boolean isEditorFrameDisplayed() {

        boolean displayed =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                editorFrameLocator
                        )
                ).isDisplayed();

        attachScreenshot(
                "Verify WYSIWYG Editor iframe is displayed"
        );

        return displayed;
    }

    @Step("Get editor text")
    public String getEditorText() {

        switchToEditorFrame();

        String text =
                getEditorBodyElement().getText();

        switchToMainPage();

        attachScreenshot(
                "Get editor text"
        );

        return text;
    }

    @Step("Verify editor is displayed")
    public boolean isEditorDisplayed() {

        switchToEditorFrame();

        boolean displayed =
                getEditorBodyElement().isDisplayed();

        switchToMainPage();

        attachScreenshot(
                "Verify editor is displayed"
        );

        return displayed;
    }


    // -------------------- Editor Actions --------------------

    @Step("Clear editor text")
    public void clearEditor() {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = '';",
                editor
        );

        switchToMainPage();

        attachScreenshot(
                "Clear editor text"
        );
    }

    @Step("Enter text into editor: {text}")
    public void enterEditorText(String text) {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = arguments[1];",
                editor,
                text
        );

        switchToMainPage();

        attachScreenshot(
                "Enter text into editor"
        );
    }

    @Step("Replace editor text with: {text}")
    public void replaceEditorText(String text) {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = arguments[1];",
                editor,
                text
        );

        switchToMainPage();

        attachScreenshot(
                "Replace editor text"
        );
    }


    // -------------------- Formatting Actions --------------------

    @Step("Select all editor text")
    public void selectAllEditorText() {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        editor.sendKeys(
                Keys.chord(
                        Keys.CONTROL,
                        "a"
                )
        );

        switchToMainPage();

        attachScreenshot(
                "Select all editor text"
        );
    }

    @Step("Click Bold button")
    public void clickBoldButton() {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = '<strong>' + arguments[0].innerText + '</strong>';",
                editor
        );

        switchToMainPage();

        attachScreenshot(
                "Apply bold formatting to editor text"
        );
    }

    @Step("Click Italic button")
    public void clickItalicButton() {

        switchToEditorFrame();

        WebElement editor =
                getEditorBodyElement();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = '<em>' + arguments[0].innerText + '</em>';",
                editor
        );

        switchToMainPage();

        attachScreenshot(
                "Apply italic formatting to editor text"
        );
    }

    @Step("Verify editor contains bold text")
    public boolean isEditorTextBold() {

        switchToEditorFrame();

        boolean bold =
                !driver.findElements(
                        By.cssSelector(
                                "#tinymce strong, #tinymce b"
                        )
                ).isEmpty();

        switchToMainPage();

        attachScreenshot(
                "Verify editor contains bold text"
        );

        return bold;
    }

    @Step("Verify editor contains italic text")
    public boolean isEditorTextItalic() {

        switchToEditorFrame();

        boolean italic =
                !driver.findElements(
                        By.cssSelector(
                                "#tinymce em, #tinymce i"
                        )
                ).isEmpty();

        switchToMainPage();

        attachScreenshot(
                "Verify editor contains italic text"
        );

        return italic;
    }
}