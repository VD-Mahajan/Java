package Strings;

public class NumbersInStrings {
	public static void main(String[] args) {
		
		String num = "as5d912jkl316g";
		int count=0;

		for (int i = 0; i <num.length(); i++) {
			int x = num.charAt(i);
			if(Character.isDigit(x))
				count++;
		}
		System.out.println(count);
	}
}
