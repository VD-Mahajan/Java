package Pattern;

public class RhombusPattern {
	static void printPattern(int x) {
		for (int i=1; i<=x; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(5);
	}
}
