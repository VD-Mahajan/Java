package MultiThreading;

class MyThread11 extends Thread{
	public MyThread11(String str) {
		super(str);
	}
	public void run() {
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		MyThread11 obj = new MyThread11("vishal");
		obj.start();
		
	}
}
