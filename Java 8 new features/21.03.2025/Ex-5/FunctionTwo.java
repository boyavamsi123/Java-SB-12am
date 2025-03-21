import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FunctionTwo{
    public abstract int apply(List enames);
}
class FunctionEx1 implements FunctionTwo{
    public int apply(List enames){
        return enames.size();
    }
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        FunctionTwo obj = new FunctionEx1();
        System.out.println(obj.apply(enames));  //3
    }
}