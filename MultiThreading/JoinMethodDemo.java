package MultiThreading;

class MyThread9 extends Thread{
	static Thread main =null;
	
	public void run(){
		try {
			main.join();										
		}catch(InterruptedException ie) {
			System.out.println("InterruptedException caught");
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("In run");			
		}
	}
}



public class JoinMethodDemo {
	
	public static void main(String[] args) throws InterruptedException{
		
		MyThread9.main = Thread.currentThread();
		
		MyThread9 obj = new MyThread9();
		obj.start();
		
		obj.join(1000);
		for (int i = 0; i < 10; i++) {
			System.out.println("In main");
		}
		
	}

}
