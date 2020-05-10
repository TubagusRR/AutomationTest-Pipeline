package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass extends ExtentReportDemo{
    public static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException{
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability("noReset", "TRUE");
//          caps.setCapability("app", "URL");
            caps.setCapability("automationName", "uiautomator2");
            caps.setCapability("appPackage", "com.android.vending");
            caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");

            URL url = new URL("http://127.0.1.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url,caps);
        }catch(Exception e){
            System.out.println("Cause is :"+ e.getCause());
            System.out.println("Message is : "+ e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void firstTest(){
        System.out.println("I'm Inside The Test");
        driver.findElement(By.id("com.android.vending:id/search_bar_hint"));
    }

    @AfterTest
    public void tearDown(){

    }
}
