package Strings;

public class SearchStringInArray {
	public static void main(String[] args) {
		String[] strArray = new String[]{"Vishal","Kedar","Pankaj","Yash","Ajay","Tubam"};

		String str = "Yash";

		for(int i=0;i<strArray.length;i++){
			if(str.equals(strArray[i]))
				System.out.println(i);
		}

	}
}
