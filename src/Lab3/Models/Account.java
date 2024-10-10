package Lab3.Models;

import Lab3.Interfaces.IAccount;

public class Account implements IAccount {

    private String accountNumber;
    private String currency;
    private double balance;

    public Account(String aNumber,String currency,double balance){

        setAccountNumber(aNumber);
        setCurrency(currency);
        setBalance(balance);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String aNumber) {
        accountNumber = aNumber;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {

        String stringBuilder = "Account:" + "\n" +
                "Account Number: " + this.accountNumber + "\n" +
                "Currency: " + this.currency + "\n" +
                "Balance: " + this.balance + "\n";

        return stringBuilder.trim();
    }
}
