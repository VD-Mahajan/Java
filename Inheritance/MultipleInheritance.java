package Inheritance;

interface Teacher1{
	void work();
}
interface HeadOfDepartment1 extends Teacher1{
	void work();
}

class Principal1 implements HeadOfDepartment1{
	
	public void work() {
		System.out.println("Principal oversees the college");
	}

}

public class MultipleInheritance {
	public static void main(String[] args) {
		Principal1 c = new Principal1();
		c.work();
	}
}
