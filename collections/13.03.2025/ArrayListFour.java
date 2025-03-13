package ArrayListFour;
import java.util.ArrayList;
import java.util.Collections;

class ArrayListFour {

	public static void main(String[] args) {
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("Rahul");
		enames.add("sonia");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Vijay");
		enames.add("kamal");
		
		System.out.println(enames);
		Collections.sort(enames);
		System.out.println(enames);		
	}

}
