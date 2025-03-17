import java.util.ArrayList;
import java.util.Collections;

class ArrayListOne{
    public static void main(String[] args){
       ArrayList<Integer> num = new ArrayList<Integer>();
          num.add(12);
          num.add(21);
          num.add(55);
          num.add(65);

          System.out.println(num);

         Collections.sort(num);

          for(int i : num){
               System.out.println(i);
          }
     }   
}