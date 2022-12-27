package Quiz;

public class ReplaceFromString {
    public static void main(String[] args) {
        String str= "This#string%contains^special*123characters&.";

       // System.out.println(str.replaceAll("[#%^*&]*",""));

      //  System.out.println(str.replaceAll("[^a-zA-Z]",""));//[^a-zA-Z0-9]         ^ means, We are not considering
        //// anything that doesn't come between a-z or A-Z, Replacing them with blank


        String str1 = str.replaceAll("\\W", "");//W removes special characters,\\w keeps special characters only

        // \\d  remove digits \\D will keep digits only,
        System.out.println(str1);

        String wp = "My name is gul and I have 2 cars";
        System.out.println("Numbers only: " + wp.replaceAll("[^0-9]", ""));

        String wp1 = "My name is gul and I have 3 cars and I am using only 2 car on regular basis";
        System.out.println(wp1.replaceAll("[^2-9]", ""));




        String netvalue = " $ 100.09";
        String[] arrOfStr = netvalue.split(" ");

            System.out.println("currency of b: " + arrOfStr[1] + "\n" + "value is: " +arrOfStr[2]);




        // Custom input string
   /*  String str2 = "geekss@for@geekss";
        String[] arrOfStr = str2.split("@"); //split on the basis of @  // String[] = Creating array and type of array is String
       // Char [] abcc   creating array and type is Character
        //int []   //array of integer
        int counter=1;
        for (String a : arrOfStr)
        {
            System.out.println(counter +"."+ a);
            counter++;

        }


    */
    }

//











    }

