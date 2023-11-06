package Collection;
import java.util.*;

public class HashSetDemo {
	//HashSet uses HashTable for storage.
	//Duplicate data is not allowed.
	//allows null value.
	//insertion order is not preserved
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Vishal");
		hs.add("Kedar");
		hs.add("Pankhaj");
		hs.add("Shashank");
		hs.add("Ajay");
		hs.add("Vinod");
		hs.add("Vishal");
		hs.add("Kedar");

		System.out.println(hs);
	}
}
