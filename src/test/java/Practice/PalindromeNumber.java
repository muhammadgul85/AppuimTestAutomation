package Practice;

import org.testng.annotations.Test;

public class PalindromeNumber {

    @Test

    public void callReturnRange()
    {
        retunrRange(100, 200);
    }




    public void retunrRange(int r1, int r2)
    {
        int i;

        for (i=r1; i<=r2; i++)
        {
            int n =i;
            int sum =0;

            while (n!=0)
            {
                int rem = n%10;
                sum = (sum * 10) + rem;
                n = n/10;
            }
            if (i == sum)
            {
                System.out.println("Palindorme: "+i);
            }

           else {
            System.out.println("Not palindrome: "+i);
        }
        }


    }
}
