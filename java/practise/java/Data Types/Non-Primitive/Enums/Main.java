public class Main {
    public static void main(String[] args) {
        Order order = new Order (101,OrderStatus.PROCESSING);
        order.printStatus();
    }
}