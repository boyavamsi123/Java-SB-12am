public class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + "via PayPal.");
    }
}