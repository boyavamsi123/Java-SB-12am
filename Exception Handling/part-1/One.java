public class Test{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
/*
java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:4)
java.lang.ArithmeticException: / by zero
/ by zero
 */