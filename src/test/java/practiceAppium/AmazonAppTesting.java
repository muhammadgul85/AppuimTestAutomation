package practiceAppium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
      //  cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
     //   cap.setCapability("appActivity", "com.amazon.windowshop.home.HomeLauncherActivity");
       // cap.setCapability("noReset", "true");

        String appURL = System.getProperty("user.dir")+ File.separator+"app"+File.separator+"ApiDemos-debug.apk";
        driver.installApp(appURL, new AndroidInstallApplicationOptions().withReplaceDisabled());
      //  URL serURL = new URL("http://localhost:4723/wd/hub");
      //  driver = new AndroidDriver(serURL, cap);
        //Your current directory, File Separator : The purpose is to redirect from one directory to another directory
        // double backslash for windows or single slash for iOS will be replaced by File Separator
    }

    @Test
    public void homePage()
    {
        System.out.println("Home Page Test");

    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
