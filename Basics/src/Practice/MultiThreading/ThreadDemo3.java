package Practice.MultiThreading;

public class ThreadDemo3 extends Thread{

	@Override
	public void run() {
		System.out.println("Running..." + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo3 demo = new ThreadDemo3();
		
		demo.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		System.out.println(Thread.currentThread().getName() + " - This is executed.");

	}
}
