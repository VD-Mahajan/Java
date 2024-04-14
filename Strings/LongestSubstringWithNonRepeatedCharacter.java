package Strings;

public class LongestSubstringWithNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "java programing language";
		String longestSustring="";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subString = str.substring(i,j+1);
				String temp = "";
				boolean flag = true;
				
				for (int k = 0; k < subString.length(); k++) {
					if(temp.contains(subString.charAt(k)+"")) {
						flag = false;
						break;
					}else {
						temp+=subString.charAt(k);
					}
				}
			if(flag && temp.length()>longestSustring.length()) {
				longestSustring=temp;
			}
			}
		}
		System.out.println(longestSustring);
	}
}
