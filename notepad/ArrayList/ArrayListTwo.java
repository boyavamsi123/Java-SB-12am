import java.util.ArrayList;
import java.util.Collections;

class ArrayListTwo{
    public static void main(String[] args){
       ArrayList<String> cars = new ArrayList<String>();
       cars.add("BWM");
       cars.add("Volvo");
       cars.add("Suzuki");
       cars.add("THAR");
       cars.add("Maruthi");

       System.out.println(cars);

       Collections.sort(cars, Collections.reverseOrder());
      
       System.out.println(cars);

       for(String i : cars){
          System.out.println(i);
       }     
    }
}