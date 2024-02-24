package Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,4,5,7,6,9,10};
		
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		
		System.out.println(((arr.length+1)*((arr.length+2))/2)-sum);
		
	}
}
