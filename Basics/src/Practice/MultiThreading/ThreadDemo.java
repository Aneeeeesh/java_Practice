package Practice.MultiThreading;

public class ThreadDemo extends Thread{		//creating thread by extending Thread class
	
	@Override
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo();
		demo1.start();
		
		Demo2 demo2 = new Demo2();
		Thread t1 = new Thread(demo2);		//Using the constructor Thread(Runnable r)  
		t1.start();
		
		Thread t2 = new Thread("My third thread.");	//Using the constructor Thread(String s)  
		System.out.println(t2.getName());
	}

}

class Demo2 implements Runnable{			//creating thread by implementing Runnable

	@Override
	public void run() {
		System.out.println("Running next...");
	}
	
}
