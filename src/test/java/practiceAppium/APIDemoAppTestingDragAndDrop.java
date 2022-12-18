package practiceAppium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class APIDemoAppTestingDragAndDrop {


    AndroidDriver driver;


    @BeforeClass
    public void androidSetUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("deviceName","0061A08V241006F0");
        desCap.setCapability("platformName", "android");
        desCap.setCapability("platformVersion", "11");
        //Your current directory, File Separator : The purpose is to redirect from one directory to another directory
        // double backslash for windows or single slash for iOS will be replaced by File Separator
        String appURL = System.getProperty("user.dir")+ File.separator+"app"+File.separator+"ApiDemos-debug.apk";

        desCap.setCapability("app", appURL);

        desCap.setCapability("noReset", "true");
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver(serverURL, desCap);
       // System.out.println("Is App Installed: " +driver.isAppInstalled("io.appium.android.apis")); //Check if an app is already installed or not
      //  Thread.sleep(3000);
       // driver.runAppInBackground(Duration.ofMillis(2000)); // Send App to background for specified time and bring it to foreground after the specified time

      //  System.out.println("Query App State: " + driver.queryAppState("io.appium.android.apis"));// Check if App is running in foreground or background
     //   Thread.sleep(3000);
     //   driver.activateApp("com.android.settings");//Activate the app and move it to foreground
      //  Thread.sleep(3000);
    //    driver.activateApp("io.appium.android.apis");

    }

    @Test
    public void verifyPageHeader ()
    {
        String expTitle = "API Demos";
        WebElement apidemo =driver.findElement(By.xpath("//android.view.ViewGroup/android.widget.TextView"));
        String titleOfPage = apidemo.getText();
        Assert.assertEquals(expTitle, titleOfPage); //No true/false given for this assertion
        System.out.println("Page Header is: "+ titleOfPage);

    }
    /*
    @Test(dependsOnMethods = {"verifyPageHeader"})
    public void longClick()
    {
        System.out.println("click on Views");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        System.out.println("Click on Drag and Drop");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
        System.out.println("Click on First Red Dot");
        WebElement firstRedDot = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)firstRedDot).getId(),"duration", 1000));//click and hold for 1 sec
        //Coming from JavaScriptExecutor but appium driver already running on javascript executor so we don't need to typecast our driver with javascript
        //mobile is mobile and longClickGesture is method, ImmutableMap.of (Collection) storing first element ID
    }

    public void clickWithJS()//if normal .click() is not working
    {
        System.out.println("click on Views");
        WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
          //driver.executeScript("mobile: clickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)views).getId()));
    }
    public void drageAndDrop ()
    {
        System.out.println("click on Views");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        System.out.println("Click on Drag and Drop");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
        WebElement firstRedDot = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        System.out.println("dragging from point A to D");
        driver.executeScript("mobile: dragGesture", ImmutableMap.of("elementId",((RemoteWebElement)firstRedDot).getId(),"endX",486, "endY", 733));
    }

     */
    @Test(dependsOnMethods = {"verifyPageHeader"})

    public void scrollDown() {
        boolean canScrollMore=true;

        System.out.println("click on Views");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        System.out.println("scrolling list");
        //WebElement viewList = driver.findElement(AppiumBy.id("android:id/list"));
        WebElement animation = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
        if (animation.isDisplayed()) { //find the animation = this will be true
            System.out.println("animation is displayed so we don't want to scroll more");
            canScrollMore = false; // we are re-assigning value to canScrollMore as false as it was true in line 101,
            //now the while loop will not be executed as that would have been executed if condition was true
        }
        while (canScrollMore) {
            System.out.println("scolling down");
            canScrollMore = (Boolean) (driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 700, "height", 700,
                    "elementId", ((RemoteWebElement) animation).getId(), //Scroll till this element
                    "direction", "down",
                    "percent", 1.0
            )));
            //return canScrollMore;
            System.out.println("can we scroll more: ?" + canScrollMore); //  with this use     public void swipeDown() method

        }
    }

// This is sample only
    //2nd sample

    @AfterClass
    public void tearDown()
    {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
