package Practice.MultiThreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		 Demo t1 = new Demo();    
		 Demo t2 = new Demo();    
		 Demo t3 = new Demo();   
		 
		 t1.start();  
		 
		 try{    
			 t1.join();    
		 }catch(Exception e){System.out.println(e);}    
		    
		 t2.start(); 
//		 try{    
//			 t2.join();    
//		 }catch(Exception e){System.out.println(e);}   
		 
		 t3.start();    
		 }    
	}


class Demo extends Thread{
	
	@Override
	public void run(){ 
		
		for(int i=1;i<=5;i++){    
			  try{   
				  
				  Thread.sleep(300);    
				  
			  }catch(Exception e){System.out.println(e);}    
		 
			  System.out.println(i);    
		 }    
	}    
}