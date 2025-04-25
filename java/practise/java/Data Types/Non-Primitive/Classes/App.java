public class App {
    public static void main(String[] args) {
        Product p = new Product(1, "Smartphone", 499.99);
        ProductService service = new ProductService();
        service.printProductDetails(p);
    }
}