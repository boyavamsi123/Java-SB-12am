/*class Animal{
    void makeSound () {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound(){
        super.makeSound();
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        // Animal makes sound 
        // Dog barks
    }
}*/


/*class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printName(){
        System.out.println(super.name);
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();  // Animal 
    }
}*/

class Animal{
    final void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}