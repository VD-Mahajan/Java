package Polymorphism;

/*
 * Rules
 * 1) Method signature
 * 2) Return Type (we can change return type, we cannot achieve overloading just by changing return type)
 * eg. void add(){}   &&  int add(){return 0}  -not valid 
 * 	   void add(int a,int b){}   &&  int add(int a,int b,int c){return 0}  -valid
 * 3) Exception (Don't have any effect of exception on overloading methods)
 */


class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int substraction(int a,int b) {
		int x =10;
		return a-b;
	}
	double substraction(double a,double b) {
		return a-b;
	}
	double difference(double a,double b) {
		return Math.abs(a-b);
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calci = new Calculator();
		System.out.println(calci.add(1,2));
		System.out.println(calci.add(1,2,3));
		
		System.out.println(calci.substraction(2,3));
		System.out.println(calci.substraction(4.5, 6.3));
		
		System.out.println(calci.difference(4.5, 8.99));
		
	}
}
