class InsuffientFundsException extends Exception{

    InsuffientFundsException(String msg) {
        super(msg);
    }
}
public class Account{
    public void Withdrawl_amount(int amount) throws InsuffientFundsException{
        int acc_Bal=5000;
        if(acc_Bal>amount){
            System.out.println("Go & Enjoy");
        }
        else{
            throw new InsuffientFundsException("Low Bal; Go PG");
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.Withdrawl_amount(amount:15000);
    }
}