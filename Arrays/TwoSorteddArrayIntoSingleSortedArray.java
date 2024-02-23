package Arrays;

import java.util.Arrays;

public class TwoSorteddArrayIntoSingleSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		int[] ansArr = new int[arr2.length+arr1.length];
		int s1=0,s2=0;
		for (int i = 0; i < arr2.length+arr1.length; i++) {
			if(s1<arr1.length && s2<arr2.length && arr1[s1]<=arr2[s2]) {
				ansArr[i]=arr1[s1++];
			}else{
				ansArr[i]=arr2[s2++];
			}
		}
		System.out.println(Arrays.toString(ansArr));
	}
}
