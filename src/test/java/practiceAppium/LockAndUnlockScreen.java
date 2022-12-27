package practiceAppium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LockAndUnlockScreen {


    AndroidDriver driver;


    @BeforeClass
    public void androidSetUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "0061A08V241006F0");
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("noReset", "true");
        String appURL = System.getProperty("user.dir")+ File.separator+"app"+File.separator+"ApiDemos-debug.apk";

        cap.setCapability("app", appURL);
        cap.setCapability("unlockType", "pin"); // use pattern instead of pin if locktype is using pattern
        cap.setCapability("unlockKey", "1212");// use unlockKey 1235789 like a Z sign, the way the pattern you are using to unlock
        URL serURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serURL, cap);
        String currentActivity = driver.currentActivity();
        System.out.println("Current Activity of App: " + currentActivity);

    }
    @Test
    public void LockUnlockScreen () throws InterruptedException {
        System.out.println("Check if Device locked");
        boolean devicelocked = driver.isDeviceLocked();

            System.out.println("is device locked: " + devicelocked);
            driver.unlockDevice();
            System.out.println("Device Unlocked");
            driver.lockDevice(); //to lock the device

    }






    @AfterClass
    public void tearDown() {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
