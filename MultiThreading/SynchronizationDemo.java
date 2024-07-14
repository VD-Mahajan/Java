package MultiThreading;

class Demo extends Thread{
//	static int value=1;
	int val;
	public Demo(int val) {
		this.val=val;
	}
	
	private void painting() {
		synchronized (this) {
			for(int i=1;i<=15;i++) {
				System.out.println(val);					
			}
			this.notify();
		}
	}
	
	public void run() {
		painting();
	}
}


public class SynchronizationDemo {
	public static void main(String[] args) {
		Demo obj1 = new Demo(1);
		Demo obj2 = new Demo(2);
		obj1.start();
		obj2.start();
		
	}
}
