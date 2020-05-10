package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportDemo {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extentReport;
    @BeforeSuite
    public void ExtentSetup(){
        htmlReporter = new ExtentHtmlReporter("extent.html");

        extentReport = new ExtentReports();
        extentReport.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void ExtentTearDown(){ extentReport.flush();}
}
