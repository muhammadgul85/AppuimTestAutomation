package JavaSolutions;

import org.testng.annotations.Test;

public class ReturnType {

    public static String[] carName()
    {
        String n1 = "Ferrari";
        String n2 = "BMW";
        String n3 = "Cheverlot";
        String n4="Mercedez Benz";

        return new String [] {n1, n2, n3, n4};
    }

    @Test
    public void callingCars()
    {
        String [] carsList = carName();
        //System.out.println(carsList[0]+ "\n" + carsList[1] +"\n"+ carsList[2]);
        for (int i=0; i<carsList.length; i++) //i<=carsList.length-1
        {
            System.out.println(carsList[i]);
        }
    }

}
