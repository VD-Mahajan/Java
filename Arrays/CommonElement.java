package Arrays;

public class CommonElement {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {3,4,5,6,7};
		int[] arr3 = new int[] {5,6,7,8,9};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if(arr1[i]==arr2[j] && arr1[i]==arr3[k]) {
						System.out.println(arr1[i]);
					}
				}
			}
		}
		
		
	}
}
