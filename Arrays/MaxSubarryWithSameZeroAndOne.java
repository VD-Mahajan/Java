package Arrays;

public class MaxSubarryWithSameZeroAndOne {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,5,1,1,0};
		int maxLength = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int length=0;
				int zeroCount=0;
				int oneCount=0;
				
				for (int k = i; k <=j; k++) {
					length++;
					if(arr[k]==0) {
						zeroCount++;
					}else if(arr[k]==1) {
						oneCount++;
					}
				}
				if(zeroCount==oneCount && zeroCount!=0 && maxLength<zeroCount+oneCount) {
					maxLength=length;
				}
			}
		}
		System.out.println(maxLength);

	}
}
