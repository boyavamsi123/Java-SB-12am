public class Student{
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    
    public void printDetails(){
        System.out.println("Student Details:");
        System.out.println(this.name+ ", "+", " + this.rollNo + ", " + section);
    }
}