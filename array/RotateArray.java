package array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		int k = 5;
		int t=k;
		
		int[] tempArr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(i>=t) {
				tempArr[i]=arr[i-t];
			}else {
				tempArr[i]=arr[arr.length-k];
				k--;
			}
		}
		System.out.println(Arrays.toString(tempArr));
		
	}
}
