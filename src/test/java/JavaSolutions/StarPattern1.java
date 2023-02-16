package JavaSolutions;

import java.util.Scanner;

public class StarPattern1 {

    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");

        int userInput = scan.nextInt();

        for (int i=1; i<=userInput; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }


 */


        //*****
        //****
        //***
        //**
        //*

        /*
        for (int i=1; i<=userInput; i++)
        {
            for (int j=userInput; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }

         */
        //    *
        //   **
        //  ***
        // ****
        //*****
        /*
        for (int i=1; i<=userInput; i++)
        {
            for (int j=userInput; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }


         */
        //*****
        //****
        //***
        //**
        //*
/*
        for (int i=1; i<=userInput; i++)
        {
            for (int j=userInput; j>=i; j--)
            {
                System.out.print("*");
            }
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }

            System.out.println();

        } }
*/
        //*****
        // ****
        //  ***
        //   **
        //    *

/*
        for (int i=1; i <= userInput; i++)
        {

            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            for (int j=userInput; j>= i; j--)
            {
                System.out.print("*");
            }

            System.out.println();

        }
        /*
        Pyramid Structure
         *
        ***
       *****
      *******
     *********

        Scanner scan = new Scanner(System.in);
        System.out.println("enter Rows Numbers");

        int userInput = scan.nextInt();
        for (int i=1; i<=userInput; i++)
        {

            for (int k=userInput; k>i; k--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++) // For for loop we have to use condition i.e. <= ,  >=
            {
                System.out.print("*");
            }

            System.out.println();

        }
*/
     /*  reverse below Pyramid Structure

     *********
      *******
       *****
        ***
         *

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Rows Numbers");

        int userInput = scan.nextInt();
        for (int i=userInput; i>=1; i--)
        {

            for (int k=1; k<=(2*i)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int j=userInput; j>=i; j--) // For for loop we have to use condition i.e. <= ,  >=
            {
                System.out.print(" ");
            }

            /*
                *
                ***
                *****
               *******
              *********
              **********
               *******
                *****
                 ***
                  *
             */



        }
    }
}
