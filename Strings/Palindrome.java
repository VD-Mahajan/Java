package Strings;
import java.io.*;


public class Palindrome {
	
	public static boolean isPalindrome(String str1) {
		boolean ans = false;
		StringBuffer sb1 = new StringBuffer(str1);
		String str2 = (sb1.reverse()).toString();
		
		if(str1.equals(str2))
			ans=true;
		
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String : ");
		String str = br.readLine();
		
		System.out.println(isPalindrome(str));
		
	}
}
