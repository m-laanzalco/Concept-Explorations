import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showAllAccounts() {
        System.out.println("--- Bank Database Report ---");
        for (Account acc : accounts) {
            System.out.println(acc.getSummary());
        }
    }

    public static void main(String[] args) {
        BankSystem myBank = new BankSystem();

        // Adding professional sample data
        Account acc1 = new Account("Alice Vance", "IT001", 1500.00);
        Account acc2 = new Account("Bob Miller", "IT002", 250.50);

        myBank.addAccount(acc1);
        myBank.addAccount(acc2);

        // Simulating transactions
        acc1.withdraw(200);
        acc2.deposit(500);

        myBank.showAllAccounts();
    }
}
