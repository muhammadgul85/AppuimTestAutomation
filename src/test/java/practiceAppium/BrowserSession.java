package practiceAppium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserSession {
    AndroidDriver driver;


    @BeforeClass
    public void androidSetUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("deviceName", "0061A08V241006F0");
        desCap.setCapability("platformName", "android");
        desCap.setCapability("platformVersion", "11");
        desCap.setCapability("browserName", "Chrome");
      //  String driverPath = System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"chromedriver.exe";
     //   desCap.setCapability("chromedriverExecutable",driverPath);
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, desCap);
    }
    @Test
    public void testingAmazon()
    {
        driver.get("https://www.amazon.com/");
    }
    @AfterClass
    public void cleanUp()
    {
        System.out.println("cosing browser");
        driver.quit();
    }
}
