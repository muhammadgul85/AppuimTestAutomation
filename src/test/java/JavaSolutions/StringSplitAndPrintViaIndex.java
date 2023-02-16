package JavaSolutions;

import org.testng.annotations.Test;

//Regex Example


public class StringSplitAndPrintViaIndex {

    @Test

    public void resultPassString()
    {
         passString("Welcome to Bristol , this is beautiful city");
    }

    public static void  passString( String j)
    {
       String [] ss =  j.split(" ");

        System.out.println("Length of ss: "+ss.length);
        System.out.println(ss[0] + " "+ss[1] + " " + ss[2] +" " + ss[3] +" " + ss[4]);//To print the specific element, pass index number
    }
}
