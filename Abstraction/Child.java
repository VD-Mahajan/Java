package Abstraction;


abstract class Parent1{
	 int x = 10;
	
}

public class Child extends Parent1{

	int x = 20;
	
	Child(){
		x=super.x;
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.x);
	}
}
