public class Order {
    private int orderId;
    private OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void printStatus() {
        System.out.println("Order ID: " + orderId + ", Status: " + status);
    }
}