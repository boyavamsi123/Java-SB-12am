interface I{
    public void methodOne();
}
class Test{
    public static void main(String[] args) {
        I i = () -> {
            System.out.println("Test class methodOne");
        };
        i.methodOne();
    }
}