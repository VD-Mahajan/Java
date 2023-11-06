package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread15 implements Runnable{
	int num;
	public MyThread15(int num) {
		this.num=num;
	}
	
	public void run() {
		System.out.println(Thread.currentThread() +" Start Task "+ num);
		dailyTask();
		System.out.println(Thread.currentThread() +" End Task "+ num);
	}
	
	void dailyTask() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			
		}
	}
}

public class ThreadPoolDemo1 {
	
	public static void main(String[] args) {
		
		//ExecutorService ser = Executors.newFixedThreadPool(2);
		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		
		for(int i=1;i<=5;i++) {
			MyThread15 obj = new MyThread15(i);
			tpe.execute(obj);
		}
		tpe.shutdown();
	}

}
