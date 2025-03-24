import java.util.Arrays;
import java.util.List;

interface ConsumerTwo{
    public abstract void accept(List enames);
}

class ConsumerExTwo implements ConsumerTwo{
    public void accept(List enames){
        for(Object ename : enames){
            System.out.println(ename);
        }
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul","SG","PG");
        ConsumerTwo c1 = new ConsumerExTwo();
        c1.accept(names);
    }
}