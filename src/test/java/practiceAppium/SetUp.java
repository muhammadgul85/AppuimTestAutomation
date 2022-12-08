package practiceAppium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUp {


    AndroidDriver driver;
    @BeforeClass
    public void androidSetUp() throws MalformedURLException {
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("deviceName","0061A08V241006F0");
        desCap.setCapability("platformName", "android");
        desCap.setCapability("platformVersion", "11");
       // desCap.setCapability("appPackage", "com.google.android.calculator");
       // desCap.setCapability("appActivity", "com.android.calculator2.Calculator");
       desCap.setCapability("appPackage", "uk.co.autotrader.androidconsumersearch");
       desCap.setCapability("appActivity", "uk.co.autotrader.androidconsumersearch.ui.activity.MainActivity");
        desCap.setCapability("noReset", "true");
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver(serverURL, desCap);

    }
    @Test
    public void myFirstAppiumTest()
    {

        driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
        System.out.println("clicked on 7 in Calculator");
        WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();
        System.out.println("clicked + in calculator ");

    }


    @AfterClass
    public void tearDown()
    {
        System.out.println("closing down the driver");
        //driver.terminateApp();

    }
}
