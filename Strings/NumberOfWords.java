package Strings;

import java.util.HashMap;

public class NumberOfWords {
	public static void main(String[] args) {
		String str = "I am Vishal Vishal Mahajan";
		HashMap<String, Integer> hm = new HashMap<>();
		String[] strArray = str.split("\\s");
		
		for (int i = 0; i < strArray.length; i++) {
			if(!hm.containsKey(strArray[i])) {
				hm.put(strArray[i],1);
			}else {
				hm.put(strArray[i],hm.get(strArray[i])+1);				
			}
		}
		System.out.println(hm);
	}
}
