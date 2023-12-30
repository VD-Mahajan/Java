package Strings;

public class PalindromeString {
	
	public static void main(String[] args) {
		String str = "abaabahdyuhfsj";
		boolean flag=false;
		
		while(str.length()!=1) {
			for(int i=0;i<=str.length()/2;i++) {
				if(str.charAt(i)==str.charAt(str.length()-i-1) && i<=str.length()/2) {
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(str);
				break;
			}
			else
				str=str.substring(0,str.length()-1);				
		}
	}
}
