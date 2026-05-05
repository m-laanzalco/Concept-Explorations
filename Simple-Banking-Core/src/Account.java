public class Account
{
    private String accountNumber;
    private String owner;
    private double balance;

    public Account(String owner, String accountNumber, double initialDeposit)
    {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount)
    {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getSummary()
    {
        return "ID: " + accountNumber + " | Owner: " + owner + " | Balance: " + balance + "€";
    }
}