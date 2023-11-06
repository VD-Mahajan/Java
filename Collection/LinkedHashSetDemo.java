package Collection;

import java.util.*;

public class LinkedHashSetDemo {
	
	//Insertion order preserved 
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Vishal");
		lhs.add("Kedar");
		lhs.add("Pankhaj");
		lhs.add("Shashank");
		lhs.add("Ajay");
		lhs.add("Vinod");
		lhs.add("Vishal");
		lhs.add("Kedar");

		System.out.println(lhs);
	}
}
