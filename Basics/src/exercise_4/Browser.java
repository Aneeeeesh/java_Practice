package exercise_4;

import java.util.StringTokenizer;

public class Browser {
	
	public static String[] browserHistory = new String[10];
	
	public void setHistory(String site) {
		
		
		for (int i = 0; i < browserHistory.length; i++) {
			
			if(browserHistory[i] == null) 
				continue;
			
			StringTokenizer s = new StringTokenizer(browserHistory[i]," ## ");
			String url = s.nextToken();											// here url contains site name	
			
			if(url.equals(site)) {
				
				String freq = s.nextToken();									// here freq contains the number of visits 
				int frequency = Integer.parseInt(freq);
				frequency++;
				browserHistory[i] = url + " ## " + frequency;
				return;
			}
		}
		
		for (int i = 0; i < browserHistory.length; i++) {
			
			if(browserHistory[i] == null) {
				browserHistory[i] = site + " ## " + 1;
				break;
			}
		}
	
	}
}
