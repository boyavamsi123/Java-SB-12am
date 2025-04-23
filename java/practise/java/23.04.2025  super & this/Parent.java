class Parent{
    void show() {
        System.out.println("Parenty Method");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child Method");
    }
}