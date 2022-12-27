package Quiz;

public class RemoveSpecialCharacterExample3 {
    public static void main(String[] args) {

        //declare a string having special characters
        //Another way to trim string
        String str = "Pr!ogr#am%m*in&g Lan?#guag(e";
        String resString ="";
        for (int i=0; i<str.length(); i++)//loop execute till the length of the string
        {//comparing alphabets with their corresponding ASCII value
            if (str.charAt(i) > 64 && str.charAt(i) <= 122)//returns true if both conditions returns true
            {
                //adding characters into empty string
                resString = resString + str.charAt(i);
            }
        }
        System.out.println("String after removing special characters: " + resString);
    }
}





