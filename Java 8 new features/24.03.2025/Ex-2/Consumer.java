
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface ConsumerI{
    public abstract void accept(List names);
}
class ConsumerEx{
    public static void main(String[] args) {
       List<String> names= Arrays.asList("Rahul","SG","PG");
       ConsumerI c1 = enames -> {
        for (Object ename : enames){
            System.out.println(ename);
        }
       };
       c1.accept(names);
       Consumer<List> c2 = enames -> {
        for (Object ename : enames) {
            System.out.println(ename);
        }
       };
       c2.accept(names);
    }   
}