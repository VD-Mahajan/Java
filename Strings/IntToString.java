package Strings;

public class IntToString {
	
	static void printString(int num) {
		if(num==0)
			return;
		
		printString(num/10);
		
		int ans = num%10;
		switch(ans) {
		case 0:
			System.out.println("Zero");	
			break;
		case 1:
			System.out.println("One");	
			break;
		case 2:
			System.out.println("Two");		
			break;
		case 3:
			System.out.println("Three");		
			break;
		case 4:
			System.out.println("Four");		
			break;
		case 5:
			System.out.println("Five");		
			break;
		case 6:
			System.out.println("Six");		
			break;
		case 7:
			System.out.println("Seven");		
			break;
		case 8:
			System.out.println("Eight");		
			break;
		case 9:
			System.out.println("Nine");		
			break;
		}
	}
	
	public static void main(String[] args) {
		
		printString(12340);
		System.out.println("Hello");
		
	}
}
