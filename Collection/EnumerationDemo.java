package Collection;
import java.util.*;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();				
		v.addElement("Vishal");
		v.addElement("Om");
		v.addElement("Prajwal");
		v.addElement("Vaibhav");
		
		Enumeration<String> cursor = v.elements();			//Enumeration is an Interface.
		System.out.println(cursor.getClass().getName());	//anonymous inner class of vector class.
		
		while(cursor.hasMoreElements()) {
			System.out.println(cursor.nextElement());
		}
	}
}
