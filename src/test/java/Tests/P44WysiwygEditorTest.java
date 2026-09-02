package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P44WysiwygEditorPage;


public class P44WysiwygEditorTest extends BaseTest {


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify WYSIWYG Editor page header")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that the WYSIWYG Editor page displays the correct header")
    public void verifyWysiwygEditorPageHeader() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        Assert.assertEquals(
                p44WysiwygEditorPage.getHeaderText(),
                "An iFrame containing the TinyMCE WYSIWYG Editor"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify WYSIWYG Editor iframe")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that the WYSIWYG Editor iframe is displayed")
    public void verifyEditorFrameIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        Assert.assertTrue(
                p44WysiwygEditorPage.isEditorFrameDisplayed(),
                "WYSIWYG Editor iframe should be displayed"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify editor is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that the TinyMCE editor is displayed inside the iframe")
    public void verifyEditorIsDisplayed() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        Assert.assertTrue(
                p44WysiwygEditorPage.isEditorDisplayed(),
                "TinyMCE editor should be displayed"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify default editor text")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that the WYSIWYG Editor contains the expected default text")
    public void verifyDefaultEditorText() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        Assert.assertEquals(
                p44WysiwygEditorPage.getEditorText(),
                "Your content goes here."
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify text can be replaced in editor")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that existing WYSIWYG Editor text can be replaced")
    public void verifyEditorTextCanBeReplaced() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        p44WysiwygEditorPage.replaceEditorText(
                "Selenium Automation"
        );

        Assert.assertEquals(
                p44WysiwygEditorPage.getEditorText(),
                "Selenium Automation"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify text can be cleared")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that WYSIWYG Editor text can be cleared")
    public void verifyEditorTextCanBeCleared() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        p44WysiwygEditorPage.clearEditor();

        Assert.assertEquals(
                p44WysiwygEditorPage.getEditorText(),
                ""
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify text can be entered")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that text can be entered into the WYSIWYG Editor")
    public void verifyTextCanBeEntered() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        p44WysiwygEditorPage.clearEditor();

        p44WysiwygEditorPage.enterEditorText(
                "Selenium Test"
        );

        Assert.assertEquals(
                p44WysiwygEditorPage.getEditorText(),
                "Selenium Test"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify Bold formatting")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that Bold formatting can be applied to editor text")
    public void verifyBoldFormatting() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        p44WysiwygEditorPage.replaceEditorText(
                "Selenium Automation"
        );

        p44WysiwygEditorPage.selectAllEditorText();

        p44WysiwygEditorPage.clickBoldButton();

        Assert.assertTrue(
                p44WysiwygEditorPage.isEditorTextBold(),
                "Editor text should have Bold formatting"
        );
    }


    @Epic("Page Forty Four Epic")
    @Feature("Covering WYSIWYG Editor Feature")
    @Description("Verify Italic formatting")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 44,
            description = "Verify that Italic formatting can be applied to editor text")
    public void verifyItalicFormatting() {

        P0_mainPage p0_mainPage =
                new P0_mainPage(driver);

        p0_mainPage.clickWysiwygEditor();

        P44WysiwygEditorPage p44WysiwygEditorPage =
                new P44WysiwygEditorPage(driver);

        p44WysiwygEditorPage.replaceEditorText(
                "Selenium Automation"
        );

        p44WysiwygEditorPage.selectAllEditorText();

        p44WysiwygEditorPage.clickItalicButton();

        Assert.assertTrue(
                p44WysiwygEditorPage.isEditorTextItalic(),
                "Editor text should have Italic formatting"
        );
    }
}