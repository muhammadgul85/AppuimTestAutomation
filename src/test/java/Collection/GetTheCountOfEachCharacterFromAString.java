package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetTheCountOfEachCharacterFromAString {

    public static void countingCharacterOfString(String st) {

        String s = st.replaceAll(" ", "");

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] charsA = s.toCharArray();

        // System.out.println(charsA[0]);
        // System.out.println("First Value:" +charMap.get("T"));

        for (char d : charsA) {

            if (charMap.containsKey(d)) {
                charMap.put(d, charMap.get(d) + 1); //
            } else { // if we have only 1 value then we don't want to increase the counter
                charMap.put(d, 1);
            }
        }
        System.out.println("EachCharacter Count" + charMap);
    }

    public static void main(String[] args) {

        countingCharacterOfString("The city of Edinburgh was all up and down hills surrounded by Sea");

        countingCharacterOfString("The city of Edinburgh was all up and down hills surrounded by Sea");


        /*
        String f = "The weather is really good today as it's not hot";
        String s = f.replaceAll(" ", "");

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] charsA = s.toCharArray();
       // System.out.println(charsA[0]);
       // System.out.println("First Value:" +charMap.get("T"));

        for (char d: charsA)
        {

            if (charMap.containsKey(d))
            {
                charMap.put(d, charMap.get(d)+1); //
            }
            else { // if we have only 1 value then we don't want to increase the counter
                charMap.put(d, 1);
            }

        }
        System.out.println("EachCharacter Count"+charMap);


    }

         */
    }
}

//you have an integer array and you 've to find second largest number
// example 10, 20, 50, 60, 100, and output 60
// MuhAmmad Gul Mahsood, in the name you replace a with *