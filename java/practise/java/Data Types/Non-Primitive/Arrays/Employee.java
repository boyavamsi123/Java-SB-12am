public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void show(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}