class Test1{
    public static void main(String[] args) {
        System.out.println("Good Morning");
        System.out.println(10/0);
        System.out.println("Good Night");
    }
}

/*
*Exception in thread "main" java.lang.ArithmeticException: / by zero
*       at Test1.main(Test1.java:4)
*/