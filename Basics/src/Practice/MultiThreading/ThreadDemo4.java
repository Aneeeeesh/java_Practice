package Practice.MultiThreading;

public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Hi t1 = new Hi();
		Hello t2 = new Hello();
		
		t1.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t2.start();
	}

}


class Hi extends Thread{
	
	public void run() {
		for(int i = 0; i < 6 ; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Hii");
//			System.out.println(System.currentTimeMillis());
			try { Thread.sleep(500); } catch(Exception e) {};
		}
	}
	
}

class Hello extends Thread{
	
	public void run() {
		for(int i = 0; i < 6 ; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Hello");
//			System.out.println(System.currentTimeMillis());
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}