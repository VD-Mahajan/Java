package Inheritance;

class MyClass{
	static void staticMethod() {
		System.out.println("In Parent static method");
	}
}

class Child extends MyClass{
//	@Override
	static void staticMethod() {
		System.out.println("In Child static method");		
	}
	
}

public class MethodHiding {
	public static void main(String[] args) {
		Child.staticMethod();
	}
}
