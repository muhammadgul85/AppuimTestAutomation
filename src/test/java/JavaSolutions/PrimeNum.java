package JavaSolutions;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scanner.nextInt();
        if (num==1)
        {
            System.out.println("Not Prime Number");
            return;
        }
        for (int i=2; i < num; i++)
        {
            if (num%i==0)
            {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");

        /*
        for (int i=2; i<=num/2; i++)
        {
            if (num%i==0)
            {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");




        /*
        for (int i=2; i < num; i++)
        {
            if (num%i==0)
            {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");

        /*
        for (int i=2; i * i< num; i++) //square root
        {
            if (num%i ==0)
            {
                System.out.println("Not Prime Number");
            }
        }
        System.out.println("Not Prime Number");
/*
        if (num==1)
        {
            System.out.println("Not Prime Number");
        }
        for (int i=2; i<=num/2; i++)
        {
            if (num%i==0)
            {
                System.out.println("Not Prime Number");
            }
        }
        System.out.println("Prime Number");

 */



    }
}
