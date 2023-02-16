package JavaSolutions;

import org.testng.annotations.Test;

//Regex Example


public class StringSplitAndReturnNoHardCoded {

    @Test
    public void returnPassString()
    {
        System.out.println(passString("Begbrook primary school is less than 1km and parking fee £10 to park on site"));

    }

    public static String  passString(String j) {

        String[] temp = j.split(" "); //created Array
        String distance = temp[6]; //String taken from Array
        String cost = temp[10];//String taken from Array

       return distance + " " + cost;


    }
}
