package Arrays;

public class ElementPairs {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,9,4,5,6,7,8};
		int target = 14;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}
}
