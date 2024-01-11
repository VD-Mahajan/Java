package Pattern;

public class HollowDiamondPyramid {
	static private void printPattern(int x) {
		for (int i = 1; i <=x/2+1; i++) {
			for (int j = 1; j <=(x/2)+1-i; j++) {
				System.out.print("  ");
			}	
			for (int j =1; j<=i*2-1; j++) {
				if(j==1 || j==i*2-1)
					System.out.print("* ");	
				else
					System.out.print("  ");		
			}
			System.out.println();
		}
		for (int i = x/2; i >=1; i--) {
			for (int j = 1; j <=(x/2)+1-i; j++) {
				System.out.print("  ");
			}	
			for (int j =1; j<=i*2-1; j++) {
				if(j==1 || j==i*2-1)
					System.out.print("* ");	
				else
					System.out.print("  ");	
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(10);
	}
}
