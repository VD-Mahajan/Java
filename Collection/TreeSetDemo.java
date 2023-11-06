package Collection;
import java.util.*;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(40);
		
		TreeSet<String> sts = new TreeSet<>();
		sts.add("B");
		sts.add("C");
		sts.add("D");
		sts.add("A");
		
		System.out.println(ts);
		System.out.println(sts);

	}
}
