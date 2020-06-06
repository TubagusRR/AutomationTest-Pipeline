package test;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.scrollPage;

public class scrollTest extends BaseClass {
    @Test
    public void scrollingDownTestUntilElementFound() throws Exception {
        try {
            scrollPage scrollpage = new scrollPage(driver);
            scrollpage.scrollDownUntilFound();
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
            driver.closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void scrollingHorizontalUntilElementFound() throws Exception{
        try{
            scrollPage scrollpage = new scrollPage(driver);
            scrollpage.scrollDownUntilFound();

        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
            driver.closeApp();
            driver.launchApp();
        }
    }
}
