package JavaSolutions;

public class RegexExample {

    public static void main(String[] args) {

        //schoolExpense("Begbrook primary school is less than 1km and i am paying £10 for bus charge");
        //System.out.println(schoolExpense("Begbrook primary school is less than 1km and i am paying £10 for bus charge"));
        String distanceAndFees = schoolExpense("Begbrook primary school is less than 1km and i am paying £10 for bus charge");
        String [] kmAndFee = distanceAndFees.split(" ");
      //  String kilometer = kmAndFee[0];
     //   String busFee = kmAndFee[1];
       // myMonthlyExpenseOnTravel(kilometer, busFee);
      //  myMonthlyExpenseOnTravel(kmAndFee[0], kmAndFee[1]);
        System.out.println(myMonthlyExpenseOnTravel(kmAndFee[0], kmAndFee[1]));

        //System.out.println(schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge"));
        String [] distanceAndBusFees = schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge");
       // myMonthlyExpenseOnTravel(schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge")[0],schoolExp("Begbrook primary school is less than 1km and i am paying £10 for bus charge")[1]);
  //      myMonthlyExpenseOnTravel(distanceAndBusFees[0],distanceAndBusFees[1]);
        System.out.println(myMonthlyExpenseOnTravel(distanceAndBusFees[0],distanceAndBusFees[1]));
        String monthlyExpenseReturn = myMonthlyExpenseOnTravel(distanceAndBusFees[0],distanceAndBusFees[1]);
        System.out.println(monthlyExpenseReturn);




    }
    public static String   myMonthlyExpenseOnTravel(String km, String Fee)
    {
       // System.out.println("my expenses on travel for " +km + " is "+Fee);
        return "my expenses on travel for " +km + " is "+Fee;

    }
    public static String schoolExpense(String s)
    {
       // String s = "Begbrook primary school is less than 1km and i am paying £10 for bus charge";
        //my expenses on travel for 1km is £10
        String [] temp = s.split(" ");
        String distance = temp[6];
        String busFee = temp[11];
      //  System.out.println("expense on travel for " + distance + " is: "+busFee);


      return distance + " " + busFee;
    }



    public static String [] schoolExp(String s)
    {
        // String s = "Begbrook primary school is less than 1km and i am paying £10 for bus charge";
        //my expenses on travel for 1km is £10
        String [] temp = s.split(" ");
        String distance = temp[6];
        String busFee = temp[11];
        //  System.out.println("expense on travel for " + distance + " is: "+busFee);
        String [] distanceBusFee = {distance,  busFee};


        return distanceBusFee;
    }
}
