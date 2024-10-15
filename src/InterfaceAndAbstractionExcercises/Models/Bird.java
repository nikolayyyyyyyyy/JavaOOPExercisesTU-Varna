package InterfaceAndAbstractionExcercises.Models;

import InterfaceAndAbstractionExcercises.Interfaces.IMovement;
import InterfaceAndAbstractionExcercises.Interfaces.Wild;

public class Bird extends Animal implements IMovement, Wild {

    public Bird(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String move() {
        return "birdbirdbird";
    }

    @Override
    public String sound() {
        return "Sound of bird!";
    }
}
