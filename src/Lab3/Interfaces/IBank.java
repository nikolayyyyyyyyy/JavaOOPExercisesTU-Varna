package Lab3.Interfaces;

import java.util.List;

public interface IBank {
    List<IAccount> getAccounts();
    double calculateAverageBalanceByCurrency(String currency);
}
