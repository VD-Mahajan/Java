package Strings;

import java.util.Scanner;

public class EqualStrings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "Vishal";
		System.out.println("Enter string : ");
		String str2 = sc.nextLine();

		if(str1.equals(str2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}
