package exercise_9;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Browser browser1 = new Browser();
		
		Read read = new Read(browser1);
		Delete del = new Delete(browser1);
		
//		read.start();
//		del.start();
		
		String choice,input;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nChoose option:\n"
					+ "1. Visit\n"
					+ "2. Use threads\n"
					+ "\nUse exit command to quit.");
			
			choice = in.next();
				
			switch(choice) {
			
			case "1" :  System.out.println("Enter url; ");
			 			input = in.next();
						browser1.addHistory(input);
						continue;
			
			case "2" :  read.start();
						del.start();
			
			}
		}	

	}
}

class Read extends Thread{
	
	Browser browser;
	public Read(Browser browser) {
		this.browser = browser;
	}
	
	@Override
	public void run() {
		browser.readHistory();
	}
	
	
}

class Delete extends Thread{
	
	
	Browser browser;
	public Delete(Browser browser) {
		this.browser = browser;
	}
	
	@Override
	public void run() {
		browser.deleteHistory();
	}
}
	
