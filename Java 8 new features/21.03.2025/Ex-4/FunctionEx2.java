
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class FunctionEx2{
    public static void main(String[] args) {
        Function f = enames->enames.size();
        List<String> enames=Arrays.asList("RG","SG","PG","NG");
        System.out.println(f.apply(enames));
    }
}