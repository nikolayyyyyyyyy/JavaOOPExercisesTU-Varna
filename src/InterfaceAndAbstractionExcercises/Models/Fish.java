package InterfaceAndAbstractionExcercises.Models;
import InterfaceAndAbstractionExcercises.Interfaces.IMovement;
import InterfaceAndAbstractionExcercises.Interfaces.Pet;

public class Fish extends Animal implements IMovement, Pet {

    public Fish(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String move() {
        return "fishfishfish";
    }

    @Override
    public String sound() {
        return "Sound of Fish!";
    }
}
