package Strings;

class A{
	static int j = 19;
	static void show() {
		System.out.println("In static show A "+ j);
	}
}

class B extends A{
//	static int j = 20;
	static void show() {
		System.out.println("In static show B " + j);
		j++;
	}
	
}

public class CharArrayToString{
	public static void main(String[] args) {
//		A.show();
		B.show();
//		new A().show();
		new B().show();
	}
}
