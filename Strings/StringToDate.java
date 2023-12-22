package Strings;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringToDate {
	public static void main(String[] args) throws ParseException{
		
		String date = "14/02/2002";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(date+"    "+date1);
	}
}
