package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.URL;


public class BasicTestCase {
    static AppiumDriver driver;
    private Helper helper;
    public PageHelper pageHelper;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"AUT/osc.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Android Device");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","net.oschina.app");
        capabilities.setCapability("appActivity","net.oschina.app.AppStart");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        helper = new Helper(driver);
        pageHelper = new PageHelper(helper);
        pageHelper.getPageCommon().goToMySettingsTab();
        if("aotu12345aotu".equals(pageHelper.getPageMySettings().getNickName())){
            pageHelper.getPageMySettings().clickSettingsBtn();
            pageHelper.getPageSettings().clickLogout();
        }
        pageHelper.getPageCommon().goToHomeTab();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    public static AppiumDriver getDriver(){
        return  driver;
    }

}
