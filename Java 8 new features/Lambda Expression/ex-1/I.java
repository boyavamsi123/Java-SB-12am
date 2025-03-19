interface I{
    public void methodOne();
}
class Test implements I{
    public void methodOne(){
        System.out.println("Test Class MethodOne - method");
    }
    public static void main(String[] args) {
        I i = new Test();
        i.methodOne();
    }
}