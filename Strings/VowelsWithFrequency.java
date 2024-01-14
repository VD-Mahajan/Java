package Strings;

import java.util.*;

public class VowelsWithFrequency {
	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();	
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');
		HashMap<Character,Integer> hm = new HashMap<>();
		String str = "Vishal Mahajan";
		char[] chArr = str.toCharArray();
		for(char ch: chArr) {
			if(!hm.containsKey(ch) && ch!=' ' && al.contains(ch)) {
				hm.put(ch,1);
			}else if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}
		}
		
		for(Map.Entry<Character,Integer> item : hm.entrySet()) {
			System.out.println(item.getKey()+"  "+item.getValue());
		}
	}
}
