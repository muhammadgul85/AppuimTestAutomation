package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/*
It stores data in Key Value pairs and you can access them by the index of another type e.g Integer, String or String String etc
1 object is used as key and the other is as Value
Duplicate key is not allowed, Null key is allowed but there is only 1 null key, but any numbers of null values.
HashMap - Synchro
 */
public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, Integer> personAge = new HashMap<String, Integer>();
        personAge.put("John", 29);// rather than add() we use put
        personAge.put("Ageston", 33);
        personAge.put("Animal", 44);
        personAge.put("Azimal", 44);
        System.out.println(personAge);
        System.out.println(personAge.get("Animal"));

        for (Map.Entry<String, Integer> p:personAge.entrySet() )
        {
            System.out.println(p.getKey() + " " + p.getValue());
        }

        Set credentials = personAge.entrySet(); // we converted into Set, however we cannot get key and values

        Iterator iterator =  credentials.iterator();
        while (iterator.hasNext())
        {
           Map.Entry entry= (Map.Entry)iterator.next(); // converting into map.entry so that we can get key and value separately
            System.out.println("key: " +entry.getKey() + ", value: " + entry.getValue());
        }

        personAge.replace("Animal", 43);

        System.out.println(personAge);

        personAge.put("Ageston", 66);

        System.out.println(personAge);

        //remove it completely

        personAge.remove("Ageston");
        System.out.println(personAge);

        personAge.remove("Animal",43 );
        System.out.println(personAge);

        /*
        public static String enterQty(int selctGroup, String qty) // if it's integar convert qty.toString()
        {                             //Select Group - Create a separate method
            elementName.sendkeys("qty");
            seleGroup.click(selctGroup);
        }
        enterQty(4)
         */




    }
}
