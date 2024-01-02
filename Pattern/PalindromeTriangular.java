package Pattern;

public class PalindromeTriangular {

	static void printPattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i-j+1);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(4);
	}
}
