package Pattern;

public class SquareHolloPattern {

	static void printPattern(int x) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				if(i==0 || i==x-1)
					System.out.print("* ");
				else if(j==0 || j==x-1)
					System.out.print("* ");
				else
					System.out.print("  ");
									
			}			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(5);
	}
}
