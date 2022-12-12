package Quiz;

public class CheeckyLoop {
    public static void main(String[] args) {

        int i =0;
        for (;i<5;)
        {
            i++;
            System.out.println(i<1);
            //answer will be false 5 times
        }
        //usual way
        System.out.println("******************");
        for (int j=0; j<5; j++)
        {
            System.out.println(j<1);
        }

    }
}
