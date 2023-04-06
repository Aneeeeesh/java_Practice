package exercise_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Browser {
	
	static List<String> history = new ArrayList<>(Arrays.asList("google.com", "insta.com", "linkedin.com"));
	
	static void addHistory(String url) {
		history.add(url);
	}
	
}

class Read extends Browser implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(history);
	}
}

class Delete extends Browser implements Runnable{
	
	@Override
	public void run() {
		history.remove(history.size()-1);
	}
}
