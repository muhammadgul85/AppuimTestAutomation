package JavaSolutions;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scanner.nextInt();
       if(num==1)
       {
           System.out.println("false");
           return;
       }
       for (int i=2; i<num; i++) //i=2 and if you enter 5 then 2<5 so it will go to below loop
       {
           if (num%i==0) // any time this condition is true it will not increase the counter and check next condition
           {
               System.out.println("false");
               return;
           }

       }
        System.out.println("true");

    }
}
