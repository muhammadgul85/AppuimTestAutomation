package practiceAppium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

public class ZoomInZoomOutGoogleMap {


    AndroidDriver driver;


    @BeforeClass
    public void androidSetUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "0061A08V241006F0");
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage", "com.google.android.apps.maps");
        cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
        cap.setCapability("noReset", "true");
        URL serURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serURL, cap);
        String currentActivity = driver.currentActivity();
        System.out.println("Current Activity of App: " + currentActivity);

    }
    @Test
    public void ZoomInOut () throws InterruptedException {
        System.out.println("Google Map Launched");
        Thread.sleep(5000);
 /*         System.out.println("Navigate to search field ");
        Actions actions = new Actions(driver);
        WebElement SearchField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Search here\"]/android.widget.TextView"));
        Thread.sleep(2000);
        System.out.println("Enter postcode BS16 2NT");
        SearchField.click();
        actions.sendKeys("BS16 2NT").build().perform(); //we will need to use .build() if we have multiple methods
        System.out.println("Is keyboard showing: " + driver.isKeyboardShown());
        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
        driver.hideKeyboard();

      Thread.sleep(2000);


  */
        System.out.println("Zooming In");
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 200,
                "top", 500,
                "width", 650,
                "height", 650,
                "percent", 0.75
        ));
        Thread.sleep(5000);
        System.out.println("Zooming Out");
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 200,
                "top", 500,
                "width", 650,
                "height", 650,
                "percent", 0.75
        ));

    }






    @AfterClass
    public void tearDown() {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
