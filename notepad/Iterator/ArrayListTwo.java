import java.util.ArrayList;
import java.util.Iterator;

class Main{
    public static void main(String[] args){
         ArrayList<String> cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");

         System.out.println(cars);

         Iterator<String> it = cars.iterator();
 
         while(it.hasNext()) {
            System.out.println(it.next());
         }
    }
}