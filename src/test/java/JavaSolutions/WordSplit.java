package JavaSolutions;

import org.testng.annotations.Test;

public class WordSplit {
    @Test
    public void wordTest()
    {


        String name = "Muhammad Ali Khan Baig 8 years old";
       // String [] bb = name.split("\\s+");
        //String [] bb = name.split("\\D");
       // String [] bb = name.split("\\d");
        String [] bb = name.split("\\d+");

        for (int i=0; i<=bb.length-1;i++)
        {

            System.out.println(bb[i]);
        }
    }


}
