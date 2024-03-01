package Strings;

public class MinimumWindowString {

	public static void main(String[] args) {
		String str = "ABJJDJKCMDJANDFBMACBA";
		String check = "ABC";
		int minLength = Integer.MAX_VALUE;
		String finalAnswer = "";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String temp = str.substring(i, j+1);
				boolean flag=false;
				
				for(int k=0;k<check.length();k++) {
					if(temp.contains(check.charAt(k)+"")) {
						flag=true;
					}else {
						flag=false;
						break;
					}
				}
				if(flag==true && temp.length()<=minLength) {
					finalAnswer=temp;
					minLength=temp.length();
				}
			}
		}
		System.out.println(finalAnswer);
	}

}

