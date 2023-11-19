package Sorting;

public class MergeSort {
	
	static int stackFrame=0;
	
	public static void divide(int[] arr, int start, int end) {
		stackFrame++;
		if(start<end) {
			int mid = start + (end-start)/2;
			System.out.println("Start : "+start+" Mid : "+mid+" End : "+end);
			divide(arr,start,mid);
			divide(arr,mid+1,end);
		}
	}
	
	public static void main(String[] args) {
		stackFrame++;
		int[] arr = new int[] {8,3,5,4,1,6,9,2};
		divide(arr, 0, arr.length-1);
		System.out.println(stackFrame);
	}
}
