package utils.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
    @BeforeSuite
    public void setUp(){
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"MyOwnReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("OS","Windows");
        extent.setSystemInfo("Host Name", "Tubagus R");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Tubagus Radhiyya R");

        htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
        htmlReporter.config().setReportName("My Own Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }

//    @AfterMethod
//    public void getResult(ITestResult result)
//    {
//        if(result.getStatus() == ITestResult.FAILURE)
//        {
//            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
//            test.fail(result.getThrowable());
//        }
//    }

    @AfterSuite
    public void tearDown()
    {
        extent.flush();
    }
}
