package Arrays;

public class MaxProductOfTwoIntegers {
	
	private static int int2;
	private static int int1;

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		int maxProduct = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(i*j>maxProduct) {
					maxProduct=i*j;
					int1 = i;
					int2 = j;
				}
			}
		}
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(maxProduct);
	}
}
