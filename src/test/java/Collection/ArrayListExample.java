package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {


    public static String fruitShot(List fruit)
    {
        for (int i=0; i<fruit.size(); i++)
        {
          if (fruit.get(i).equals("banana"))
          {
              return "it contains banana discard it";

          }
        }

        return "it doesn't contain banana";
    }

    public static void main(String[] args)
    {
      //  System.out.println(fruitShot(Arrays.asList("banana", "apple", "mango", "strawberry")));
       System.out.println(fruitShot(Arrays.asList("apple", "mango", "strawberry")));


     /*   int [] a = new int[5];

        a = new int[]{1, 2, 3, 4, 5};

        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i+1]);
        }



        int a = 5;
        ArrayList<Integer> aList = new ArrayList<>(a);

        for (int i=1; i<=a; i++)
        {
            aList.add(i);
        }
        System.out.println(aList);

     /*   for (int j=0; j<aList.size(); j++)
        {

            if (aList.get(j)==3)//if (aList.get(j).equals(3))
            {
                System.out.print(aList.get(j) + " ");
                break;
            }
        }



        for (int j=0; j<aList.size(); j++)
        {

            if (aList.get(j)==4 )//if (aList.get(j).equals(3))
            {
                aList.remove(j);
            }
                if (aList.get(j)==5)
                {
                    aList.remove(j);
                }

            System.out.println(aList);
        }
*/
/*
Task = You 've arraylist which contains 5 fruitnames mango, apple, banana, dragonfruit, strawberry
Condition is that if banana is in list, don't print anything
so if banana is there then discard that list
create a method which will take fruit if there is no banana then it will return individual list of all the fruits name
 */
/*
        ArrayList<String> fruitBucket = new ArrayList<>();

        fruitBucket.add("apple");
        fruitBucket.add("mango");
        fruitBucket.add("dragonfruit");
        fruitBucket.add("banana");
        fruitBucket.add("strawberry");

        for (int i=0; i<fruitBucket.size(); i++)
        {
            if (fruitBucket.get(i).equalsIgnoreCase("banana"))
            {
                System.out.println("discard list as it contains banana");
            }

        }



 */





    }
}
