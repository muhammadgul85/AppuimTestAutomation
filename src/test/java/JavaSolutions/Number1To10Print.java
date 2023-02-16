package JavaSolutions;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Number1To10Print {
/*
    @Test
    public void No1To10()
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println("1 to 10: " +i);
        }
    }
    //Question 2
    //
    //Write a program to calculate the sum of first 10 natural number.
    @Test
    public void sumOfNatural()
    {
        int sum=0;
        for (int i=1; i<=10; i++)
        {
            sum += i;// 1, 3,6,10, 15, 21, 28, 36, 45, 55
        }
        System.out.println("Sum: " +sum);

    }

    //Question 3
    //+
    //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


 */


    //Question 6
    //
    //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
    // For example, if the input is 12345, the output should be 54321.
  /*  @Test
    public static void reverseInt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num = scanner.nextInt();
        int revInt ;

        for (int i=num)

    }



   */


    public static void main(String[] args) {
        Number1To10Print cc = new Number1To10Print();
       // cc.tableOfNo();
        tableNos ();
       // reverseInt();

    }
    public void tableOfNo()
    {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.println("Enter a positive number");
        num = scanner.nextInt();
        System.out.println("Multiplication Table of: " + num );
        for (int i=1; i<=10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));

        }
    }

    public static void tableNos ()
    {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.println("Enter a positive number");
        num = scanner.nextInt();
        System.out.println("Multiplication Table of: " + num );
        int i=1;
        while (i<=10)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }






}
