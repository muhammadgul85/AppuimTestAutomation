package JavaSolutions;
import org.testng.annotations.Test;

//Regex Example
/*

public class StringSplitAndReturnParametrizeDirectCall {

    // String[] kmAndFee; //Is it mandatory to declare this as instance variable ???? Check this at the last

    @Test
    public void callingReturnPassString()
    {

        returnPString(kmAndFee[0], kmAndFee[1]); //I made returnPString method static now  and I am calling it inside test method, why can I not call it's var ???
                                                    // If I use main method this would allow me, why not with @Test method ??

        returnPString(kmAndFee[0], kmAndFee[1]); // I get error when I create object of class and call it's method ???
    }
    public  static void returnPString(String km, String Fee)
    {
        String distanceAndFeeResult = schoolExp("Begbrook primary school is less than 1km and parking fee £10 to park on site");
        String [] kmAndFee = distanceAndFeeResult.split(" ");



        System.out.println("My expenses on " +km + " are: " +Fee);

    }

    public static String  schoolExp(String j) {

        String[] temp = j.split(" "); //created Array
        String distance = temp[6]; //String taken from Array
        String cost = temp[10];//String taken from Array

       return distance + " " + cost;


    }
}



 */