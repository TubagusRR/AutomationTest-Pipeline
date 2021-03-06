package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ExtentReport.BaseTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass extends ExtentReportDemo {
    public static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException{
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(CapabilityType.PLATFORM_NAME, "android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability("noReset", "TRUE");

//          caps.setCapability("app", "URL");
            caps.setCapability("appPackage", "com.android.vending");
            caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, caps);
        }catch(Exception e){
            System.out.println("Cause is :"+ e.getCause());
            System.out.println("Message is : "+ e.getMessage());
            e.printStackTrace();
        }

    }


    @AfterTest
    public void tearDown() {
//    driver.quit();
    }
}
