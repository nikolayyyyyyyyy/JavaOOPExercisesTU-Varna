package BankSystem.Models;

import BankSystem.Interfaces.IAccount;
import BankSystem.Interfaces.IClient;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Account implements IAccount {
    private IClient client;
    protected float balance;
    protected double monthInterestPercent;
    private final LocalDate dateOfIssue;

    public Account(IClient client,
                   float balance,
                   LocalDate issue) {
        setClient(client);
        setBalance(balance);
        this.dateOfIssue = issue;
    }

    @Override
    public void setClient(IClient client){

        if(Objects.equals(client,null)){
            throw new IllegalArgumentException("Client cannot be null!");
        }
        this.client = client;
    }
    @Override
    public void setBalance(float amount){

        if(amount <= 0 ){
            throw new IllegalArgumentException("The balance cannot be negative!");
        }
        this.balance = amount;
    }
    @Override
    public void setMonthInterestPercent(double percent) {

        if (percent <= 0) {
            throw new IllegalArgumentException("Interest percent cannot be negative!");
        }
    }
    @Override
    public LocalDate getIssueDate(){
        return this.dateOfIssue;
    }

    @Override
    public IClient getClient() {
        return this.client;
    }

    @Override
    public float getBalance(){
        return this.balance;
    }
}
