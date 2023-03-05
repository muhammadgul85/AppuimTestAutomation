package OOPS.PolyMorphism;

public class Dog extends Animal {

    String colour = "Black and White";
    public void makeSound()
    {
        System.out.println("Dog barking");
    }

    public void printColour()
    {
        System.out.println(colour); // this will print colour from Dog Class
        System.out.println(super.colour);//this will print colour from Animal Class

    }
}
