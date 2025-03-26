
import java.util.Comparator;

class Car{
    public  String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2){
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;
        return 0;
    }
}
class Car implements Comparable {
  public String brand;
  public String model;
  public int year;
  
  // Decide how this object compares to other objects
  public int compareTo(Object obj) {
  	Car other = (Car)obj;
    if(year < other.year) return -1; // This object is smaller than the other one
    if(year > other.year) return 1;  // This object is larger than the other one
    return 0; // Both objects are the same
  }
}