package Pattern;

public class DiamondPattern {
	
	static void printPattern(int x) {
		int num=1;
		for(int i=1;i<=x;i++) {
			for(int j=i-1;j<=x/2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=x/2;j>=i-1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printPattern(4);
	}
}
