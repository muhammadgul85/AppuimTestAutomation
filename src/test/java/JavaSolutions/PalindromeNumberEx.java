package JavaSolutions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNumberEx {

        @Test
        public void callingIsPalindrome()
        {
           // isPalindrome(15);
            Assert.assertEquals(isPalindrome(131), true);
            Assert.assertEquals(isPalindrome(12), false);
            Assert.assertEquals(isPalindrome(15), false);
            Assert.assertEquals(isPalindrome(11), true);
            Assert.assertEquals(isPalindrome(33), true);
            Assert.assertEquals(isPalindrome(150), false);

        }
        public boolean isPalindrome(int n) {
            //  11/2

            // n = 151;// 151%10 =1 , 1 is remainder, Quotient is 15
            int sum = 0; // this is like reverse empty string which we use in reverse string class
            // (sum*10) + 1 (1 was remainder),
            // (15%10) //remainder 5, quotient is 1

            int rem;
            int temp = n;

            System.out.println("value of n: " + n); //Global value
            while (n > 0) {
                rem = n % 10;
                sum = (sum * 10) + rem;
                n = n / 10;
            }
            System.out.println("value of sum: " + sum);
            System.out.println("value of temp: " + temp);
            if (temp == sum) {
                System.out.println("This is Palindrome Number");
                return true;
            } else {
                System.out.println("This is not a palindrome number");
                return false;
            }

        }

        //Currently we are giving number n
        // give 1-1000 numbers and find out how many numbers are palindrome and print them out




}
