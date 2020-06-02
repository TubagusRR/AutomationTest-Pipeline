package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class chipViewPage {
    private AndroidDriver<MobileElement> driver;

    public chipViewPage(AndroidDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.vending:id/title")
    private MobileElement tittle;

    public void multipleClass(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.vending:id/title")));
        List<MobileElement> buttons = driver.findElements(By.id("com.android.vending:id/title"));
        buttons.get(1).click();
    }

    public void verifyActionBar(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.vending:id/play_card")));

        try{
            String cek = tittle.getText();
            System.out.println(cek);
//            List<MobileElement> tittle = driver.findElements(By.id("com.android.vending:id/title"));
            if(wait.until(ExpectedConditions.visibilityOf((MobileElement) tittle)) != null){
                Assert.assertTrue(tittle.getText().contains("For ypoiuou"));
                System.out.println("Element Correct");
                }else{
                System.out.println("Element Not Present");
            }
            }catch(Exception e){
            e.printStackTrace();
            }
        }
    }