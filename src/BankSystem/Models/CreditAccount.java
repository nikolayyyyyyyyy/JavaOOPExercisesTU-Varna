package BankSystem.Models;

import BankSystem.Interfaces.IClient;

import java.time.LocalDate;

public class CreditAccount extends Account{

    public CreditAccount(IClient client,
                         float balance,
                         LocalDate issue) {
        super(client, balance,issue);
    }

    @Override
    public double getInterest(int mouth) {
        return mouth * this.monthInterestPercent;
    }

    @Override
    public void depositMoney(float amount) {
        this.balance += amount;
    }
}
