class Test{
    public static void main(String[] args) {
        Thread.sleep(5000);
    }
}

/*
error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(5000);
                    ^
*/