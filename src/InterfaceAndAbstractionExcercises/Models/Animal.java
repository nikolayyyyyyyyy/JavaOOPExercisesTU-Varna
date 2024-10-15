package InterfaceAndAbstractionExcercises.Models;

import InterfaceAndAbstractionExcercises.Interfaces.IMovement;

public abstract class Animal implements IMovement {
    private final String name;
    private final int age;
    private final String breed;

    public Animal(String name,int age,String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public abstract String sound();
}
