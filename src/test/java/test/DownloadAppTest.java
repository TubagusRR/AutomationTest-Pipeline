package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.DownloadAppPage;
import test.ExtentReportDemo;

public class DownloadAppTest extends BaseClass {
    ExtentTest test;
    @Test
    public void UpdateAppPositive(){
        try{

            test = extentReport.createTest("test","test");
            test.log(Status.INFO, "Test Started");
            System.out.println("Test");
            test.log(Status.PASS, "Test");

    }catch(Exception e){
        e.printStackTrace();
        }
    }

}
