package InnerClass;

class Outer2{
	
	void m1() {
		System.out.println("In Outer m1");
		
		class Inner2{
			
			void m1() {
				System.out.println("In Inner m1");
			}
		}
		Inner2 obj1 = new Inner2();
		obj1.m1();
	}
}

public class MethodLocalInnerClass {
	public static void main(String[] args) {
		Outer2 obj = new Outer2();
		obj.m1();
	}
}
