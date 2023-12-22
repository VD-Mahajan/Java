package Inheritance;

class Teacher{
	String name;
	public Teacher(String name) {
		this.name=name;
	}
	
	void teaching() {
		System.out.println(name+" is teaching");
	}
}
class HeadOfDepartment extends Teacher{
	
	public HeadOfDepartment(String name) {
		super(name);
	}
	
	void manage() {
		System.out.println(name+" is managing Department");
	}
}
class Principal extends Teacher{
	public Principal(String name) {
		super(name);
	}
	void oversee() {
		System.out.println(name+" is overseeing the college");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		
		HeadOfDepartment hod = new HeadOfDepartment("Vishal");
		hod.teaching();
		hod.manage();
		
		Principal principal = new Principal("Rohit");
		principal.teaching();
		principal.oversee();
		
	}
}
