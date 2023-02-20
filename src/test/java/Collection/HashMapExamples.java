package Collection;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {


        HashMap<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("Abc", 44);
        persons.put("Gul", 33);
        persons.put("Khan", 32);

        for (int i=0; i<persons.size(); i++)
        {
            System.out.println("keys: "+i + " values: "+ persons.get(i));
        }




    }
}
