package Strings;

public class IpAddress {
	public static void main(String[] args) {
		String ipAdress = "192.-162.90.50";
		
		String[] ipArr = ipAdress.split("\\.");
		
		for (String num:ipArr) {
			int temp = Integer.parseInt(num);
			if(temp<0) {
				System.out.println("Invalid Ip Address");
				break;
			}		
		}
	}
}
