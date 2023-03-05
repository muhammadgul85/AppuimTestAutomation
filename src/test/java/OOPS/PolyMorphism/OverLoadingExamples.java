package OOPS.PolyMorphism;

/*
OverLoading is compile time polymorphism because at Compilation process only it decides which method to call, NOT AT RUNTIME
 */

public class OverLoadingExamples {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int  sum(int [] nums)
    {
        int total = 0;
        for (int n : nums)
        {
            total += n; // Total = total + n
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 9));
        // System.out.println(sum(new int[]{3,4,8,9}));

        int [] num = {3,4,8,9};
        System.out.println(sum(num));

      //  int [] numbers; //Without initialisation it will not take any value, This line equals to Line 10 parameter
      //  System.out.println(sum(new int []{}));





    }
}
