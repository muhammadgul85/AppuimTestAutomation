package JavaSolutions;

import java.util.ArrayList;

public class WrapperClassExamples {

    /*
    byte > Byte > When first character of any primitive data type is in upper case we are reffering to
    corresponding primitive data type as object.
    int > Integer >
    char > Character
    double > Double
    float > Float
    long > Long
    short > Short
     */
    public static void main(String[] args) {

        int a = 5;
        float b = 44.4f;
        char c = 'c';
        double d = 333.3333;
        //convert into wrapper object

        Integer aObj = a;// This behaviour is called Auto-Boxing, This is happening automatically

     //   Integer aObj = Integer.valueOf(a);
        Float bObj = Float.valueOf(b);
        Character cObj = Character.valueOf(c);
        Double dObj = Double.valueOf(d);

        if (aObj instanceof Integer)
        {
            System.out.println("Object of Integer is created");
        }

        if (bObj instanceof Float)
        {
            System.out.println("Object of Float is created");
        }

        if (cObj instanceof Character)
        {
            System.out.println("Object of Character is created");
        }

        if (dObj instanceof Double)
        {
            System.out.println("Object of Double is created");
        }




/*
        Integer aObj = Integer.valueOf(5);
        Float bObj = Float.valueOf(44.3f);
        //convert into primitive data type
        int a = aObj.intValue();
        float b = bObj.floatValue();
        System.out.println("value of a: " +a);
        System.out.println("value of b: " + b);

        int c = aObj; //This is called unboxing, automatically values getting assigned
        System.out.println("value of c: " +c);



 */

        ArrayList<Integer> abc = new ArrayList<Integer>();
        abc.add(5);
       // int g = null;  //But with wrapper Object we can declare Integer as null
        Integer g = null;

        /*
        Note: Primitive Types are more efficient than corresponding objects, that means when we have a requirement of
        efficiency at that time we can recommend primitive type, if not concerned about efficient than we can use wrapper object

          / Wrapper Object benefits
        - We can use in Collection
        - We can assign null value

         */




    }


}
