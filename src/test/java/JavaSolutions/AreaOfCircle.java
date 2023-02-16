package JavaSolutions;

import org.testng.annotations.Test;

public class AreaOfCircle {
    // area of circle and return area, add 5 elements into list and return all elements through return statement
    /* Area of Circle = Pie R(Square) , 3.142 * r * r and r is the radius of circle
     */
    @Test
    public void getCircleArea()
    {
        System.out.println(areaofCircle(15));
    }


    public double areaofCircle(double r)
    {
        double area = 3.14 * r * r;
        return  area;
}




}