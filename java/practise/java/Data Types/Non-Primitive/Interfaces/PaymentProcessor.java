public class PaymentProcessor{
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.processPayment(100.0);
        payment2.processPayment(200.0);
    }
}