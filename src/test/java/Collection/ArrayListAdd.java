package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAdd {


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




        ArrayList<String> fruitBucket = new ArrayList<>();

        fruitBucket.add("apple");
        fruitBucket.add("mango");
        fruitBucket.add("dragonfruit");
        fruitBucket.add("banana");
        fruitBucket.add("strawberry");

        System.out.println(fruitBucket);

        fruitBucket.add(1,"kiwi");
        fruitBucket.add(4, "cheeko");
        fruitBucket.set(5, "pomegranade"); // it will insert
        System.out.println(fruitBucket);
        Collections.sort(fruitBucket);
        System.out.println(fruitBucket);
        Object []fruit  = fruitBucket.toArray();
        for (Object a : fruit) // with for each loop if there is no next statement then you can avoid curly brackets
            System.out.println(a);



        String [] stringArray = new String[fruitBucket.size()];
        for (int i=0; i<fruitBucket.size(); i++)
        {
            stringArray[i] = fruitBucket.get(i);
           // System.out.print(stringArray[i]);
        }
        for (String t:stringArray)
            System.out.println(t);
        System.out.println(stringArray[3]);



/*
Take an array and one arraylist and compare the values and see all value of array are present in arraylist
create one generic method
method should have return type of boolean and it should give you true or false
 */






    }
}
