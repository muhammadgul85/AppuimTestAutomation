package JavaSolutions;

public class PalindromeNumber {
    public static void main(String[] args) {
        //  11/2

        int n = 151;// 151%10 =1 , 1 is remainder, Quotient is 15
        int sum =0; // this is like reverse empty string which we use in reverse string class
                    // (sum*10) + 1 (1 was remainder), as (15 * 10 ) +1 = 151
                    // (15%10) //remainder 5, quotient is 1
        int rem ;
        int temp =n;

        System.out.println("value of n: " + n); //Global value
        while (n>0)
        {
            rem = n%10;   //loop 1 = output will be 1 , in 2nd loop output will be 5, in 3rd loop output will be 1 as 1%10 = 1
            sum = (sum*10) + rem; //loop 1 = sum will be 1 as sum is 0, in 2nd loop output will be 15, in 3rd loop output will be 151 as 15*10=150+1
            n = n/10; // 151/10 //loop 1 = output is 15, in 2nd loop output will be 15/10 =1, in 3rd loop output will be 0 as 1/10 =0
        }

        System.out.println("value of n after loop : " + n);
        System.out.println("value of temp: " + temp);
        System.out.println("Value of Sum after loop: "+sum);
        if (temp==sum)
        {
            System.out.println("This is Palindrome Number");
        }
        else
        {
            System.out.println("This is not a palindrome number");
        }





    }
}
