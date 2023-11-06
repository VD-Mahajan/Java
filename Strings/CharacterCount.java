package Strings;

public class CharacterCount {
	public static void main(String[] args) {
		int count=0;
		String name = "Vishal Mahajan";
		
		for(int i = 0; i<name.length();i++) {
			if(name.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}
}
