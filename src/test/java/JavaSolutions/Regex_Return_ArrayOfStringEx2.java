package JavaSolutions;

import java.util.Arrays;

public class Regex_Return_ArrayOfStringEx2 {

    public static void main(String[] args) {

        String  DndBusFee = schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge");
        String[] distanceAndBusFee = DndBusFee.split(" ");
        //System.out.println(monthlyExp(distanceAndBusFee[0], distanceAndBusFee[1]));
        //Alternative is below way
        String monthEF = monthlyExp(distanceAndBusFee[0], distanceAndBusFee[1]);
        System.out.println(monthEF);

    }
    public static String monthlyExp (String  km1, String Fee)
    {
        return "My schoold exp on travel for " + km1 + " is: "+ Fee;

    }
    public static String  schoolExp(String s)
    {
        String [] temp = s.split(" ");
        String distance = temp[6];
        String busFee = temp[11];

        return distance + " " + busFee;
    }
}
