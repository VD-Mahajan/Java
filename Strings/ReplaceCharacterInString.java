package Strings;

public class ReplaceCharacterInString {
	public static void main(String[] args) {
		String str = "Vishal Mahajan";
		char ch = 'a';
		str = str.replaceAll(Character.toString(ch),"");
		System.out.println(str);
	}
}
