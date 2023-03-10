package exercise_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String choice, site;
		int step, pos;
		BrowserHistory tab1 = new BrowserHistory("www.google.com");
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nCurrent Page: " + tab1.currentPage
					+ "\nChoose option:\n"
					+ "1. Visit\n"
					+ "2. Go back\n"
					+ "3. Go forward\n"
					+ "4. Get position\n"
//					+ BrowserHistory.history
					+ "\nUse exit command to quit.");
			
			choice = in.next();
			
			switch(choice) {
			case "1" :  System.out.println("Enter url: ");
						site = in.next();
						tab1.visit(site);
						continue;
						
			case "2" :  System.out.println("Enter number of steps to go back: ");		
						step = in.nextInt();
						System.out.println(tab1.back(step));
						continue;
						
			case "3" :  System.out.println("Enter number of steps to go forward: ");		
						step = in.nextInt();
						System.out.println(tab1.forward(step));
						continue;
						
			case "4" :  System.out.println("Enter position: ");		
						pos = in.nextInt();
						String out = tab1.get(pos);
						System.out.println(out);
						continue;
						
			case "exit" : break;
			
			default  :  System.out.println("Invalid Command.");
						continue;			
			}
			
			break;
			
		}

	}

}
