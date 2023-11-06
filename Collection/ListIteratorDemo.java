package Collection;
import java.util.*;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Kedar");
		al.add("Pankhaj");
		al.add("Shubham");
		al.add("Shashank");
		al.add("Ajay");
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
