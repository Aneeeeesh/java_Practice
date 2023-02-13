package Exercises;
import java.util.*;


public class Exercise1_2 {
	public static void main(String[] args) {
	Explorer tab1 = new Explorer();
	tab1.addUrl("www.google.com");
	Explorer tab2 = new Explorer();
	tab2.addUrl("www.yahoo.com");
	tab2.removeUrl("www.bing.com");
	tab2.getHistory();
	}
}


interface BrowserInterface{
	public void addUrl(String site);
	public void removeUrl(String rem);
	public void clearHistory();
	public void getHistory();
}

class Explorer implements BrowserInterface{
	private static ArrayList<String> urls = new ArrayList<String>();

	@Override
	public void addUrl(String site) {
		// TODO Auto-generated method stub
		urls.add(site);
	}

	@Override
	public void removeUrl(String rem) {
		// TODO Auto-generated method stub
		if (urls.contains(rem)) 
			urls.remove(rem); 
		else System.out.println(rem + " was not found in history");
	}

	@Override
	public void clearHistory() {
		// TODO Auto-generated method stub
		urls.clear();
	}

	@Override
	public void getHistory() {
		// TODO Auto-generated method stub
		System.out.println(urls);
	}
	
}


