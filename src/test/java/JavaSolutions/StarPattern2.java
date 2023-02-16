package JavaSolutions;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int enterNum = scanner.nextInt();
/*
        for (int i=1; i<=enterNum; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


 */


        for (int i=1 ; i <=enterNum; i++)
        {
            for (int k=1; k<i ; k++)
            {
                System.out.print(" ");
            }
            for (int j=enterNum; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
