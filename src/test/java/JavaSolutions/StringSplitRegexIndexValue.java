package JavaSolutions;

import org.testng.annotations.Test;

//Regex Example


public class StringSplitRegexIndexValue {

    @Test

    public void resultPassString()
    {
        System.out.println(passString("Begbrook primary school is less than 1km and parking fee £10 to park on site"));
    }

    public static String passString(String j) {
        String[] temp = j.split(" ");
        String distance = temp[6];
        String cost = temp[10];
        return "Total distance is: " + distance + " and cost is: "+ cost;



    }
}
