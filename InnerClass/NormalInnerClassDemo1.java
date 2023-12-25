package InnerClass;

class Outer1{
	
	int x = 10;
	static int y = 30;
	
	class Inner1{
		static int z = 11;     //static initialization not allowed in jdk 8 and earlier versions
		static void m1() {
			System.out.println("In Inner m1");
		}
	}
	
	void m2() {
		System.out.println("In Outer m2");
	}
}

public class NormalInnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 obj = new Outer1();
		Outer1.Inner1 obj1 = obj.new Inner1();
		System.out.println(obj1.z);
	}
}
