class Test{
    public static void main(String[] args) {
        Thread t = new Thread();
        //t.setPriority(10);
        t.setPriority(100);
    }
}

/*
Exception in thread "main" java.lang.IllegalArgumentException
        at java.base/java.lang.Thread.setPriority(Thread.java:1907)
        at Four.main(Four.java:5)
*/