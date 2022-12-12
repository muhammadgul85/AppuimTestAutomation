package Quiz;

public class DetermineOutput {
    int i=11;
    int j=10;
    public  void sub()                             //public static void sub() will throw compile time error as we are referencing non static var from static context


    {
        int k = i-j;
        System.out.println("value of k is: " + k);

    }

    public static void main(String[] args) {
       // sub(); compile time error as our method is not static so we have to create object of class
        new DetermineOutput().sub();

        DetermineOutput do1= new DetermineOutput();
        do1.sub();







    }
}
