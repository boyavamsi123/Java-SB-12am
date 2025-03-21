import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class FunctionEx3{
    public static void main(String[] args) {
        Function<List<String>, Integer> f = new Function<List<String>, Integer>(){
            public Integer apply(List<String> enames){
                return enames.size();
            }
        };
        List<String> enames = new ArrayList<>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");

        System.out.println(f.apply(enames));   //3
    }
}