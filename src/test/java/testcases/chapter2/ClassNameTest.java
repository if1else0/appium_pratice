package testcases.chapter2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class ClassNameTest {
    private AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"AUT/osc.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Android Device");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","net.oschina.app");
        capabilities.setCapability("appActivity","net.oschina.app.AppStart");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }


    @Test
    public void testName() throws Exception {
        Thread.sleep(5000);
//        driver.findElementById("net.oschina.app:id/fag_nav");
        WebElement bottomBar = driver.findElement(By.id("net.oschina.app:id/fag_nav"));
        WebElement mySettingsTab = bottomBar.findElements(By.className("android.widget.FrameLayout")).get(6);
        mySettingsTab.click();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
