package Pattern;

public class SqureFillPattern {
	static void printPattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) 
				System.out.print("* ");	
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(6);
	}
}
