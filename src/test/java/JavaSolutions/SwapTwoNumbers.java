package JavaSolutions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a =20;
        int b =10;
        System.out.println("Swap int");
    /*    int c ;
        c = a;
        a=b;
        b=c;


        b= b-a;// output -10
        a= b+a; //10
        b= a-b; //20 = (10-(-10)

     */
        a= a-b;
        b= a+b;
        a= b-a;

        System.out.println("a: "+a + " b: "+b);
    }
}
