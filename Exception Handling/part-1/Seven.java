class Test{
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[6]);
    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at Test.main(Seven.java:4)
*/