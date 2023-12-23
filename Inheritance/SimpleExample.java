package Inheritance;

class Parent{
	int x =10;
	void displayy() {
		System.out.println("x value is :"+x);
	}
}

public class SimpleExample extends Parent {
	int x=30;
	void display() {
		System.out.println("x value is :"+x);
	}

	public static void main(String[] args) {
		SimpleExample obj = new SimpleExample();
		obj.display();
		obj.displayy();
	}
}
