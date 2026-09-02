package pages;
import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P1ABPage extends BasePages {

    // -------------------- Locators --------------------

    // Locates the A/B Testing page header
    private By headerLocator = By.xpath(
            "//*[@id='content']/div/h3"
    );


    // -------------------- Constructor --------------------

    public P1ABPage(WebDriver driver) {
        super(driver);
    }


    // -------------------- Elements --------------------

    // Waits until the A/B Testing page header is visible
    private WebElement getHeaderElement() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerLocator)
        );
    }


    // -------------------- Validation --------------------

    // Retrieves the text displayed in the A/B Testing page header
    @Step("Verify A/B Testing page header")
    public String getHeaderText() {
        String headerText = getHeaderElement().getText();

        attachScreenshot("Verify A/B Testing page header");

        return headerText;
    }
}


