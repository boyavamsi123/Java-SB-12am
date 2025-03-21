
import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class FunctionEx3{
    public static void main(String[] args){
        Function<List, Integer> f = enames -> enames.size();
        List<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        System.out.println(f.apply(enames));  //3

    }
}