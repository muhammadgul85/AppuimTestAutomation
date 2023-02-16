package JavaSolutions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckReverseString {


    @Test
    public void reverseStringTest1() {
        String a = "abcd";
        System.out.println("a length: " + a.length());//size of string is 4, but indexing starts with 0

        String reverseST = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);/// return char value at a specified index whereas toCharArray() convert String into new Char Array
            reverseST = reverseST + ch;
            //reverseST= d, first loop
            //reverseST=  d + c
            ///reverseST= dc +b
            //reverseST= dcb +a
        }
        System.out.println("reverseST: " + reverseST);

    }
    /*
        @Test
        public void reverseStringTest2() {

            String a = "abcd";

            String reverseST = "";

            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                reverseST = ch + reverseST;
            }
            System.out.println("reverseST: " + reverseST);

        }



        public String emptyStringTest(String d) {

            System.out.println("a length: " + d.length());//size of string is 4, but indexing starts with 0


            if (d.isEmpty())
            {
                System.out.println("String is empty");
                return d;
            }

            String reverseST = "";

            for (int i = d.length() - 1; i >= 0; i--) {
                char ch = d.charAt(i);
                reverseST = reverseST + ch;
            }
            System.out.println("emptyStringTest reverseST: " + reverseST);
            return reverseST;

        }


        public void checkingReverse()
        {
            Assert.assertEquals(emptyStringTest(""), "");
        }


        @Test
        public void revToCharArrayReverse()
        {
            String bc = "abckdhhd";

            String revS = "";
            char [] jj = bc.toCharArray();
            //[a,b,c,k,d,h,h,d]
            for (int i= bc.length()-1; i>=0; i--)
            {
             // char [] jj = bc.toCharArray(); //whole array will be stored like this [a,b,c,k,d,h,h,d]
                //whereas charAt() will give you value with index directly
              //  System.out.println(bc.toCharArray());

                revS = revS + jj[i] ;
            }
            System.out.println("RevString Char: " + revS);
        }


         */
    //string not null, if null it should not go into loop
    //in null value we have two conditions
    //While loop
    @Test
    public void revStTest() {
        System.out.println("Checking the reverse String");
        Assert.assertEquals(revSt("abcdef"), "fedcba");
        Assert.assertEquals(revSt(""), "");
        Assert.assertEquals(revSt("ddf"), "fdd");
        Assert.assertEquals(revSt("dddd"), "dddd");
    }

    public static String revSt(String st) {

        if (st == null || st.isEmpty()) {
            return st;
        }
        char[] ch = st.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];//ch[i] means ch of 0 which is a and we are assigning a to temp
            ch[i] = ch[j]; // ch of j is f as we are checking length -1, now ch of i becomes f
            ch[j] = temp; // temp is a and we are assigning value to ch of j
            i++; // increment and ch becomes b in line 119 in char temp = ch[i]
            j--; //decrmenting which is length - 2, and becomes e
        }

        System.out.println(ch);
        return new String(ch); // new string means creating a new String variable and assigning the value to it,
        // In line number 127 we are bundling the array character from line number 114 (char [] ch = st.toCharArray() )  into a new String Variable.

    }

    //print via loop an array


    @Test
    public static void lo() {
        int luku = 5;
        while (luku < 50) {
            System.out.println(luku);
            luku = luku + 5; // luku +=5; //luku ++;
        }
        System.out.println("luku: " + luku);
    }

    @Test
    public void reverseStringTest() {

        String a = "abcd";
        String revS = "";

        for (int i = a.length()-1; i >=0; i--)
        {
            char cd = a.charAt(i);
            revS = revS + cd;
            char hdh = a.charAt(i);

        }
        System.out.println(revS);


    }
}
/*

        String reverseST = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            reverseST = reverseST + ch;
            //reverseST= d, first loop
            //reverseST=  d + c
            ///reverseST= dc +b
            //reverseST= dcb +a
        }
        System.out.println("reverseST: " + reverseST);

 */