import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FIAll{
    public static void main(String[] args){
        List<String> names = Arrays.asList("Rahul","SG","PG");

        Function<List, Integer> f1 = enames->enames.size();
        System.out.println(f1.apply(names));

        Predicate<List> P1 = unames->unames.contains("SG");
        System.out.println(P1.test(names));

        Consumer<List> c1 = pnames->{
            for(Object pname:pnames){
                System.out.println(pname);
            }
        };
        c1.accept(names);

        //Supplier<List> s1 = ()->names.size();
        //System.out.println(s1.get()); 



    }
}