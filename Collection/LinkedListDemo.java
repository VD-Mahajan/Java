package Collection;
import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);

		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		
		ll.add(1,30);
		System.out.println(ll);
		
	}
}
