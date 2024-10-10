package Lab3;
import Lab3.Interfaces.IAccount;
import Lab3.Interfaces.IBank;
import Lab3.Models.Account;
import Lab3.Models.Bank;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IBank bank = new Bank();
        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] accountInfo = command
                    .split(" ");

            String accountNumber = accountInfo[0];
            String accountCurrency = accountInfo[1];
            double accountBalance = Double.parseDouble(accountInfo[2]);

            IAccount account = new Account(accountNumber,
                    accountCurrency,
                    accountBalance);

            bank.getAccounts().add(account);
            command = scanner.nextLine();
        }

        System.out.println("Accounts:");
        System.out.println();

        bank.getAccounts()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("AverageBalanceByCurrency:");
        String currency = scanner.nextLine();
        System.out.printf("Currency: %s%n", currency);
        System.out.println(bank.calculateAverageBalanceByCurrency(currency));

    }
}
