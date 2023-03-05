package Collection;

import java.util.*;

public class SetExample1 {
    public static void main(String[] args) {

        Set<Integer> setObj = new HashSet<Integer>() ;
        setObj.add(1);
        setObj.add(2);
        setObj.add(3);
        setObj.add(4);
        setObj.add(5);
        setObj.add(6);
        System.out.println("setObj: "+setObj);
       // System.out.println("Is 7 present: " + setObj.contains(7));

        boolean is7Present = setObj.contains(7);
        System.out.println(is7Present);
        setObj.remove(3);
        System.out.println(setObj);
        System.out.println("***************************");

        for (int t : setObj)
        {
            System.out.print(t);
        }
        System.out.println();

        //Set is un-ordered, so we have to convert this into ordered way either to Array or ArrayList
       // Object [] setObjArray = setObj.toArray();
        Integer [] setObjArray = setObj.toArray(new Integer[setObj.size()]); //casting as converting to Integer Array
        for (int i =0; i < setObjArray.length; i++)
        {
            System.out.print(setObjArray[i]); // Array we use index to fectch value
        }
        System.out.println();
        List<Integer> arrayObj = new ArrayList<Integer>(setObj);
        for (int j=0; j<arrayObj.size(); j++)
        {
            System.out.print(arrayObj.get(j)); // List we use get() to fectch value
        }
        System.out.println();

        /*
        Iterating through iterator
         */
        Iterator iterator = setObj.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }
        System.out.println();

        //to keep items in the order the way you added them, you will fetch them in the same order
        Set<String> stringsObj = new LinkedHashSet<String>() ;
        stringsObj.add("apple");
        stringsObj.add("mango");
        stringsObj.add("banana");
        stringsObj.add("cheeko");
        stringsObj.add("kiwi");
        stringsObj.add("gracia");
        System.out.println("setObj: "+stringsObj);

        for (String jj : stringsObj)
        {
            System.out.println(jj);
            if (jj.equalsIgnoreCase("cheeko"))
            {
                System.out.println("cheecko found -- discarding");
                break;
            }
        }

        System.out.println(stringsObj.isEmpty());
        boolean isstringsObjEmpty = setObj.isEmpty();
        System.out.println("is strings Obj Empty: " +isstringsObjEmpty);

       // setObj.clear();
       // System.out.println("is strings Obj Empty: " +isstringsObjEmpty);

        System.out.println("Another way of removal: " + setObj.removeAll(setObj));
        System.out.println(setObj.isEmpty());

/*
   You 've 5 elements 10, 50, 100, 1000, 10000 elements of Set
   add these
   find min and max
   use the logic of for loop and if loop
 */

        }


    }

