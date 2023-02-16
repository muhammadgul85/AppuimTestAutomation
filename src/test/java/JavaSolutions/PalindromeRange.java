package JavaSolutions;

import org.testng.annotations.Test;

public class PalindromeRange {


    @Test
    public void testAB()
    {
        System.out.println("testAB");
        rangeOfPalindrome(33, 99);
    }

  //  @Test
    public void returnPalindromeRange()
   {
       rangeOfPalindrome(100, 200);
   }




        public void rangeOfPalindrome(int r1, int r2)
        {
            int i;
            for ( i=r1; i<=r2; i++)
            {
                int n =i;
                int sum=0;

                while (n != 0)
                {
                    int rem = n %10; // 9%100
                    n = n/10;
                    sum = (sum * 10) + rem;
                }

                if (i == sum)
                {
                    System.out.println("Palindrome: " + i);
                }
                else
                {
                    System.out.println("not palindrome: "+i);
                }

            }

        }













}
