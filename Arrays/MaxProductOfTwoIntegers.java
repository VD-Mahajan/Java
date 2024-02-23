package Arrays;

public class MaxProductOfTwoIntegers {
	
	private static int int2;
	private static int int1;

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,9,4,5,6,7,8};
		int maxProduct = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]*arr[j]>maxProduct) {
					maxProduct=arr[i]*arr[j];
					int1 = arr[i];
					int2 = arr[j];
				}
			}
		}
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(maxProduct);
	}
}
