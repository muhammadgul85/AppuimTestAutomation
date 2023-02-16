package String;

public class checkingEqualsMethod {

    /*
    checking == and equals
    when we perform == operation, that means we are comparing the address
    In below case "Baurav" is having different address with S1 in heap area
    and again Baurav has different address with S2 in heap area

    == Compare the Addresses
    .equal() Compares the content/value

     */

    public static void main(String[] args) {
        String s1 = new String("Baurav");
        String s2 = new String("Baurav");

        String s3 = "Baurav";
        String s4 = "Baurav";

        String s5 = "Gul";

        System.out.println(s1==s2); //false = address in heap area is different

        System.out.println(s1==s3);//false = address in heap area is different

        System.out.println(s3==s4);//true = address in SCP area is same

        System.out.println(s1.equals(s2));//true

        System.out.println(s1.equals(s3)); //true

        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//false
    }



}
