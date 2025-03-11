

class Test2{
    public static void main(String[] args) {
        System.out.println("Good Morning");
        try {
            throw new ArithmeticException("/ by Zero");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Good Night");
    }
}