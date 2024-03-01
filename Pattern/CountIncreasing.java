package Pattern;

public class CountIncreasing {
	public static void main(String[] args) {
		int count=0;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print(1+" ");
				}else if(i%2==1) {
					System.out.print((count)+" ");
				}
				else {
					System.out.print((count)+" ");
				}
			}
			count++;
			System.out.println();
		}
	}
}
