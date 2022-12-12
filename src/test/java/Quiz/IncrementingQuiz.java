package Quiz;

public class IncrementingQuiz {
    int a =1; //There is nothing to do with global var a in this prog
    static int qq =99;

    public void method(int a)
    {
        a+=1; //increment a by 1 which means it will become 3 now as seen in main method we are passing initial value as 2
        System.out.println(++a); //before printing we are incrementing a again so value will be 4
    }

    static int twenty ()
    {
        return 20;
    }
    static void call (int qq)
    {
       // this.qq = qq;

    }

    static
    {
        int pj =5;
        System.out.println(pj);
    }
    public static void main(String[] args) {

      //  System.out.println(pj);

        new IncrementingQuiz().method(2);// we are assigning initial value as 2 (Starting point)


        float f = (4/8)*10; //4/8 = 0.5 which will be rounded up to 0 and multiplied by 10
        int i = (int) f;
        System.out.println(i);

        // in java int byte short are signed
        int x =5 ;  // it's same as int x = +5;
        int y = -9;
        int z = +2;

        final  int kk = 10;
      //  kk = twenty(); this will throw error as cannot assign value to final var
        System.out.println(x);

    }
}
