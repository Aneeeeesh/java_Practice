package exercise_7_Part2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
			
		String choice, site;
		BrowserHistory tab1 = new BrowserHistory();
		Scanner in = new Scanner(System.in);
		String input;
		
		while(true) {
			
			System.out.println("\nChoose option:\n"
					+ "1. Visit\n"
					+ "2. Fetch history\n"
					+ "3. Delete History\n"
					+ "4. Size\n"
					+ "5. Search\n"
					+ "6. Show History \n"
					+ "\nUse exit command to quit.");
			
			choice = in.next();
			
			switch(choice) {
			case "1" :  System.out.println("Enter url: ");
						site = in.next();
						tab1.visit(site);
						continue;
						
			case "2" :  System.out.println("Enter extension: ");
						input = in.next();
						tab1.fetchHistory(input);
						continue;
						
			case "3" :  System.out.println("Enter extension to be deleted: ");		
						input = in.next();
						tab1.deleteHistory(input);
						continue;
						
			case "4" :  System.out.println("Enter extension: ");
						input = in.next();
						tab1.size(input);	
						continue;
						
			case "5" :  System.out.println("Enter search item: ");
						input = in.next();
						tab1.search(input);
						continue;
						
			case "6" :  System.out.println("Linked Hash Map: " + BrowserHistory.linkedHashMap);
						System.out.println("Hash Map: " + BrowserHistory.hashMap);
						System.out.println("Tree Map: " + BrowserHistory.treeMap);
						continue;
			
			case "exit" : break;
			
			default  :  System.out.println("Invalid Command.");
						continue;			
			}
			
			break;
			
		}
	}

}
