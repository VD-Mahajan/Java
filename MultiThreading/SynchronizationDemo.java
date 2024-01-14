package MultiThreading;

class Demo extends Thread{
	static int value=1;
	
	private void painting() {
		for(int i=1;i<=15;i++) {
			System.out.println(value++);					
		}
	}
	
	public void run() {
		painting();
	}
}


public class SynchronizationDemo {
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		obj1.start();
		obj2.start();
		
	}
}
