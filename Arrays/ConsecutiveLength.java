package Arrays;
import java.util.*;

public class ConsecutiveLength {
	public static void main(String[] args) {
		int[] arr = new int[] {100,4,200,1,3,2,7,8,9,10,11,12};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int length=1,maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length-1 && arr[i]+1==arr[i+1]) {
				length++;
				System.out.print(length+"  ");
			}else {
				length=1;
			}
			if(length>maxLength) {
				maxLength=length;
			}
		}
		System.out.println("\n"+maxLength);
	}
}
				
				  
