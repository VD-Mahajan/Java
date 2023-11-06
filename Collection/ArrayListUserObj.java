package Collection;

import java.util.ArrayList;

class CricPlayer {
	
	int jerNo;
	String name;
	
	CricPlayer(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
	
}

public class ArrayListUserObj {
	
	public static void main(String[] args) {
		
		ArrayList<CricPlayer> al = new ArrayList<>();
		al.add(new CricPlayer(7, "Mahi"));
		al.add(new CricPlayer(18, "Chiku"));
		al.add(new CricPlayer(45, "Hitman"));
		
		System.out.println(al);
	}
}
