package practiceAppium;

import java.util.Scanner;

public class JavaPracticeExercises {
    public static void main(String[] args) {
        //https://www.w3resource.com/java-exercises/basic/index.php
/*
        int a = 50;
        int b =3;
        System.out.println("division: "+ (a/b));

        int c = -5;
        int d = 8;
        int e = 6;
        System.out.println("output: " + (-5 +8 *6));
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = scan.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + num1*num2);
        System.out.println("Addition of num1 and num2: "  + (num1+num2));
        System.out.println("Subtration of num1 and num2: "  + (num1-num2));
        System.out.println("Division of num1 and num2: "  + (num1/num2));
        System.out.println("Modulo of num1 and num2: "  + (num1%num2));
        */

        //create an 8 table multiply until 10
        System.out.println(" enter 8 for 8 Table");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        for (int i=0; i<=10; i++)
        {
           // System.out.println(n1*(i+1));
            System.out.println(n1 + " * "+ i + " = " +(n1*i));

          // System.out.println(n1 + " X " + (i+1) + " = " + (n1 * (i+1))); //Ellaborative way, we are adding 1 as we initiliase i=0
        }
        System.out.println("Enter 6 for 6 Table");
        int n = scan.nextInt();
        for (int i = 1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }



    }
}
