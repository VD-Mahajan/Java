package Strings;

public class RotationStrings {
	
	static boolean rotateString(String str1,String str2) {
		boolean flag=false;
		if(str1.length()!=str2.length())
			return false;
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();) {
				if(str1.charAt(i)==str2.charAt(j)) {
					i=i%str1.length();
					j=j%str2.length();
					flag=true;
				}
				j++;
			}			
		}
		if(flag==true)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "deabc";
		
		System.out.println(rotateString(str1, str2));
	}
}
