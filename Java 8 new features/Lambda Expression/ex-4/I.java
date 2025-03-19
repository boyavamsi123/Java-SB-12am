interface I{
    public void sum(int a, int b);
}
class Test{
    public static void main(String[] args) {
        I i = (a,b)->System.out.println("Sum : " +(a+b));
        i.sum(10, 20);
    }
}