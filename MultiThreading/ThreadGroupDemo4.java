package MultiThreading;

class MyThread14 implements Runnable{
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println(Thread.currentThread());
	}
}

public class ThreadGroupDemo4 {
	
	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("MH");
		
		MyThread14 mt1 = new MyThread14();
		MyThread14 mt2 = new MyThread14();
		
		Thread t1 = new Thread(tg,mt1,"Dharashiv");
		Thread t2 = new Thread(tg,mt1,"Latur");
		t1.start();
		t2.start();
		
	}
}
