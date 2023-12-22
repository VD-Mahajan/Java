package Inheritance;

class Employee{
	
	void work() {
		System.out.println("Employee is working");
	}
	
}

class TeamLeader extends Employee{
	
	void manage() {
		System.out.println("Manager is managing team");
	}
	
}

class Manager extends TeamLeader{
	
	void manageDepartment() {
		System.out.println("Manager is managing their Department");
	}
	
}



public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.work();
		manager.manage();
		manager.manageDepartment();
	}
}
