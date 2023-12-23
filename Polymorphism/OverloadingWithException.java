package Polymorphism;

class Calci{
	int add(int a,int b)throws ArrayIndexOutOfBoundsException {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class OverloadingWithException {
	public static void main(String[] args) {
		Calci calci = new Calci();
		System.out.println(calci.add(1,2));
		System.out.println(calci.add(1,2,3));
	}
}
