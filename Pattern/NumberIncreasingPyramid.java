package Pattern;

public class NumberIncreasingPyramid {
	static void printPattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(4);
	}
}
