package exercise_7_Part1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String choice, site;
		BrowserHistory tab1 = new BrowserHistory();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nChoose option:\n"
					+ "1. Visit\n"
					+ "2. Sort\n"
					+ "3. Delete History\n"
					+ "4. Show History\n"
					+ "5. Search\n"
					+ "6. Show History Size\n"
					+ "7. Update History\n"
					+ "\nUse exit command to quit.");
			
			choice = in.next();
			
			switch(choice) {
			case "1" :  System.out.println("Enter url: ");
						site = in.next();
						tab1.visit(site);
						continue;
						
			case "2" :  tab1.sort();	
						continue;
						
			case "3" :  System.out.println("Delete using url or index? (u/i): ");		
						String input1 = in.next();
						if(input1.equals("u")) {
							System.out.println("Enter url to be deleted: ");
							String input2 = in.next();
							tab1.deleteHistory(input2);
						}
						else if(input1.equals("i")){
							System.out.println("Enter index of url to be deleted: ");
							int input3 = in.nextInt();
							tab1.deleteHistory(input3);
						}
						continue;
						
			case "4" :  tab1.fetchHistory();	
						continue;
						
			case "5" :  System.out.println("Enter extension: ");
						String urlExtension = in.next();
						tab1.search(urlExtension);
						continue;
						
			case "6" :  tab1.size();
						continue;
			
			case "7" :  System.out.println("Enter index: ");
						int input4 = in.nextInt();
						System.out.println("Enter new url: ");
						String newUrl = in.next();
						tab1.updateHistory(input4, newUrl);
						continue;
			
			case "exit" : break;
			
			default  :  System.out.println("Invalid Command.");
						continue;			
			}
			
			break;
			
		}

	}

}
