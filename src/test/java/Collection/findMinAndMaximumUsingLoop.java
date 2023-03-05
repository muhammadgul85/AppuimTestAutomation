package Collection;
    /*
   You 've 5 elements 10, 50, 100, 1000, 10000 elements of Set
   add these
   find min and max
   use the logic of for loop and if loop
 */
import java.util.*;


public class findMinAndMaximumUsingLoop {
    public static void main(String[] args) {


      //List<Integer> numbers = new ArrayList<>(Arrays.asList(10,50, 100, 1000, 10000));

        Set<Integer> number = new HashSet<Integer>();
        number.add(100);
        number.add(1000);
        number.add(50000);
        number.add(10);

        number.add(10000);
        System.out.println("List: "+number);

        int maximum=-1;
        int minimum=-1;
        for (int t : number)
        {
            if (maximum==-1 )
            {
                maximum=t;
            }
            else if (t>maximum)
            {
                maximum=t;
            }

        }
        for (int t : number)
        {
            if (minimum==-1 )
            {
                minimum=t;
            }
            else if (t<minimum)
            {
                minimum=t;
            }

        }

        System.out.println(maximum);
        System.out.println(minimum);






















        //System.out.println("maximum: " + Collections.max(number));
        //System.out.println("minimum: " + Collections.min(number));
       // Arrays.asList(number);
     /*   int size = number.size();
        System.out.println("Size of List: " + size);
        System.out.println("Deleting all: " + number.removeAll(number));

      */









    }
}
