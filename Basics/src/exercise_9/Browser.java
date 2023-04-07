package exercise_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Browser {
	
	static List<String> history = new ArrayList<>(Arrays.asList("google.com", "insta.com", "linkedin.com"));
	
	void addHistory(String url) {
		history.add(url);
	}
	
	void readHistory() {
		for(int i = 0; i < history.size() ; i++) {
			System.out.println(history.get(i));
		}
	}
	
	void deleteHistory() {
		history.remove(history.size()-1);
	}
}

