package Base;

import Utilities.MyListener;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class BaseTest {
    public WebDriver driver;
    public String URL;
    public WebDriverWait wait;
    public SoftAssert SoftAssert;

    @BeforeMethod(groups = {"regression", "smoke"})
    public void beforeTC() {

        System.out.println("Before Validation");

        ChromeOptions options = new ChromeOptions();

        String downloadPath = new File(
                System.getProperty("user.dir"),
                "downloads"
        ).getAbsolutePath();

        File downloadDirectory = new File(downloadPath);

        if (!downloadDirectory.exists()) {
            downloadDirectory.mkdirs();
        }

        options.setExperimentalOption(
                "prefs",
                Map.of(
                        "credentials_enable_service", false,
                        "profile.password_manager_enabled", false,

                        // Download configuration
                        "download.default_directory", downloadPath,
                        "download.prompt_for_download", false,
                        "download.directory_upgrade", true,
                        "profile.default_content_setting_values.automatic_downloads", 1,
                        "safebrowsing.enabled", true,
                        // Allow geolocation automatically
                        "profile.default_content_setting_values.geolocation", 1
                )
        );

        options.addArguments("--disable-features=PasswordLeakDetection");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");


        driver = new ChromeDriver(options);

        ((ChromeDriver) driver).executeCdpCommand(
                "Browser.grantPermissions",
                Map.of(
                        "origin", "https://the-internet.herokuapp.com",
                        "permissions", List.of("geolocation")
                )
        );

        ((ChromeDriver) driver).executeCdpCommand(
                "Emulation.setGeolocationOverride",
                Map.of(
                        "latitude", 30.0444,
                        "longitude", 31.2357,
                        "accuracy", 100
                )
        );

        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        SoftAssert = new SoftAssert();

        this.URL = "https://the-internet.herokuapp.com/";

        driver.get(URL);
    }

    @BeforeClass(groups= {"regression", "smoke"})
    public void beforeClass(){
        System.out.println("==== starting selenium playground TestNG Suite =====");
    }

    @AfterMethod(groups= {"regression", "smoke"})
    public void afterTC(ITestResult result) throws IOException {

        System.out.println("After Validation");

        if (result.getStatus() == ITestResult.FAILURE) {

            var camera = (TakesScreenshot) driver;

            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            System.out.println("Screenshot: " + screenshot.getAbsolutePath());

            int generatedNumber = (int) (Math.random() * 1000);

            Files.move(
                    screenshot.toPath(),
                    new File(
                            "target/Screenshots/" +
                                    result.getName() +
                                    generatedNumber +
                                    ".png"
                    ).toPath()
            );
        }

        driver.quit();
    }


    @AfterClass(groups= {"regression", "smoke"})
    public void afterClass(){
        System.out.println("==== Finishing selenium playground TestNG Suite =====");
    }
}
