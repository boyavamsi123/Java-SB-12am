import java.util.ArrayList;
import java.util.function.Consumer;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        Consumer<Integer> method = (n) ->{
            System.out.println(n);
        };
        number.forEach(method);
    }
}