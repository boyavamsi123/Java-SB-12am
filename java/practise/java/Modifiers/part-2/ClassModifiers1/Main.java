public class Main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        if(account.withdraw(300.0)) {
            System.out.println("Withdrawal Successfully!...");
        }else{
            System.out.println("Not enough funds.");
        }

        System.out.println("Balance: " + account.getBalance());

        /*
        Withdrawal Successfully!...
        Balance: 700.0
        */
       
    }
}