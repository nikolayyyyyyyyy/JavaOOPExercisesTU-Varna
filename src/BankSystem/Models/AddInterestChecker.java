package BankSystem.Models;
import BankSystem.Interfaces.IAccount;
import BankSystem.Interfaces.IChecker;
import java.time.LocalDate;
import java.time.Period;

public class AddInterestChecker implements IChecker {
    private final float DEPOSIT_ACCOUNT_INTEREST = 2;
    private final float CREDIT_ACCOUNT_INTEREST = 3;
    private final float MORTGAGE_ACCOUNT_INTEREST = 4;

    @Override
    public void checkDates(IAccount[] accounts) {
        LocalDate currentDate = LocalDate.now();

        for(IAccount account : accounts) {
            if(account.getClass().getSimpleName().equals("DepositAccount")){

                if(account.getBalance() >= 0 && account.getBalance() < 1000){
                    account.setMonthInterestPercent(0);
                } else {
                    account.setMonthInterestPercent(DEPOSIT_ACCOUNT_INTEREST);
                }
            } else if(account.getClass().getSimpleName().equals("CreditAccount")){

                Period difference = Period.between(account.getIssueDate(),currentDate);
                int totalMonths =
                        difference.getYears() * 12 + difference.getMonths();

                if(account.getClient().getClass().getSimpleName().equals("Person")){
                    if(totalMonths <= 3) {
                        account.setMonthInterestPercent(0);
                    } else {
                        account.setMonthInterestPercent(CREDIT_ACCOUNT_INTEREST);
                    }
                } else {
                    if(totalMonths <= 2) {
                        account.setMonthInterestPercent(0);
                    } else {
                        account.setMonthInterestPercent(CREDIT_ACCOUNT_INTEREST);
                    }
                }
            } else {

                Period difference = Period.between(account.getIssueDate(),currentDate);
                int totalMonths =
                        difference.getYears() * 12 + difference.getMonths();

                if(account.getClient().getClass().getSimpleName().equals("Person")){
                    if(totalMonths <= 6) {
                        account.setMonthInterestPercent(0);
                    } else {
                        account.setMonthInterestPercent(MORTGAGE_ACCOUNT_INTEREST);
                    }
                } else {
                    if(totalMonths <= 12) {
                        account.setMonthInterestPercent(account.getBalance() / 2);
                    } else {
                        account.setMonthInterestPercent(CREDIT_ACCOUNT_INTEREST);
                    }
                }
            }
        }
    }
}
