package Quiz;

public class forEachLoop {
    public static void main(String[] args) {

        int [] arr1 = new int[9];//size of array is 9 (0-8 counting) if you print 9 below it will be out of bound exeception
        System.out.println("arr1 value: " + arr1[0]);
        System.out.println("length of the arr1 is: " +arr1.length);
        int arr [] = {0,1,2,3,4,5,6,0};
        int x = arr[0];
        for (int i=0; i<=(arr.length-1); i++)
        {
            if (arr[i]<x)
                x=arr[i];
        }
        System.out.println("value of x: " + x);







        int a [] = {02, 070, 10, 11};//070 has prefex 0. octal 070 decimal value is 56
        for (int value : a)
        {
            System.out.println(value);
        }

        String str [] = {"x", "y", "z"};
        for (String val: str) // we are using temp value for this loop and given name val and this will not have any affect
            //unless we have assigned value to str
        {
            val ="k";
        }
        System.out.println(str[0] + str[1] + str[2]);

    }




}
