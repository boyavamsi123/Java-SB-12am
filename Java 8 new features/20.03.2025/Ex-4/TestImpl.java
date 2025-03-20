
import java.util.function.Function;

class TestImpl{
    public static void main(String[] args) {
        Function<String, Integer> obj = ename -> ename.length();
        System.out.println(obj.apply("Rahul"));
    }
}