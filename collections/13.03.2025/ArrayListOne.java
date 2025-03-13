package com.vamsi.ArrayList;
import java.util.*;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		al.add(101);
		al.add("vamsi");
		al.add(45000.450);
		al.add("Bangalore");
		System.out.println(al);
		for(int i=0; i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
	}

}
