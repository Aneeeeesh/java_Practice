package exercise_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Browser {
	
	static List<String> history = new ArrayList<>(Arrays.asList("google.com", "insta.com", "linkedin.com"));
	
	void addHistory(String url) {
		history.add(url);
		System.out.println("Added url.");
	}
	
	void readHistory() {
		for(int i = 0; i < history.size() ; i++) {
			System.out.println(history.get(i));
		}
	}
	
	void deleteHistory() {
		int last = history.size();
		System.out.println("Deleted " + history.get(last -1));
		history.remove(last-1);
	}
}

