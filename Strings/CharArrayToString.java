package Strings;

public class CharArrayToString {
	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e','f'};
		
		String str = new String(arr);
		System.out.println(str);
		
		String str2 = new String(arr,2,2);  // Understood ❤️
		System.out.println(str2);
	}
}
