package practiceAppium;

import java.util.Scanner;


public class CalculateAvgOf3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1= scan.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = scan.nextInt();
        System.out.println("Enter 3rd number");
        int n3 = scan.nextInt();
        System.out.println("Average of 3 Numbers is: " + (n1+n2+ n3)/3 );
    }


}
