class Dog{
    String breed;
    int age;
    String color;

    public void setBreed(String breed){
        this.breed= breed;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}