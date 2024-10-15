package BankSystem.Interfaces;

import java.time.LocalDate;

public interface IAccount {
    double getInterest(int mouth);
    void depositMoney(float amount);
    void setBalance(float amount);
    void setClient(IClient client);
    void setMonthInterestPercent(double percent);
    LocalDate getIssueDate();
    IClient getClient();
    float getBalance();
}
