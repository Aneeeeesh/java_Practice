package exercise_6;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BrowserHistory {
	
	private static ArrayList<String> history = new ArrayList<String>();
	String currentPage;
	int currentPageIndex;
	
	public BrowserHistory(String homepage) {
		currentPage = homepage;
		history.add(currentPage);
	}
	
	void visit(String url) {
		
		try {
			
			StringTokenizer tokenizer = new StringTokenizer(url, ".");
			
			if(tokenizer.countTokens()<=1) throw new InvalidURLException("Invalid url extension");
			
			String domain = tokenizer.nextToken();
			while(tokenizer.hasMoreTokens())
				domain = tokenizer.nextToken();
			
			if(domain.equals("com") || domain.equals("org") || domain.equals("in")){
				history.add(url);
				System.out.println("Url added to history.");
				currentPage = url;
			}
			
			else throw new InvalidURLException("Invalid url extension");
		}
		catch(InvalidURLException e) {
			System.out.println(e);
		}
		
	}
	
	String back(int steps) {
		try {
			currentPageIndex = history.indexOf(currentPage);
			if(steps < currentPageIndex+1) {
				currentPage = history.get(currentPageIndex - steps);
				return currentPage;
			}
			
			else throw new NoHistoryFoundException("No History Found");
				
		}
		catch(NoHistoryFoundException e) {
			currentPage = history.get(0);
			return e.toString();
		}

	}
	
	String forward(int steps) {
		try {
			currentPageIndex = history.indexOf(currentPage);
			if(steps <= history.size()-(currentPageIndex+1)) {
				currentPage = history.get(currentPageIndex + steps);
				return currentPage;
			}
			
			else throw new NoHistoryFoundException("No History Found");
				
		}
		catch(NoHistoryFoundException e) {
			currentPage = history.get(history.size()-1);
			return e.toString();
		}
		
	}
	
	
	String get(int position) {
		
		try {
			if(position < 0) {
				throw new InvalidPositionException("Provide only positive values");
			}
			else return history.get(position);
		}
		
		catch(InvalidPositionException e) {
			return e.toString();
		}
		
		catch(IndexOutOfBoundsException e) {
			return e + " Invalid position";
		}
	}
}

