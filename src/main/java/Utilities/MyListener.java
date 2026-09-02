package Utilities;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;

import org.openqa.selenium.support.events.WebDriverListener;

import io.qameta.allure.AllureLifecycle;

import java.time.Duration;

import java.util.List;


public class MyListener implements WebDriverListener {

    private final AllureLifecycle lifecycle = Allure.getLifecycle();
    private final ThreadLocal<String> clickStep = new ThreadLocal<>();
    private final ThreadLocal<String> sendKeysStep = new ThreadLocal<>();
    private final ThreadLocal<String> clearStep = new ThreadLocal<>();
    private final ThreadLocal<String> submitStep = new ThreadLocal<>();

    @Override
    public void beforeGetCurrentUrl(WebDriver driver) {
        System.out.println("before GetCurrentUrl");
    }

    @Override
    public void afterGetCurrentUrl(WebDriver driver, String result) {
        System.out.println("after GetCurrentUrl");
    }


    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        System.out.println("Before FindElement");
    }

    @Override
    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        System.out.println("After FindElement");
    }

    @Override
    public void beforeFindElements(WebDriver driver, By locator) {
        System.out.println("Before FindElements");
    }

    @Override
    public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
        System.out.println("After FindElements");
    }

    @Override
    public void beforeClick(WebElement element) {

        System.out.println("Before Click");
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("After Click");
    }

    @Override
    public void beforeSubmit(WebElement element) {
        System.out.println("Before Submit");
    }

    @Override
    public void afterSubmit(WebElement element) {
        System.out.println("After Submit");
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {

        System.out.println("Before SendKeys");

    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {

        System.out.println("After SendKeys");
    }

    @Override
    public void beforeClear(WebElement element) {

        System.out.println("Before Clear");
    }

    @Override
    public void afterClear(WebElement element) {

        System.out.println("After Clear");
    }





    @Override
    public void beforeGetText(WebElement element) {

        System.out.println("Before Get Text");

    }

    @Override
    public void afterGetText(WebElement element, String result) {

        System.out.println("After Get Text");
    }

    @Override
    public void beforeFindElement(WebElement element, By locator) {

        System.out.println("Before Find Element");
    }

    @Override
    public void afterFindElement(WebElement element, By locator, WebElement result) {

        System.out.println("After Find Element");

    }

    @Override
    public void beforeFindElements(WebElement element, By locator) {

        System.out.println("Before Find Elements");

    }

    @Override
    public void afterFindElements(WebElement element, By locator, List<WebElement> result) {

        System.out.println("After Find Elements");

    }


    @Override
    public void beforeGetSize(WebElement element) {

        System.out.println("Before Get Size");

    }

    @Override
    public void afterGetSize(WebElement element, Dimension result) {

        System.out.println("After Get Size");

    }

    @Override
    public void beforeImplicitlyWait(WebDriver.Timeouts timeouts, Duration duration) {

        System.out.println("before implicit wait");

    }

    @Override
    public void afterImplicitlyWait(WebDriver.Timeouts timeouts, Duration duration) {

        System.out.println("after implicit wait");
    }

    public MyListener() {
        super();
    }
}