package Polymorphism;
/*
 * Rules
 * 1)Return Type Must be same if it is primitive types such as int,float,void 
 * 2)Return Type can be different it is covariant type such as Object,String  (Parent child relation)
 * 3)Method signature can be same or different
 * 4)Exception  
 */


class Parent{
	int property() {
		return 100000;
	}
	void marry() {
		System.out.println("marry with abc");
	}
	Object name() {
		return "Parent";
	}
	int result() throws Exception{
		return 1;
	}
}

class Child extends Parent{
	void marry() {		
		System.out.println("marry with xyz");
	}
	String name() {
		return "Child";
	}
	int result() throws ArrayIndexOutOfBoundsException{
		return 0;
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		Child c = new Child();
					
		c.marry();
		
		System.out.println(c.name());
		
		System.out.println(c.result());
	}
}
