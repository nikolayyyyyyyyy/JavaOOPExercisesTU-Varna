package BankSystem.Models;

import BankSystem.Interfaces.IClient;
import BankSystem.Interfaces.IDepositAccount;

import java.time.LocalDate;


public class DepositAccount extends Account implements IDepositAccount {

    public DepositAccount(IClient client,
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

    @Override
    public void withdrawalMoney(float amount) {
        this.balance -= amount;
    }
}
