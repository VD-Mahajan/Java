package Collection;
import java.util.*;
public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Kedar");
		al.add("Pankhaj");
		al.add("Shubham");
		al.add("Shashank");
		al.add("Ajay");
		
		Iterator<String> itr = al.iterator();				//Iterator is Interface  and used as reference.
													        //iterator is method of Collection Interface which returns object of Iterator,
		while(itr.hasNext()) {
			if("Shubham".equals(itr.next()))
				itr.remove();
		}
		
		System.out.println(al);
	
	}
}
