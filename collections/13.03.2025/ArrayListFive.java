package ArrayListFive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayListFive {

	public static void main(String[] args) {
		ArrayList<String> enames = new ArrayList<String>();
		    enames.add("Rahul");
	        enames.add("Sonia");
	        enames.add("Priyanka");		
	        enames.add("Modi");
	        enames.add("Vijay");
	        enames.add("Kamal");
	        System.out.println(enames);
	        Collections.sort(enames,Collections.reverseOrder());
	        System.out.println(enames);
	}

}
