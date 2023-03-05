package OOPS.PolyMorphism;
/*
OverRiding is called as Runtime PolyMorphism - because which methods it has to call that is going to decide on RUNTIME -
 */
public class OverRidingExample {
    public static void main(String[] args) {
     //   Animal animal = new Animal();
     //   animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        Dog dog1 = new Dog();
        dog1.printColour();


    }
}
