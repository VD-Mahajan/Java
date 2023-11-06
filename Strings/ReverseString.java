package Strings;

import java.io.*;

public class ReverseString {
	
	public static String reverse(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		String str1 = sb1.reverse().toString();
		return str1;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		System.out.println(reverse(str));
	}
}
