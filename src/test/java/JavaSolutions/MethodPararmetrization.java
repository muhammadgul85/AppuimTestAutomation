package JavaSolutions;

import org.testng.annotations.Test;

public class MethodPararmetrization {


    public int [] addSub( int x, int y)
    {
        int add = x+y;
        int sub = x-y;
        int a [] = {add, sub};

        return a;
    }
    @Test
    public void callingaddSub()
    {
       // System.out.println(addSub(5,4));
       int [] additionSubstration = addSub(5,4);
       int addition = additionSubstration[0];
       int substration = additionSubstration[1];
        System.out.println("addition of 2 numbers: " + addition);
        System.out.println("substration of 2 numbers: " + substration);
    }
    @Test
    public void callSubAdditionMethod()
    {
        System.out.println("addition of 2 numbers: " + addSub(6,5)[0]);
        System.out.println("substration of 2 numbers: " + addSub(6,5)[1]);

       // int x = 100 + addSub(6,5)[0];
        System.out.println(100 + addSub(6,5)[0] );
    }

    // return 3 Strings, 1 your name, son, daughter
    // methodname familymemberdetails that return all family members
    // my name is :, son,daughter
    //


    public  String myName(String name)
    {
        return "my name is " + name;
    }
    @Test
    public void returnMyName()
    {
        System.out.println(myName("Gul"));
    }
    @Test
    public void myNameAndBalanceInMyPocket()
    {
       String mN = myName("Gul");
       int multiply = multiplicationOf2Numbers(50, 2);
        System.out.println( mN + " and I have $"+multiply + " in my pocket");
    }

    public int additionOf3Numbers(int x, int y, int z)
    {
        return x+y+z;
    }

    public int multiplicationOf2Numbers(int j, int k)
    {
        return j*k;
    }

    @Test
    public void compareResult()
    {
        int mult = multiplicationOf2Numbers(4,5);
        int add = additionOf3Numbers(4, 5, 0);
        if (mult>add)
        {
            System.out.println("Brazil won match");
        }
        else
        {
            System.out.println("France won the match");
        }
    }
    @Test
    public void compareTestResult1()
    {
        if (multiplicationOf2Numbers(4,5) > additionOf3Numbers(4, 5, 0))
        {
            System.out.println("Brazil won match");
        }
        else
        {
            System.out.println("France won the match");
        }
    }



    @Test
    public void add ()
    {
        System.out.println(additionOf3Numbers(3,4,8));
    }

    @Test
    public void add1 ()
    {
        additionOf3Numbers(100, 200, 300);
    }
    @Test
    public void add2 ()
    {
       int sum = additionOf3Numbers(100, 200, 300);
        System.out.println(sum);
    }
    @Test
    public void divisibleBy3 ()
    {
        int sum = additionOf3Numbers(100, 200, 300);
        if (sum%3==0)
        {
            System.out.println("sum is divisible by 3");
        }
        else
        {
            System.out.println("Sum is not divisible by 3");
        }

    }


}
