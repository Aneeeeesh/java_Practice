package Exercises;

import java.util.ArrayList;

public class Exercise1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.google.com";
		Browser1 edge = new Browser1();
		edge.setVisited(s);
		edge.getVisited();
		Browser1 brave = new Browser1();
		brave.setVisited(s);
		brave.getVisited();
		Browser1 opera = new Browser1();
		opera.setVisited(s);
		opera.getVisited();
	}

}

class Browser1{
	Browser1(){}
	Browser1(ArrayList<String> st){}
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
	
	
	
	
	
	
	
	
	
	
	
	