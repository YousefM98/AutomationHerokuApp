package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P10DragAndDropPage;


public class P10DragAndDropTest extends BaseTest {


    @Epic("Page Ten Epic")
    @Feature("Covering Drag and Drop Feature")
    @Description("validate Drag and Drop Page Header text is Drag and Drop")
    @Severity(SeverityLevel.MINOR)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 11, description = "validate Drag and Drop Page Header text is Drag and Drop")
    public void validateDragAndDropHeaderText() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDragAndDrop();
        P10DragAndDropPage p10DragAndDropPage = new P10DragAndDropPage(driver);
        Assert.assertEquals(p10DragAndDropPage.getHeaderText(),"Drag and Drop");
    }

    @Epic("Page Ten Epic")
    @Feature("Covering Drag and Drop Feature")
    @Description("validate Drag and Drop Page containes two boxes, first is named 'A' ,Second is named 'B' ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 11, description = "validate Drag and Drop Page containes two boxes, first is named 'A' ,Second is named 'B' ")
    public void validateDragAndDropBoxesCountAndTheirNames() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDragAndDrop();
        P10DragAndDropPage p10DragAndDropPage = new P10DragAndDropPage(driver);
        Assert.assertEquals(p10DragAndDropPage.getBoxesCount(),2,"Page should have two boxes");
        Assert.assertEquals(p10DragAndDropPage.getFirstBoxText(),"A","First box should be named A");
        Assert.assertEquals(p10DragAndDropPage.getSecondBoxText(),"B","Second box should be named B");
    }

    @Epic("Page Ten Epic")
    @Feature("Covering Drag and Drop Feature")
    @Description("validate That after dragging first box and dropping it on second box , boxes names should be switched ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 11, description = "validate That after dragging first box and dropping it on second box , boxes names should be switched  ")
    public void validateDragAndDropFirstBoxToSecondBox() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDragAndDrop();
        P10DragAndDropPage p10DragAndDropPage = new P10DragAndDropPage(driver);
        p10DragAndDropPage.dragFirstBoxToSecondBox();
        Assert.assertEquals(p10DragAndDropPage.getFirstBoxText(),"B","First box should be named B");
        Assert.assertEquals(p10DragAndDropPage.getSecondBoxText(),"A","Second box should be named A");
        p10DragAndDropPage.dragFirstBoxToSecondBox();
        Assert.assertEquals(p10DragAndDropPage.getFirstBoxText(),"A","First box should be named A");
        Assert.assertEquals(p10DragAndDropPage.getSecondBoxText(),"B","Second box should be named B");
    }

    @Epic("Page Ten Epic")
    @Feature("Covering Drag and Drop Feature")
    @Description("validate That after dragging second box and dropping it on first box , boxes names should be switched ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 11, description = "validate That after dragging second box and dropping it on first box , boxes names should be switched  ")
    public void validateDragAndDropSecondBoxToFirstBox() {
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDragAndDrop();
        P10DragAndDropPage p10DragAndDropPage = new P10DragAndDropPage(driver);
        p10DragAndDropPage.dragSecondBoxToFirstBox();
        Assert.assertEquals(p10DragAndDropPage.getFirstBoxText(),"B","First box should be named B");
        Assert.assertEquals(p10DragAndDropPage.getSecondBoxText(),"A","Second box should be named A");
        p10DragAndDropPage.dragSecondBoxToFirstBox();
        Assert.assertEquals(p10DragAndDropPage.getFirstBoxText(),"A","First box should be named A");
        Assert.assertEquals(p10DragAndDropPage.getSecondBoxText(),"B","Second box should be named B");
    }
}

