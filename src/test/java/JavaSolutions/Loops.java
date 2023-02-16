package JavaSolutions;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Loops
{

    public void loopToCheckAvg()
    {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true)
        {
            System.out.println("Provide a value, Negative values end the program");
            int value = Integer.valueOf(scanner.nextLine());

            if (value<0)
            {
                break;
            }
            values = value +1;
            sum = sum + value;
        }

        if (sum == 0)
        {
            System.out.println("The average of the values could not be calculated.");
        }
        else
        {
            System.out.println("Average of values: " + (1.0 * sum/values));
        }

    }


    public void test2 ()
    {
        int value = 10;
        while (value > 0)
        {
            System.out.println(value);
            value = value -1;
        }
    }

    @Test
    public void test3 ()
    {
        String a = "abcdefgh";
        String revS = "";
        System.out.println("length of String: " +a.length());
        for (int i=a.length()-1; i>=0; i--)
        {
            char c = a.charAt(i);
            revS = revS + c;
        }

        System.out.println(revS);

    }

    @Test
    public  void reverseCharArray()
    {
        String g = "abcdefgh";
        String hh = "";
        char[] bp = g.toCharArray();

        for (int i=g.length()-1; i>=0; i--)
        {
            hh = hh + bp[i];
        }
        System.out.println("RevS: " + hh);
    }

}
