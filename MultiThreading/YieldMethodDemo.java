package MultiThreading;

class MyThread10 extends Thread{
	static Thread main =null;
	
	public void run(){
		
		for (int i = 0; i < 20; i++) {
			Thread.yield();
			System.out.println("In run");			
		}
	}
}

public class YieldMethodDemo {

		public static void main(String[] args)throws InterruptedException {
			
			MyThread10 obj = new MyThread10();
			obj.start();
			
			for (int i = 0; i <20; i++) {
				System.out.println("In main");
			}
		}
}
