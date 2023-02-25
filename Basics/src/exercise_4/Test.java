package exercise_4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		
		browser.setHistory("www.twitter.com");
		browser.setHistory("www.fb.com");
		browser.setHistory("www.twitter.com");
		browser.setHistory("www.google.com");
		browser.setHistory("www.fb.com");
		browser.setHistory("www.fb.com");
		
		for(int i = 0 ; i< Browser.browserHistory.length;i++) {
			
			if(Browser.browserHistory[i] != null)
				System.out.println(Browser.browserHistory[i]);
		}
	}

}
