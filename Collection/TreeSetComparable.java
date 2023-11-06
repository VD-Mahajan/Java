package Collection;
import java.util.*;

class MyClass implements Comparable{
	String s;
	MyClass(String s){
		this.s=s;
	}
	
	public int compareTo(Object obj) {
		return s.compareTo(((MyClass)obj).s);
	}
	
	public String toString() {
		return s;
	}
}

public class TreeSetComparable {
	
	public static void main(String[] args) {
		
		TreeSet<MyClass> ts = new TreeSet<>();
		ts.add(new MyClass("D"));
		ts.add(new MyClass("C"));
		ts.add(new MyClass("A"));
		ts.add(new MyClass("B"));
		
		System.out.println(ts);
		
	}
}
