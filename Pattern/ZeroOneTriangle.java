package Pattern;

public class ZeroOneTriangle {
	static void printPattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");					
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(4);
	}
}
