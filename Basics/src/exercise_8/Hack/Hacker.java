package exercise_8.Hack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

public class Hacker {
	public static void main(String[] args) {
		
		try {
			
			Field webHistory = Browser.class.getDeclaredField("browserHistory");
			webHistory.setAccessible(true);
//			System.out.println(webHistory.get(null));
			List<String> history = (List<String>) webHistory.get(null);
//			System.out.println(history);
			
			
			
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("History.txt"));
			for (String url : history) {
				writer1.write(url + "\n");
			}
			writer1.close();
			System.out.println("\nWritten to file.");
			
			read();
			
			System.out.println("\nEnter how many urls to add: ");
			
			Scanner sc = new Scanner(System.in);
			int n ;
			n = sc.nextInt();
			
			while(n != 0) {
				
				System.out.println("\nEnter url to add: ");
				
				String site = sc.next();
				
				history.add(site);
				webHistory.set(null, history);
				
				BufferedWriter writer2 = new BufferedWriter(new FileWriter("History.txt", true));
				writer2.append(site + "\n");
				writer2.close(); 
				
				n--;
			}
			read();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	static void read() throws IOException  {
		BufferedReader reader1 = new BufferedReader(new FileReader("History.txt"));
		String line;
		while((line = reader1.readLine()) != null) {
			System.out.println(line);
		}
		reader1.close();
	}
}
