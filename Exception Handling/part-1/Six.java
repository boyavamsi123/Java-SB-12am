class Test{
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}

/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Test.main(Six.java:4)
*/