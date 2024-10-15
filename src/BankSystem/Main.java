package BankSystem;

import BankSystem.Interfaces.IAccount;
import BankSystem.Interfaces.IChecker;
import BankSystem.Interfaces.IClient;
import BankSystem.Models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IClient firstPersonClient
                = new Person("Nikolay");

        IClient firstCompanyClient
                = new Company("NikolayOOD");

        IAccount[] accounts = new IAccount[]{
                new DepositAccount(firstPersonClient,
                        19000,
                        LocalDate.now()),
                new CreditAccount(firstPersonClient,
                        19000,
                        LocalDate.now()),
                new CreditAccount(firstCompanyClient,
                        19000,
                        LocalDate.now()),
                new MortgageAccount(firstPersonClient,
                        19000,
                        LocalDate.now()),
                new MortgageAccount(firstCompanyClient,
                        19000,
                        LocalDate.now())
        };

        IChecker checker = new AddInterestChecker();

        checker.checkDates(accounts);
    }
}
