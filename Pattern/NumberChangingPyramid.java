package Pattern;

public class NumberChangingPyramid {
	static void printPattern(int x) {
		int num=1;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(4);
	}
}
