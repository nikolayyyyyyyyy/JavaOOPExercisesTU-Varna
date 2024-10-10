package Lab3.Models;
import Lab3.Interfaces.IAccount;
import Lab3.Interfaces.IBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank implements IBank {

    private final List<IAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    @Override
    public List<IAccount> getAccounts() {
        return accounts;
    }

    @Override
    public double calculateAverageBalanceByCurrency(String currency) {
        return accounts
                .stream()
                .filter(a-> Objects.equals(a.getCurrency(), currency))
                .mapToDouble(IAccount::getBalance)
                .average()
                .orElse(0);
    }
}
