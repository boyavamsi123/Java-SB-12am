public class EmployeeArrayExample {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Employee("Alice",101);
        employees[1] = new Employee("Bob",102);

        for(Employee e : employees) {
            e.show();
        }
    }
}