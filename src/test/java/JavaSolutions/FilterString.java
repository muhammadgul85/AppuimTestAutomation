package JavaSolutions;

import org.testng.annotations.Test;

public class FilterString {
  //  String ab = "my name is gul, I live in Bristol. I am 30 years young. I earn $3000 on weekly basis ";

    @Test

    public void callingFruitPrice()
    {
        System.out.println(fruitPrice("apple"));
    }


    public static String fruitPrice(String fruitName)
    {
        String b = null;
        String [] c = null;
        String aa = "on january 18 2023 apple price is $2 per kg";
        int price=0;
      //  if (fruitName.contains("apple"))

        if (fruitName=="apple")
        {
           // b=aa.replaceAll("[0-9]", "");
           // b=aa.replaceAll("[^a-zA-Z]", "");
          //  b=aa.replaceAll("[a-zA-Z]", "");
            b=aa.replaceAll("\\d", "");
         //   b=aa.replaceAll("\\D", "");
            System.out.println("b: " +b);
            c=b.split(" ");
           // System.out.println("C: " + c[7]);
            //my
            // name
            // is
            // Gul



        }


        return b;
    }
}
