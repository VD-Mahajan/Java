package MultiThreading;

class MyThread1 extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
	}
}

public class ThreadDemo1 {
	
	public static void main(String[] args) {
		
		MyThread1 obj = new MyThread1();
		obj.start();
	}
}
