package Tests;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_mainPage;
import pages.P14DynamicLoadingPage;

public class P14DynamicLoadingTest extends BaseTest {

    @Epic("Page Fourteen Epic")
    @Feature("Covering Dynamic Loading Feature")
    @Description("Verify that the hidden element becomes visible after clicking Start")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Yousef Mohsen")
    @Test(groups = "smoke", priority = 15, description = "Verify that the hidden element becomes visible after clicking Start")
    public void verifyElementAppearAfterLoading(){
        P0_mainPage p0_mainPage = new P0_mainPage(driver);
        p0_mainPage.clickDynamicLoading();
        P14DynamicLoadingPage  p14DynamicLoadingPage = new P14DynamicLoadingPage(driver);
        p14DynamicLoadingPage.openExample1();
        Assert.assertEquals( p14DynamicLoadingPage.getHeaderText(), "Dynamically Loaded Page Elements" );
        p14DynamicLoadingPage.clickStartButton();
        Assert.assertTrue( p14DynamicLoadingPage.isLoadingDisplayed() );
        Assert.assertEquals( p14DynamicLoadingPage.getLoadedText(), "Hello World!" ); }

@Epic("Page Fourteen Epic")
@Feature("Covering Dynamic Loading Feature")
@Description("Verify dynamically added element appears after loading")
@Severity(SeverityLevel.CRITICAL)
@Owner("Yousef Mohsen")
@Test(groups = "smoke", priority = 15, description = "Verify dynamically added element appears after loading")
public void verifyDynamicallyAddedElementAppears(){
    P0_mainPage p0_mainPage = new P0_mainPage(driver);
    p0_mainPage.clickDynamicLoading();
    P14DynamicLoadingPage  p14DynamicLoadingPage = new P14DynamicLoadingPage(driver);
    p14DynamicLoadingPage.openExample2();
    Assert.assertEquals( p14DynamicLoadingPage.getHeaderText(), "Dynamically Loaded Page Elements" );
    p14DynamicLoadingPage.clickStartButton();
    Assert.assertTrue( p14DynamicLoadingPage.isLoadedContentDisplayed() );
    Assert.assertEquals( p14DynamicLoadingPage.getLoadedText(), "Hello World!" ); } }