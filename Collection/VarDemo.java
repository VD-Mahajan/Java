package Collection;

import java.util.ArrayList;

public class VarDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Kedar");
		al.add("Pankhaj");
		al.add("Shubham");
		al.add("Shashank");
		al.add("Ajay");
		
		for(var x:al) {							//var is a type inference feature. 
			System.out.println(x);				//we can declare variables without declaring their data type explicitly.
		}
		
	}
}
