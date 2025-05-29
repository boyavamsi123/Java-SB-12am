public class Puppy{
    private int age;
    String name;

    public Puppy() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        myPuppy.setAge(2);

        myPuppy.name="Tummy";
        System.out.println("Age:" + myPuppy.getAge() +",name: "+ myPuppy.name);
    }
}