package MultiThreading;

class MyThread7 implements Runnable{
	
	public void run() {
		System.out.println("In run");
		System.out.println("run : "+Thread.currentThread().getPriority());
	}
}
public class ThreadDemo5 {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(7);
		MyThread7 obj = new MyThread7();
		Thread thread = new Thread(obj);
		thread.start();
		
		System.out.println("main : "+Thread.currentThread().getPriority());
	}

}
