package Arrays;

public class MajorityElement {
	static int num;
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,3,3,3,4,6,7,3,3};
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count>=arr.length/2) {
				num=arr[i];
			}
		}
		System.out.println(num);
	}
}
