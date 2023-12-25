package InnerClass;

/*
 * Types of inner classes
 * 1)Normal Inner class
 * 2)Method local inner class
 * 3)static inner class
 * 4)Anonymous inner class
 */

class Outer {
	
	class Inner{
		void m1() {
			System.out.println("In inner m1");
		}
	}
	void m1() {
		System.out.println("In outer m1");		
	}
}

public class NormalInnerClassDemo {
	
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.m1();
		Outer.Inner obj1 = obj.new Inner();
		obj1.m1();
	}
}
