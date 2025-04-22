public class Main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(250.0);
        System.out.println("Balance: " + account.getBalance());  // Balance: 1250.0
    }
}