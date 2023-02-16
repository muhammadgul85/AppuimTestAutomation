package JavaSolutions;

import java.util.Arrays;

public class Regex_Return_ArrayOfString {

    public static void main(String[] args) {


       // monthlyExp(schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge")[0], schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge")[1]);
        //Above we called method inside method, below is alternative as we stored this into array of string
        String [] distanceAndBusFee = schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge");
        monthlyExp(distanceAndBusFee[0], distanceAndBusFee[1]);


        String dbd = "welcome to la Music land of Ibiza";
        System.out.println("String length: " +dbd.length()); // total characters printed = 30
        String [] ReturnsArray = dbd.split(" ");
        System.out.println("String of Array length: "+ReturnsArray.length); // each word is counted = 7 words
        String greet = ReturnsArray[0];
        String place= ReturnsArray[6];
        System.out.println( greet+" to: "+ place);

        String [] fly = {greet, place};
        System.out.println(Arrays.toString(fly)); // Arrays cannot be printed hence we use this method or Arrays.deepToString()

    }
    public static void monthlyExp (String  km1, String Fee)
    {
        System.out.println("My schoold exp on travel for " + km1 + " is: "+ Fee);

    }



    public static String [] schoolExp(String s)
    {

        String [] temp = s.split(" ");
        String distance = temp[6];
        String busFee = temp[11];
        String [] distanceBusFee = {distance, busFee};


        return distanceBusFee;
    }
}
