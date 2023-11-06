package Collection;
import java.util.*;

public class ArrayListDemo extends ArrayList{

	public static void main(String[] args) {
		
		ArrayListDemo ald = new ArrayListDemo();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add("Vishal");
		al.add(10);
		al.add(20.5f);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(10));
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.get(2));
		System.out.println(al.set(4,"Rohit"));			//returns Previous data
		System.out.println(al.remove(3));
		System.out.println(al.remove(20.5f));
		al.add(2,"Mahajan");
		System.out.println(al);
		
		
		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		
		al.addAll(0,al2);
		al.addAll(al2);
		
		System.out.println(al);
		
		ald.add("A");
		ald.add("B");
		ald.add("C");
		ald.add("D");
		ald.removeRange(1, 3);
		
		System.out.println(ald);
		al.clear();
		System.out.println(al);
		
	}

}
