package ReturnStatement;

import org.testng.annotations.Test;

import java.util.Locale;

public class ReturnStatement {

//Task : Print full name and check how many vowels you 've in full name ?
// Print the count of each character
// area of circle and return area, add 5 elements into list and return all elements through return statement



    @Test
    public void testMethods()
    {
        int count =0;
       char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
        System.out.println(multiplyTwoNumbers(10, 15));
        System.out.println(concatenateString("Muhammad", "Gul"));
        String fullName = concatenateString("Muhammad", "Gul").concat("Masood").toLowerCase(); //Method Chaining
        System.out.println("Full Name is: " +fullName);

        char[] aa = fullName.toCharArray();

        for (char j=0; j<aa.length; j++)
        {
            if (aa[j]==a || aa[j]==e || aa[j]==i|| aa[j]==o || aa[j]==u)
            {
                System.out.println("vowel: "+aa[j]);
                count++;
            }
            else
            {
                System.out.println("Not vowel: "+aa[j]);
            }
        }
        System.out.println("Total Vowels: "+ count);


    }



    public int multiplyTwoNumbers(int y, int z)
    {
        return y*z;
    }

    public String concatenateString(String fname, String lname)
    {
        return fname.concat(lname);
    }
}
