package practiceAppium;
//new line of code here
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
import java.util.List;
import java.util.Set;

public class WebViewSwitchingViaAppium {


    AndroidDriver driver;


    @BeforeClass
    public void androidSetUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("deviceName", "0061A08V241006F0");
        desCap.setCapability("platformName", "android");
        desCap.setCapability("platformVersion", "11");
        //Your current directory, File Separator : The purpose is to redirect from one directory to another directory
        // double backslash for windows or single slash for iOS will be replaced by File Separator
        String appURL = System.getProperty("user.dir") + File.separator + "app" + File.separator + "ApiDemos-debug.apk";

        desCap.setCapability("app", appURL);

        desCap.setCapability("noReset", "true");
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, desCap);


    }

    @Test
    public void webViewSwitching()
    {

        System.out.println("Web View Switching in Progress");
        System.out.println("click on Views");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        System.out.println("Looking for WebView");
        WebElement viewList = driver.findElement(AppiumBy.id("android:id/list"));
        System.out.println("scolling down");
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 600,
                "elementId", ((RemoteWebElement) viewList).getId(),
                "direction", "up",
                "percent", 0.75
        ));

        WebElement webView = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"WebView\"]"));
        webView.click();

       Set<String> viewHandlers =  driver.getContextHandles(); //Every time value will be unique hence we are using Set
        for (String  viewHandler : viewHandlers)
        {
            System.out.println("Different Contexts: "+viewHandler);

        }
       // driver.context("WEBVIEW_io.appium.android.apis"); //driver switching , type casting driver to focus on context, i.e. webview
        driver.context(viewHandlers.toArray()[1].toString());
       String iAmLink =  driver.findElement(By.xpath("//*[@id=\"i am a link\"]")).getText();
        System.out.println("Attribute: " + iAmLink);
       driver.context("NATIVE_APP"); //Switch back to Native App
    }


    @AfterClass
    public void tearDown()
    {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
