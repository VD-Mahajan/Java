package Collection;
import java.util.*;

class CricPlayers{
	int jerNo;
	String name;
	CricPlayers(int jerNo,String name) {
		this.jerNo=jerNo;
		this.name=name;
	}
	public String toString() {
		return jerNo +":"+ name;
	}
}

public class HashSetUserObj {
	
	public static void main(String[] args) {
		
		LinkedHashSet<CricPlayers> lhs = new LinkedHashSet<>();
		lhs.add(new CricPlayers(7,"MS Dhoni"));
		lhs.add(new CricPlayers(18,"Virat"));
		lhs.add(new CricPlayers(45,"Rohit"));
		lhs.add(new CricPlayers(7,"MS Dhoni"));
		
		System.out.println(lhs);
	}
}
