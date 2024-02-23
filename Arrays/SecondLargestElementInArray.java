package Arrays;

public class SecondLargestElementInArray {
	static private int largest;
	static private int secondLargest;
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,8};

		for(int i=0;i<arr.length;i++) {
			if(secondLargest<largest) {
				secondLargest=arr[i];
			}
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}
}
