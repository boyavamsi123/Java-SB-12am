interface DaoI{
    public abstract void login();
}
class Dao implements DaoI{
    public void login(){
        System.out.println("Login Success");
    }
    public static void main(String[] args) {
        DaoI obj = new Dao();
        obj.login();
    }
}