package Pattern;

public class Pattern_Kedar {
	public static void main(String[] args) {
		
		int val=3;
		
		for (int i =1; i <=val; i++) {
			for (int j = i; j <val; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i*2-1; j++) {
				if(i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}


/*
      1  
    * 2 *
  * * 3 * *
   
*/