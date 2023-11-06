package Collection;
import java.util.*;

public class ArrayListSort {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}
