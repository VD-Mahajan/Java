package Strings;

public class MostRepeatedString {
	public static void main(String[] args) {
		String[] arr = new String[] {"geeks","for","geeks","for","geeks"};
		int temp=-1;
		int maxCount=0;
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				temp=i;
			}
		}
		System.out.println(maxCount);
		System.out.println(arr[temp]);
	}
}
