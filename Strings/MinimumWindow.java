package Strings;

public class MinimumWindow {

	public static void main(String[] args) {
		String str = "ABJJDJKCMDJANDFBMAC";
		String ans = "";
		int minLength = Integer.MAX_VALUE;
		String finalAnswer = "";
		
		char ch1 = 'A';
		char ch2 = 'B';
		char ch3 = 'C';
		
		
		for (int i = 0; i < str.length(); i++) {
			ans="";
			boolean isContainCh1=false;
			boolean isContainCh2=false;
			boolean isContainCh3=false;
			boolean charFound=false;
			int length=0;
			for (int j = i; j < str.length(); j++) {
				if(str.charAt(j)==ch1 && isContainCh1==false) {
					ans=ans.concat(str.charAt(j)+"");
					isContainCh1=true;
					charFound=true;
				}
				if(str.charAt(j)==ch2 && isContainCh2==false) {
					ans=ans.concat(str.charAt(j)+"");
					isContainCh2=true;
					charFound=true;
				}
				if(str.charAt(j)==ch3 && isContainCh3==false) {
					ans=ans.concat(str.charAt(j)+"");
					isContainCh3=true;
					charFound=true;
				}
				if(charFound) {
					length++;
				}
			}
			if(length<minLength && length>=3) {
				minLength=length;
				finalAnswer = ans;				
			}
		}
		System.out.println(finalAnswer);

	}

}
