
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class FunctionEx3{
    public static void main(String[] args) {
        Function<List, Integer> f = enames -> enames.size();
        Predicate<String> p = enames->enames.length()>5;

        System.out.println(p.test("Rahul Gandhi"));  //true
        System.out.println(p.test("Ravi"));          //false
    }
}