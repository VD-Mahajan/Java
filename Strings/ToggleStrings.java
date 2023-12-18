package Strings;

public class ToggleStrings {
	public static void main(String[] args) {
		String str1 = "My name is Vishal";
		String[] arr = str1.split("\\s");
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			String temp = arr[i].toUpperCase();
			String str2 = temp.substring(0,1).toLowerCase();
			String str3 = temp.substring(1,temp.length());
			temp = str2+str3;
			sb.append(temp+" ");
		}
		System.out.println(sb.toString());
	}
}
		