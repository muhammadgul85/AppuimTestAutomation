package JavaSolutions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.StringTokenizer;

public class WordCount {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void awordVerificaiton()
    {
        //Assert.assertEquals(wordCount("Muhammad Gul Mahsood"), 8);

        softAssert.assertEquals(wordCount("Muhammad Ali"), 7);
        softAssert.assertEquals(wordCount("Ali Ali khan"), 7);
        softAssert.assertEquals(wordCount("khan Ali khan khan"), 7);
        softAssert.assertEquals(wordCount("asif "), 7);
        softAssert.assertEquals(wordCount("sal an khan Ali"), 7);
        softAssert.assertEquals(wordCount("Hadi khan khan Ali"), 7);
        softAssert.assertEquals(wordCount("Deebz khan khan Ali"), 7);
        softAssert.assertEquals(wordCount("Laddo khan khan khan khan khan Ali"), 7);


            }

    //how to count the words in a string

    public static int wordCount(String name)
    {


       String [] bb = name.split("\\s+");
       //String [] bb = name.split(" ");
        System.out.println("words count: " + bb.length);

        return bb.length;

    }
    //create a new class take a string as input and print the each word of the string as output, for example string name should be
    // String S = "My name is Muhammad Gul Mahsood Khan" and the output should be
    //My
    //name
    //is
    //Muhammad
    //Gul
    //Mahsood
    //khan
    @Test
    public void wordTest()
    {

        String name = "Muhammad Ali Khan Baig";
        String [] bb = name.split("\\s+");
        for (int i=0; i<=bb.length-1;i++)
        {

            System.out.println(bb[i]);
        }
    }



    @Test
    public void softAssertVerificaiton()
    {
        //Assert.assertEquals(wordCount("Muhammad Gul Mahsood"), 8);

        softAssert.assertEquals(wordCount1("Muhammad Ali"), 2);
        softAssert.assertAll();

    }

    public static int wordCount1(String name)
    {

        StringTokenizer tokenizer = new StringTokenizer(name);
        System.out.println("Tokenizer count: " + tokenizer.countTokens());
        return tokenizer.countTokens();

    }


    @Test
    public void schoolName ()
    {
        String name = "EastonPrimaryAcademyBristol";
        char [] c = name.toCharArray();
        String revSN = "";

        for (int i=name.length()-1; i>=0; i--)
        {
            revSN = revSN + c[i];
        }
        System.out.println("Rev School Name: " + revSN);
    }

    public String  schoolNamewithParam (String name) //do we have to remove void when passing String Value
    {

        char [] c = name.toCharArray();
        String revSN = "";
      // System.out.println(c.length);


        for (int i=name.length()-1; i>=0; i--) //length() method
        {
            revSN = revSN + c[i];
        }
        System.out.println("Rev School Name: " + revSN);
        return revSN;

    }
    @Test
    public void revSN ()
    {
        schoolNamewithParam("EastonPrimaryAcademy");


       Assert.assertEquals(schoolNamewithParam("EastonPrimaryAcademy"), "ymedacAyramirPnotsaE");

    }

    public static int wordCount3(String name)
    {


        String [] bb = name.split("\\s+");
        //String [] bb = name.split(" ");
        System.out.println("words count: " + bb.length);

        return bb.length;

    }







}
