package Collection;
import java.util.*;

class Movies implements Comparable{
	String name;
	float collection;
	
	Movies(String name,float collection){
		this.name=name;
		this.collection=collection;
	}
	
	public int compareTo(Object obj) {
		return name.compareTo(((Movies)obj).name);
	}
	
	public String toString() {
		return name+": "+collection;
	}
} 

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Movies> ts = new TreeSet<>();
		ts.add(new Movies("Gadar",50f));
		ts.add(new Movies("OMG2",70f));
		ts.add(new Movies("Jailer",25f));
		ts.add(new Movies("OMG2",50f));
		
		System.out.println(ts);
	}
}
