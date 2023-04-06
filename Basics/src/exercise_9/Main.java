package exercise_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Thread read = new Thread(new Read());
		Thread delete = new Thread(new Delete());
		
		read.start();
		
//		try { read.join(); }catch(Exception e) {}
		delete.start();
//		String choice,input;
//		Scanner in = new Scanner(System.in);
		
//while(true) {
//			
//			System.out.println("\nChoose option:\n"
//					+ "1. Visit\n"
//					+ "2. Read history\n"
//					+ "3. Delete history\n"
//					+ "\nUse exit command to quit.");
//			
//			choice = in.next();
//				
//			switch(choice) {
//			
//			case "1" :  System.out.println("Enter url; ");
//			 			input = in.next();
//						Browser.addHistory(input);
//						continue;
//			
//			case "2" :  
//			}
//			}	
	}

}
