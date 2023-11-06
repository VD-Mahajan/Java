package MultiThreading;

class MyThread12 extends Thread{
	
	public MyThread12(ThreadGroup tg,String str) {
		super(tg,str);
	}
	
	public void run() {
		System.out.println(getName());
		System.out.println(Thread.currentThread());
	}
}

public class ThreadGroupDemo2 {

	public static void main(String[] args) {
		ThreadGroup tgrp = new ThreadGroup("India");
		
		MyThread12 obj1 = new MyThread12(tgrp,"Maharashtra");
		MyThread12 obj2 = new MyThread12(tgrp,"Rajasthan");
		MyThread12 obj3 = new MyThread12(tgrp,"Gujrat");

		obj1.start();
		obj2.start();
		obj3.start();
	}

}
