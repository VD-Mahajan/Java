package Strings;

public class StringPalindromeUsingRecursion {

	static boolean isPalindrome(String str , int start,int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}else {
			return isPalindrome(str, start+1, end-1);
		}
//		return true;
	}

	public static void main(String[] args) {
		String str = "mkm";
		System.out.println(isPalindrome(str, 0, str.length()-1));
	}
}
