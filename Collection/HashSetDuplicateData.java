package Collection;
import java.util.*;

public class HashSetDuplicateData {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(Integer.valueOf(10));				//new Integer depreacated since version java 9
		hs.add(Integer.valueOf(20));
		
		System.out.println(hs);

	}
}
