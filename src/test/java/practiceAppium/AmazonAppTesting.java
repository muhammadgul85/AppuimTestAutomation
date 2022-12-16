package practiceAppium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AmazonAppTesting {


    AndroidDriver driver;

    @BeforeClass
    public void androidSetUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "0061A08V241006F0");
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        cap.setCapability("appActivity", "com.amazon.windowshop.home.HomeLauncherActivity");
        cap.setCapability("noReset", "true");

        // String appURL = System.getProperty("user.dir")+ File.separator+"app"+File.separator+"ApiDemos-debug.apk";
        //driver.installApp(appURL, new AndroidInstallApplicationOptions().withReplaceDisabled());
        URL serURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serURL, cap);
        String currentActivity = driver.currentActivity();
        System.out.println("Current Activity of App: " + currentActivity);
        //Your current directory, File Separator : The purpose is to redirect from one directory to another directory
        // double backslash for windows or single slash for iOS will be replaced by File Separator
    }

    @BeforeMethod
    public void skipSignInToAccountAndCookieHandle() {
        try {
            WebElement skipSignIn = driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/skip_sign_in_button']"));
            if (skipSignIn.isDisplayed()) {
                skipSignIn.click();
                System.out.println("Skip Sign in was present and clicked");
            } else {
                System.out.println("Skip Sign in was not present and we are on home page");
            }
            WebElement acceptCookies = driver.findElement(By.xpath("//android.widget.Button[@text='Accept Cookies']"));
            if (acceptCookies.isDisplayed()) {
                acceptCookies.click();
                System.out.println("cookies accepted");
            } else {
                System.out.println("Accept cookies isn't present");
            }

        } catch (Exception e) {
            System.out.println("The signin or cookie didn't appear, hence carry on with test");

        }

    }


    @Test
    public void homePage() throws InterruptedException {
        System.out.println("Home Page Test");
        WebElement searchField = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Search Amazon')]"));
        System.out.println("Search for smart watches");
        searchField.click();
        System.out.println("clicked in the search field");
        Actions action = new Actions(driver);
        action.sendKeys("smart watch").perform();
        Thread.sleep(3000);

       // searchField.sendKeys("smart watch");

       List<WebElement> smartWatchesList =  driver.findElements(By.xpath("//*[@class='android.view.View']/android.widget.Button[2]"));
      for (WebElement listwatches : smartWatchesList)
       {
           System.out.println(listwatches.getText());
       }

        System.out.println("**********");


       for (int i=0; i<smartWatchesList.size(); i++)
       {
           System.out.println(smartWatchesList.get(i).getText());
       }




    }


    @AfterClass
    public void tearDown() {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
