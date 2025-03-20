
import java.util.function.Function;

class FunI{

    public static void main(String[] args) {
        Function<Integer, Integer> obj = num -> num*num;
        System.out.println(obj.apply(10));
    }
}