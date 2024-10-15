package BankSystem.Models;

import BankSystem.Interfaces.IClient;

public class Company implements IClient {

    private final String name;

    public Company(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
