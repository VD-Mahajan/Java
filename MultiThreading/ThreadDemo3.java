package MultiThreading;

class MyThread3 extends Thread{
	
	public void run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread());
	}
	
	@Override
	public void start() {
		System.out.println("In start");
		run();
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		
		MyThread3 obj = new MyThread3();
		obj.start();
		System.out.println(Thread.currentThread());
	}
}
