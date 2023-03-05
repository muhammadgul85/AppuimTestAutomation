package Generic;

import java.util.Arrays;
import java.util.List;

public class Unbounded_WildCards {
/*
   The Unbounded-WildCard is specified using the wildcard character (?) e.g. List<?>
   List of unknown type - When we are not sure what type of data to store in the list we provide "?" or wildCard Character
 */
 /*   public static <T>void printList (List<T> list)
    {
        for (Object listObj : list)
            System.out.println(listObj);
    }

    public static void main(String[] args) {
        List<Object> listOfOfficeDetails = Arrays.asList("Gul", 1203119, true);
        printList(listOfOfficeDetails);

        List<Integer> integersList = Arrays.asList(1,3,4,5,6,7,8);
        printList(integersList); // Class Integer is sub-type of Class Object but List<Integer> is not sub type of List Object
    }


  */


    public static void printList (List<?> list) //List Type is un-declared, The use of this wild card is very so it's recommended to use ? rather than T, V etc
    {
        for (Object intobj : list)
            System.out.println(intobj);
    }

    public static<T> void printList (List<T> list, T item)
    {
      // list.add(item); Need to check this
      //  list.add(null);
       // list.add("zolo");
        for (Object intobj : list)
            System.out.println(intobj);
    }

    public static void main(String[] args) {
        List<Object> listOfOfficeDetails = Arrays.asList("Gul", 1203119, true);
        printList(listOfOfficeDetails);

        List<Integer> integersList = Arrays.asList(1,3,4,5,6,7,8);
        printList(integersList); // Class Integer is sub-type of Class Object but List<Integer> is not sub type of List Object
        printList(listOfOfficeDetails, "Gul");
       // printList(Arrays.asList(1,3,4,5 ),Arrays.asList(22)); Need to check this

    }




}
