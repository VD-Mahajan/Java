package Strings;

public class NextPalindrome {
	
	public static void main(String[] args) {
		int num = 14;
		
		for(int i=num+1;i<=Integer.MAX_VALUE;i++){
			int temp=i;
			int rev =0;
			while(temp!=0) {
				int rem = temp%10;
				rev = rev*10+rem;
				temp/=10;
			}
			if(i==rev) {
				System.out.println(i);
				break;
			}	
		}
	}
}
