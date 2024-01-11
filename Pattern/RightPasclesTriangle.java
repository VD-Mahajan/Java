package Pattern;

public class RightPasclesTriangle {
	static private void printPattern(int x) {
		for (int i=1;i<=x/2+1;i++) {
			for (int j=1;j<=i;j++) {
				if(i%2==1 && j%2==1)
					System.out.print("* ");
				else if(i%2==0 && j%2==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=x/2;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				if(i%2==1 && j%2==1)
					System.out.print("* ");
				else if(i%2==0 && j%2==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(7);
	}
}
