//without using Lambda expression
/*interface CalcI{
    public abstract int sum(int a, int b);
}
class CalcImpl implements CalcI{
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        CalcI obj = new CalcImpl();
        System.out.println(obj.sum(10, 20));
    }
}*/

//With using Lambda Expression

interface CalcI{
    public abstract int sum(int a, int b);
}

class CalcImpl{
    public static void main(String[] args) {
        CalcI obj = (a,b) -> a+b;
        System.out.println(obj.sum(10, 20));
    }
}