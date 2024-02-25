package Arrays;
import java.util.*;

public class ProductArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int mul=1;
		for (int i = 0; i < arr.length; i++) {
			mul=mul*arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=mul/arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
