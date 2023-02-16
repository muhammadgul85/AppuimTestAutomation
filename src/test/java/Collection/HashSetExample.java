package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
In set we cannot store duplicate whereas in List we can
Set is an un-ordered collection of objects in which duplicate values cannot be stored
Set > Interface > Java.util package
when we deal with getwindowhandles > each tab has unique
 */
public class HashSetExample {

    public static void main(String[] args) {


        Set<String> bucket = new HashSet<String>();
        Set<String> fruits = new HashSet<String>();
  /*      fruits.add("apple");
        fruits.add("mango");
        fruits.add("dragonfruit");
        fruits.add("banana");
        fruits.add("strawberry");
        System.out.println(fruits);
   */
        //3 way of Initialising of Arrays
        String [] beetles = new String[]{"apple","banana","dragonfruit","mango", "strawberry","mango"};
        String [] googles = {"apple","banana","dragonfruit","mango", "strawberry", "kiwi", "cherry", "cheeko"};
        String [] giggles = new String[5];
        giggles[0] = "apple";
        giggles[1] = "banana";
        giggles[2] = "dragonfruit";
        giggles[3] = "mango";
        giggles[4] = "strawberry";





        //fruits.addAll(Arrays.asList(new String[]{"apple","banana","dragonfruit","mango", "strawberry"}));
        fruits.addAll(Arrays.asList(beetles));
        System.out.println(fruits);

        bucket.addAll(Arrays.asList(googles));
        System.out.println(bucket);

        Set<String> Union = new HashSet<String>(fruits);
        Set<String> Intersection = new HashSet<String>(fruits); //similiar in both list
        Set<String> difference = new HashSet<String>(bucket);

        Union.addAll(bucket);
        System.out.println("printing union" + Union);

        Intersection.retainAll(bucket);
        System.out.println("printing common objects: "+ Intersection);

        difference.removeAll(fruits);
        System.out.println("printing difference objects only: "+difference);






    }



}
