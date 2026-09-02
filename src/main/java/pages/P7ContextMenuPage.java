package pages;

import Base.BasePages;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class P7ContextMenuPage extends BasePages {
    // -------------------- Locators --------------------

    // Locates the Context Menu page header
    private By headerLocator = By.xpath("//*[@id='content']/div/h3");

    // Locates the context menu box
    private By contextMenuBoxLocator = By.id("hot-spot");

    // Locates the context menu item displayed after right-clicking
    private By contextMenuItemLocator = By.xpath("//*[text()='the-internet']");

    public P7ContextMenuPage(WebDriver driver) { super(driver);
    }

    // -------------------- Elements --------------------
    // Returns the Context Menu page header element
    private WebElement getHeaderElement() { return driver.findElement(headerLocator);
    }
    // Returns the context menu item element
    private WebElement getContextMenuItemElement() { return driver.findElement(contextMenuItemLocator);
    }
    // Returns the context menu box element
    private WebElement getContextMenuBoxElement() { return driver.findElement(contextMenuBoxLocator);
    }
    public String getHeaderText() { return getHeaderElement().getText();
    }


    public boolean isContextMenuBoxDisplayed() { return getContextMenuBoxElement().isDisplayed();
    }

    // Performs a right-click on the context menu box
    public void rightClickContextMenuBox() { Actions actions = new Actions(driver);
        actions.contextClick(getContextMenuBoxElement()).perform();
    }


    public boolean isContextMenuDisplayed() { return getContextMenuItemElement().isDisplayed();
    }

    // -------------------- Alert Handling --------------------

    // Returns the text displayed in the alert
    public String getAlertText() { Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Accepts the context menu alert
    public void acceptAlert() { Alert alert = driver.switchTo().alert(); alert.accept();
    }

    // -------------------- Context Menu Box Validation --------------------
    public String getContextMenuBoxBorderStyle() { return getContextMenuBoxElement().getCssValue("border-style"); }
    public String getContextMenuBoxBorderWidth() { return getContextMenuBoxElement().getCssValue("border-width"); }
    public String getContextMenuBoxWidth() { return getContextMenuBoxElement().getCssValue("width"); }
    public String getContextMenuBoxHeight() { return getContextMenuBoxElement().getCssValue("height"); } }
