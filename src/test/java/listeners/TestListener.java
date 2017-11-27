package listeners;

import common.BasicTestCase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        File srcFile = BasicTestCase.getDriver().getScreenshotAs(OutputType.FILE);
        String scriptName = iTestResult.getMethod().getRealClass().getSimpleName() + "." + iTestResult.getMethod().getMethodName();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String destDir = "screenshots";
        String fileName =  scriptName + dateFormat.format(new Date()) + ".png";
        try {
            FileUtils.copyFile(srcFile,new File(destDir + "/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
