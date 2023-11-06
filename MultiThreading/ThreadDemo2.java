package MultiThreading;

class MyThread2 extends Thread{
	
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("In run");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				System.out.println("Interrupted Exception caught");
			}
		}
	}
}

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		MyThread2 obj = new MyThread2();
		obj.start();
		
		for (int i = 0; i <=10; i++) {
			System.out.println("In main");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				System.out.println("Interrupted Exception caught");
			}
		}
	}
}
