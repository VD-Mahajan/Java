package Collection;
import java.util.*;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push("Vishal");
		st.push("Datta");
		st.push("Mahajan");
		st.push("Rohit");
		
		st.pop();
		
		System.out.println(st);
	}
}
