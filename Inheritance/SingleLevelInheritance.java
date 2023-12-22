package Inheritance;

class Animal{
	
	void eat() {
		System.out.println("eating");
	}
	
	void sleep() {
		System.out.println("sleeping");
	}
	
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("Dog is barking");
	}
	
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.eat();
		animal.sleep();

		dog.bark();
	}
}
