public class CompanyApp {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alice",101,75000.00);
        Employee emp2 = new Employee("Bob",102,82000.5);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}