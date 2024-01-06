package Exception;

class Demo extends Exception{
	public Demo() {
		super("Demo Exception");
	}
}

class P{
	void m1() throws Demo{
		throw new Demo();		
	}
}

class C extends P{
	void m1() {
		System.out.println("In child m1");
	}
}

public class ThrowException {
	public static void main(String[] args) throws Demo{
		P c = new C();
		c.m1();
	}
}
