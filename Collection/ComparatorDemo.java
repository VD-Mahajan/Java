package Collection;
import java.util.*;

class Employee{
	
	String name;
	float salary;
	
	Employee(String name,float salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "{"+name+":"+salary+"}";
	}
}

class SortByName implements Comparator<Employee>{
	
	public int compare(Employee obj1,Employee obj2) {
		return (obj1.name).compareTo(obj2.name);
	}
}

class SortBySalary implements Comparator<Employee>{
	
	public int compare(Employee obj1,Employee obj2) {
		return (int)(obj1.salary-obj2.salary);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Vishal",100000));
		al.add(new Employee("Om",400000));
		al.add(new Employee("Vaibhav",500000));
		al.add(new Employee("Prajwal",300000));
		
		Collections.sort(al,new SortByName());
		System.out.println(al);
		Collections.sort(al,new SortBySalary());
		System.out.println(al);
	}

}
