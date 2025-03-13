package ArrayListThree;
import java.util.ArrayList;

class ArrayListThree {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList<Integer> eids = new ArrayList<Integer>();
		ArrayList<String> enames = new ArrayList<String>();
		
		System.out.println(al);
		
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("vijay");
		enames.add("kamal");
		for(String ename:enames) {
			System.out.println(ename);
		}
		System.out.println(enames.isEmpty());
		System.out.println(enames.contains("kamal"));
	}

}
