package MultiThreading;

class MyThread4 extends Thread{
	
	public void run() {
		System.out.println("In MyThread4 run");
	}
}
class MyThread5 extends Thread{
	
	public void run() {
		System.out.println("In MyThread5 run");
		MyThread4 obj = new MyThread4();
		obj.run();
	}
}

public class ThreadDemo4 {
	
	public static void main(String[] args) {
		
		MyThread5 obj = new MyThread5();
		obj.start();
	}
}









