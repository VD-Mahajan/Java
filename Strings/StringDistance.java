package Strings;

public class StringDistance {
	public static void main(String[] args) {
		String s1 = "Vishal";
		String s2 = "Kedar";
		
		String[] arr = new String[] {"Kedar","Kapse","Shiradhon","Sumbulung","Vishal","Mahajan"};
		int count=0;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i].equals(s1) || arr[i].equals(s2)) && count==0) {
				flag =true;
				i++;
			}
			if(flag==true)
				count++;
			
			if((arr[i].equals(s2) || arr[i].equals(s1)) && flag == true) {
				System.out.println("Distance is "+count);
			}
		}
	}
}
