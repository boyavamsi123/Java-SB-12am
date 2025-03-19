interface I{
    public void sum(int a, int b);
}
class Test implements I{
    public void sum(int a, int b){
        System.out.println("Sum : " +(a+b));
    }
    public static void main(String[] args) {
        I i = new Test();
        i.sum(10, 20);
    }
}