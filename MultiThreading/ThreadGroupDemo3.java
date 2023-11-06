package MultiThreading;

class MyThread13 extends Thread{
	
	public MyThread13(ThreadGroup tg,String str) {
		super(tg,str);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println(Thread.currentThread());
	}
}

public class ThreadGroupDemo3 {

	public static void main(String[] args) throws InterruptedException{
		
		ThreadGroup pgp = new ThreadGroup("India");
		ThreadGroup cgp1 = new ThreadGroup(pgp,"Maharashtra");
		ThreadGroup cgp2 = new ThreadGroup(pgp,"UttarPradesh");
		
		MyThread13 t1 = new MyThread13(cgp1,"Dharashiv");
		MyThread13 t2 = new MyThread13(cgp1,"Latur");
		MyThread13 t3 = new MyThread13(cgp1,"Beed");

		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(1000);
		
		MyThread13 t4 = new MyThread13(cgp2,"Varanasi");
		MyThread13 t5 = new MyThread13(cgp2,"Rampur");
		MyThread13 t6 = new MyThread13(cgp2,"Mathura");
		
		t4.start();
		t5.start();
		t6.start();
		Thread.sleep(1000);
		
		Thread.interrupted();
		System.out.println(pgp.activeCount());
		System.out.println(pgp.activeGroupCount());
		
	}

}
