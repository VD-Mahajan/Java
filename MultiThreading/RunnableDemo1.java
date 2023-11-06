package MultiThreading;

class MyThread6 implements Runnable{
	
	public void run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}

public class RunnableDemo1 {
	
	public static void main(String[] args) {
		
		MyThread6 obj = new MyThread6();
		Thread thread = new Thread(obj);
		thread.start();
	}
}
