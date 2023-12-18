package Strings;

public class ReverseEachWord {
	public static void main(String[] args) {
		String name = "vishal mahajan";
		String[] arr = name.split("\\s");
		StringBuffer reversed = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			String temp = arr[i];
			StringBuffer sb = new StringBuffer(temp);
			sb.reverse();
			arr[i]=sb.toString();			
		}
		for(String s:arr) {
			reversed.append(s+" ");
		}
		System.out.println(reversed.toString());
	}
}
