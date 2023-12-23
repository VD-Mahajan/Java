package Strings;
import java.io.*;

public class ConcatenateStrings {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of string : ");
		int num=Integer.parseInt(br.readLine());
		String str="";
		
		System.out.println("Enter Strings : ");
		
		for (int i = 0; i < num; i++) {
//			str=str+br.readLine();
			str=str.concat(br.readLine());
		}
		
		System.out.println("Concatenated String :- "+str);
	}
}
