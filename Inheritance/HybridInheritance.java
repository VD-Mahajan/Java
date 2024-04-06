package Inheritance;

interface A{
	void m1();
}

class B{
	void m1() {
		System.out.println("Im class B");
	}
}

class C extends B{
	void m1() {
		System.out.println("Im class C");
	}
}

class D extends C implements A{
	public void m1() {
		System.out.println("In class D");
	}
}


public class HybridInheritance {
	public static void main(String[] args) {
		D obj = new D();
		obj.m1();
	}
}
