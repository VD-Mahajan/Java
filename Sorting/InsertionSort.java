package Sorting;

public class InsertionSort {
		
	public static void insertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j= i-1;
			
			while(j>=0 && arr[j]>arr[j+1]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
				
		}
	}
	
	public static void main(String[] args) {
		int[] arr ={4,26,73,94,4,6,75,2,3,49,11};
		
		InsertionSort.insertionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
