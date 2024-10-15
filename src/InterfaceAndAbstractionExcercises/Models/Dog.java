package InterfaceAndAbstractionExcercises.Models;
import InterfaceAndAbstractionExcercises.Interfaces.IMovement;
import InterfaceAndAbstractionExcercises.Interfaces.Pet;

public class Dog extends Animal implements IMovement, Pet {

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String move() {
        return "dogdogdogdog";
    }

    @Override
    public String sound() {
        return "Sound of dog!";
    }
}
