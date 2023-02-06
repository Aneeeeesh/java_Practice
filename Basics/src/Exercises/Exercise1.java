package Exercises;
import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.google.com";
		Browser edge = new Browser();
		edge.setVisited(s);
		edge.getVisited();
		Browser brave = new Browser();
		brave.setVisited(s);
		brave.getVisited();
		Browser opera = new Browser();
		opera.setVisited(s);
		opera.getVisited();
	}

}

class Browser{
	Browser(){}
	Browser(ArrayList<String> st){}
	private String url;
	private static ArrayList<String> arrayOfurls = 
			new ArrayList<String>();
	
	void setVisited(String site) {
		url = site;
		arrayOfurls.add(url);
	}
	
	void getVisited() {
		System.out.println(arrayOfurls);
	}
}