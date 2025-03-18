@FunctionalInterface
interface A{
    public abstract void login();
}

class B{
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("Login Success");
        };
        obj.login();
    }
}