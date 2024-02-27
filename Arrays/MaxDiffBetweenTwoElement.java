package Arrays;

public class MaxDiffBetweenTwoElement {
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,5,6,2,3,9,3,5,0};
		int maxDifference = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[j]-arr[i]>maxDifference) {
					maxDifference=arr[j]-arr[i];
				}
			}
		}
		
		System.out.println(maxDifference);
		
	}
}
