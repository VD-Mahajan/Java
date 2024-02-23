package Arrays;
import java.util.Arrays;

public class PivotIndexInAnArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,4,3,2,1};
		int[] preArr = new int[arr.length];
		int[] sufArr = new int[arr.length];

		preArr[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			preArr[i] = arr[i] + preArr[i-1]; 
		}
		
		sufArr[arr.length-1]=arr[arr.length-1];
		for (int i = arr.length-1-1; i >=0 ; i--) {
			sufArr[i] = arr[i] + sufArr[i+1]; 
		}
		
		for (int i = 0; i < sufArr.length; i++) {
			if(sufArr[i]==preArr[i]) {
				System.out.println(i);
			}
		}
		
	}
}
