package BankSystem.Models;

import BankSystem.Interfaces.IClient;

public class Person implements IClient {

    private final String name;

    public Person(String name){
        if(name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
