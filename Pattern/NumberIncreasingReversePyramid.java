package Pattern;

public class NumberIncreasingReversePyramid {
	static void printPattern(int x) {
		for(int i=0;i<=x;i++) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(4);
	}
}
