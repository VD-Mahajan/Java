package Strings;

public class NumbersInStrings {
	public static void main(String[] args) {
		
		String num = "as5d912jkl3l6";
		int[] intArr = {1,2,3,4,5,6,7,8,9,0};
		int count=0;

		for (int i = 0; i <num.length(); i++) {
			int x = num.charAt(i)/10;
			for (int j = 0; j < intArr.length; j++) {
				if(intArr[j]==x) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
