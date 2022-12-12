package Quiz;

public class Quiz03 {
    public static void main(String[] args) {

        int a =20;
        int b =14;

        int x =5;
        System.out.println(x==5); //x==5 is operation which is relational type that will give us true or false



        if((b=0) ==a) // we are assigning 0 value to b here and b is not equal to a as a is 20
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(++b); // or print like below
            System.out.println("Value of b: "+ (++b)); //since b value is now 0 and we are appending value of b so answer will be 1
        }


    }
}
