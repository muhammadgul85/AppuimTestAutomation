package String;

import org.testng.Assert;

/*
String Immutable in Java: If we do changes in any existing String in java, it will always create a new object in heap area

 */
public class StringImmutable {
    public static void main(String[] args) {
        String s1 = new String("Baurav");
        String s2 = new String("Baurav");
        System.out.println("s1.equals method: " + s1.equals(s2));
        System.out.println("s1==s2 method: "+ (s1==s2));
        String s3 = "Baurav";
        String s4 = "Baurav";
        String s5 = "Gul";
        s1 = s1.concat(s2); //New address created inside Heap Area and new object created in Heap Area pointed with S1
        System.out.println(s1.concat(s2));
        System.out.println(s1);


    }
}
