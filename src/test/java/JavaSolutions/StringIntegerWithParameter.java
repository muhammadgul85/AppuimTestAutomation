package JavaSolutions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StringIntegerWithParameter {

    @Test
    public static  int qtyToSend(int qty) // Qty to send to a field
    {
        //String retV = "BankHSBC 12344 40085580";
        //qty = qty + 1; //1 - 1000
        System.out.println("Enterting Value:" +qty);


      return qty;
    }
 /*
    public static void logInMethod(String un, String pwd)
    {
        driver.findElement(By.xpath("usernamexpath")).sendKeys(un);
        driver.findElement(By.xpath("pwdxpath")).sendKeys(pwd);
        driver.findElement(By.xpath("xpathogin")).click();
    }
@Test
public void callingLogin()
{
    logInMethod("john", "abc233");
}
  */
}