package Strings;

public class internMethod {
	public static void main(String[] args) {
		String str1 = "Vishal";
		String str2 = new String("Vishal").intern();
		System.out.println(str1==str2);
	}
}
