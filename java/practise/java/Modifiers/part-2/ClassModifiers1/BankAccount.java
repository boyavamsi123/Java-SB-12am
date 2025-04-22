public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true; // Successful withdrawal
        } else {
            return false; // Not enough balance or invalid amount
        }
    }

    public double getBalance() {
        return balance;
    }
}
