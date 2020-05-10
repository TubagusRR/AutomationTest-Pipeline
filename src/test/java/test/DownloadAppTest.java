package test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;
import pages.DownloadAppPage;
import test.ExtentReportDemo;

public class DownloadAppTest extends BaseClass {

    ExtentTest test;

    @Test
    public void UpdateAppPositive(){
        try{
        test = extentReport.createTest("MyFirstTest", "testing");
        test.log(Status.INFO, "Test One Started");
        DownloadAppPage downloadAppPage = new DownloadAppPage(driver);
        test.log(Status.PASS, "HomePage Appear");
        downloadAppPage.clickSearchBar(driver);
        test.log(Status.PASS, "Search Bar Clicked");
        downloadAppPage.enterKeyword("Ezeelink");
        test.log(Status.PASS, "Search Bar Filled");
        ((AndroidDriver) driver).longPressKey(new KeyEvent(AndroidKey.ENTER));
        test.log(Status.PASS, "Click Enter on Keyboard");
        downloadAppPage.clickApp(driver);
        test.log(Status.PASS, "Click APP");
        downloadAppPage.clickUpdateButton(driver);
        test.log(Status.PASS, "Click Open APP");
    }catch(Exception e){
        e.printStackTrace();
        }
    }
}
