package testcases.chapter2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class SameIDTest {
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
        Thread.sleep(7000);
        WebElement title2 = (WebElement) driver.findElementsById("net.oschina.app:id/tv_title").get(2);
        System.out.println("========================"+ title2.getText());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
