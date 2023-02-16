package JavaSolutions;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class StringSplit {

    @Test
    public void whenSplitThenCorrect()
    {
        String s= "Welcome to Baeldung";
        String [] expected1 = new String[] {"Welcome","to", "Baeldung"};
        String [] expected2 = new String[] {"Welcome", "to Baeldung"};

        assertArrayEquals(expected1, s.split(" "));
        assertArrayEquals(expected2, s.split(" ", 2));


        String f= "Welcome to * Bristol";

       String[] dd = f.split(" ");
       System.out.println("dd: " + dd[3]);
        String[] ff = f.split(" ");
        System.out.println("ff: " +ff[1]);


        List<String> stringList = Pattern.compile("-")
                .splitAsStream("004-034556")
                .collect(Collectors.toList());

        for (int t = 0; t<stringList.size(); t++) // Why am I getting the output as 0 and 1
        {
            System.out.println(t);
        }


        int p = f.indexOf('*');
        if (p > 0)
        {
          String left = s.substring(0,p);
            String Right = s.substring(p + 1);
            System.out.println("left: "+ left);
            System.out.println("Right: "+ Right);
        }
        else
        {
            System.out.println("No string exists");
        }

        String k = "Hello - Computershare is ok";
        int q = k.indexOf('-');
        if (q>0)
        {
            String left1 = k.substring(0, q);
            String right1 = k.substring( q + 1 );
            System.out.println("left: "+ left1);
            System.out.println("Right: "+ right1);
        }

      // String split [] = StringUtils.split(dd, "*");
      /*  public static String[] split(String str, char separatorChar);
        String str = "004-034556";

        String split[] = StringUtils.split(str,"-");

       */




        String ss = " ;String; alpha; Beta ;* > £$";
        System.out.println("ss length: " +ss.length());
        String [] strs = ss.split("[,\\;*>£$]");

        System.out.println("srs length: " + strs.length);
        for (int l=0; l< strs.length; l++)
        {
           // System.out.println("strs:[" + l + " ]: " + strs[l]);
        }
        System.out.println("strs:[" + 1 + "]: " + strs[1]); //To print the specific element, pass index number






    }
}
