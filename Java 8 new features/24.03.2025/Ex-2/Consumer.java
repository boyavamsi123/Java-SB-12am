
import java.util.Arrays;
import java.util.List;


interface Consumer{
    public abstract void accept(List names);
}
class Test{
    public static void main(String[] args) {
       List<String> names= Arrays.asList("Rahul","SG","PG");
       ConsumerI<List> c1 = enames -> {
        for(Object ename:enames){
            System.out.println(ename);
        }
       };
       c1.accept(names);
    }
}