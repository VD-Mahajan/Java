package Strings;

import java.util.Arrays;

public class MaxNumber {

		public static void main(String[] args) {
			
			String str = "13254";
			
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			
			StringBuffer sb = new StringBuffer();
			
			for (int i = ch.length-1; i >= 0; i--) {
				sb.append(ch[i]);
			}
			
			System.out.println(sb);
		}
}
