package JavaSolutions;

import java.util.Scanner;

public class PrimeNumCheckSquareRootMethod {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scanner.nextInt();
        if(num==1)
        {
            System.out.println("false");
            return;
        }
        for (int i=2; i*i<num; i++) //
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
