package InnerClass;

class Car{
	String model;
	Engine carEngine;
	
	Car(String name){
		this.model=name;
		this.carEngine=new Engine();
	}
	
	class Engine{
		boolean isStarted;
		
		void start() {
			isStarted=true;
			System.out.println("Engine is started, vroom!");
		}
		
		boolean isStarted() {
			return isStarted;					
		}
	}
	
	void drive() {
		if(carEngine.isStarted())
			System.out.println("Driving "+model+" car");
		else
			System.out.println("Cannot drive without starting the engine");
	}
}


public class RealTimeExampleOfInnerClass {

	public static void main(String[] args) {
		Car car = new Car("Honda");
		car.carEngine.start();
		car.drive();
	}
}
