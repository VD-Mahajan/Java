package Collection;
import java.util.*;

class Movie{
	String name;
	float coll;
	float imdb;
	
	Movie(String name,float coll,float imdb){
		this.name=name;
		this.coll=coll;
		this.imdb=imdb;
	}
	
	public String toString() {
		return "{"+name+": "+coll+": "+imdb+"}";
	}
} 

class ByName implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2) {
		return (obj1.name).compareTo(obj2.name);
	}
}

class SortbyCollection implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2) {
		return (int)(obj1.coll-obj2.coll);
	}
}

class SortbyImdb implements Comparator<Movie>{
	public int compare(Movie obj1,Movie obj2) {
		return (int)(obj1.imdb-obj2.imdb);
	}
}

public class ComparatorDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie("Ved",50f,8.8f));
		al.add(new Movie("Sairat",70f,7.5f));
		al.add(new Movie("Inception",400f,8.9f));
		al.add(new Movie("Intersteller",500f,9.9f));
		
		Collections.sort(al,new ByName());
		System.out.println(al);
		Collections.sort(al,new SortbyCollection());
		System.out.println(al);
		Collections.sort(al,new SortbyImdb());
		System.out.println(al);
	}
}
