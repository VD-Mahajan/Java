package MultiThreading;

class MyThread8 extends Thread{
	
	public void run() {
		System.out.println("In run");
	}
}



public class SleepMethodDemo {

	public static void main(String[] args) throws InterruptedException{
		
		MyThread8 obj = new MyThread8();
		obj.start();
		
		Thread.sleep(1000);
		
		Thread.currentThread().setName("Vishal");
		System.out.println(Thread.currentThread().getName());
		
	}
}
