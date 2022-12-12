package practiceAppium;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        System.out.println("enter 2nd number");
        int num2 = scan.nextInt();

        if (num1==num2)
        {
            System.out.printf("%d == %d\n", num1, num2);
        }
        if ( num1 != num2 )
            System.out.printf( "%d != %d\n", num1, num2 );
        if ( num1 < num2 )
            System.out.printf( "%d < %d\n", num1, num2 );
        if ( num1 > num2 )
            System.out.printf( "%d > %d\n", num1, num2 );
        if ( num1 <= num2 )
            System.out.printf( "%d <= %d\n", num1, num2 );
        if ( num1 >= num2 )
            System.out.printf( "%d >= %d\n", num1, num2 );

    }
}
