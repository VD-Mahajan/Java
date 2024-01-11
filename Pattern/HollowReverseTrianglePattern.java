package Pattern;

public class HollowReverseTrianglePattern {
	static void printPattern(int x) {
		for(int i=x;i>=1;i--) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				if(j==i || i==x || j==1)
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
