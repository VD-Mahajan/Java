package Abstraction;

abstract class Parent{
	String fatherName = "Datta";
	String motherName = "Kavita";
	
	Parent(String fatherName,String motherName){
		System.out.println("In Parent");
		this.fatherName=fatherName;
		this.motherName=motherName;
	}
}


public class Demo extends Parent{
	
	Demo(String childName,String fatherName,String motherName){
		super(fatherName,motherName);
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo("Vishal","Datta","Kavita");
		System.out.println(obj.fatherName);
		System.out.println(obj.motherName);
	}
}
