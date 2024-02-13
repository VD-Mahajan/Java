package Interface;

interface I1{
	void show();
	
	default void display() {
		System.out.println("In display method");
	}
	
	static void myStatic(){
		System.out.println("I1");
	}
}

interface I2{
	void show();
	
	default void display() {
		System.out.println("In display method");
	}
	
	static void myStatic(){
		System.out.println("I2");
	}
	
}

public class Demo1 implements I1,I2{
	public void show() {
		System.out.println("In show");
	}
	@Override
	public void display() {
		I1.super.display();
	}
	public static void main(String[] args) {
		new Demo1().show();
		new Demo1().display();
		I1.myStatic();
		I2.myStatic();
	}
}
