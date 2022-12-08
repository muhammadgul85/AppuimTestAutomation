package practiceAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class APIDemoAppTesting {


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
        System.out.println("Is App Installed: " +driver.isAppInstalled("io.appium.android.apis")); //Check if an app is already installed or not
        Thread.sleep(3000);
        driver.runAppInBackground(Duration.ofMillis(2000)); // Send App to background for specified time and bring it to foreground after the specified time

        System.out.println("Query App State: " + driver.queryAppState("io.appium.android.apis"));// Check if App is running in foreground or background
     //   Thread.sleep(3000);
     //   driver.activateApp("com.android.settings");//Activate the app and move it to foreground
      //  Thread.sleep(3000);
    //    driver.activateApp("io.appium.android.apis");

    }
    @Test(dependsOnMethods = {"verifyPageHeader"})
    public void clickOnMediaAndPrintList()
    {

        By media = MobileBy.accessibilityId("Media");
        System.out.println("class of media: "+media.getClass());
        driver.findElement(media).click();
        System.out.println("clicked on Media");
        List <WebElement> mediaList = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
        // System.out.println("print media list: " +mediaList);

        System.out.println("print the list of items in Media");
        for (int i=0; i<mediaList.size(); i++)
        {

            System.out.println(mediaList.get(i).getText());
        }
        driver.navigate().back();
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

    @Test(dependsOnMethods = {"clickOnMediaAndPrintList"})
    public void loopThroughAllElement()
    {
        List<WebElement> allListedItems = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
        System.out.println("printing the list of items");
        for (int i=0; i<allListedItems.size(); i++)
        {
            System.out.println(allListedItems.get(i).getText());
        }

    }

    @Test(dependsOnMethods={"loopThroughAllElement"})
    public void clickOnAnimationAndNavigate()

    {

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']")).click();
        System.out.println("clicked on Animation");
        List<WebElement> elemtnsInAnimation = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
        System.out.println("size of list in Animation: "+elemtnsInAnimation.size());
        System.out.println("printing all elements in the list");
        for (int i=0; i<elemtnsInAnimation.size(); i++)
        {
            System.out.println(elemtnsInAnimation.get(i).getText());
        }
        System.out.println("Navigating back to Home Page");
        driver.navigate().back();

    }
    @Test(dependsOnMethods={"clickOnAnimationAndNavigate"})
    public void clickOnAppAndScrollDown() //click on App, scroll down and scroll up, click on App/Alert Dialogues and click on Cancel Dialogue with extra long message
    {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click(); // why there are two back slashes ???? It is because of double quote
        System.out.println("clicked on App");
       /*
       TouchActions action = new TouchActions(driver);
        action.scroll(element, 10, 100);
        action.perform();
      */
        WebElement alertDialouge =  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]"));
        System.out.println("attribute of alert dialogue: " + alertDialouge.getAttribute("enabled"));
        System.out.println("click on alert dialogue");
        alertDialouge.click();
        System.out.println("alert diaglogue clicked");
        WebElement titletext = driver.findElement(By.xpath("//android.widget.TextView"));
        System.out.println("title text is: "+titletext.getText());
        List<WebElement> allElementsInAlertDialogue = driver.findElements(By.xpath("//android.widget.LinearLayout/android.widget.Button"));
        for (int i=0; i<allElementsInAlertDialogue.size(); i++)
        {
            System.out.println(allElementsInAlertDialogue.get(i).getText());
        }

        System.out.println("click on text entry dialogue");
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Text Entry dialog\"]")).click();

    }



    @AfterClass
    public void tearDown()
    {
        System.out.println("closing down the driver");
        driver.terminateApp("io.appium.android.apis");
    }
}
