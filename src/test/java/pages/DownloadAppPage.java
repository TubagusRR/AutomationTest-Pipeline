package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;

public class DownloadAppPage {
    private AndroidDriver<MobileElement> driver;

    public DownloadAppPage(AndroidDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.vending:id/search_bar_hint")
    private MobileElement searchBar;

    @AndroidFindBy(id = "com.android.vending:id/search_bar_text_input")
    private MobileElement inputTittle;

    @AndroidFindBy(id = "com.android.vending:id/play_card")
    private MobileElement listViewApp;

    @AndroidFindBy(id = "com.android.vending:id/right_button")
    private MobileElement updateButton;


    public void clickSearchBar(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.vending:id/search_bar_hint")));
        searchBar.click();
    }

    public void enterKeyword(String tittle){
        inputTittle.sendKeys(tittle);
    }

    public void clickApp(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.vending:id/play_card")));
        listViewApp.click();
    }

    public void clickUpdateButton(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.vending:id/right_button")));
        updateButton.click();
    }


    public void updateAppPositive(String tittle){
        clickSearchBar(driver);
        enterKeyword(tittle);
        clickApp(driver);
        clickUpdateButton(driver);
    }
}
