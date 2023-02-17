package Exercises;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser a = new Browser();
		a.setVisited("www.google.com");
		a.setVisited("www");
		a.getVisited();
		String[] st = {"fb","insta","linked"};
		Browser b = new Browser(st);
		b.getVisited();
		Browser c = new Browser();
		c.setVisited("twitt");
		c.getVisited();
	}
}

class Browser {
	private static String[] visited_urls = new String[10];
	public int t = 0;
	Browser() {}
	Browser(String[] sites){
		for (int i = 0 ; i< visited_urls.length ; i++) {
			if (t==sites.length) break;
			if (visited_urls[i] == null) {
				visited_urls[i] = sites[t];
				t++;
			}
		}
		}
	void setVisited(String site){
		for (int i = 0; i < visited_urls.length;i++) {
			if (visited_urls[i] == null) {
				visited_urls[i] = site;
				break;
			}
		}
	}
	void getVisited() {
		System.out.println("History: ");
		for (int i =0; i<visited_urls.length ; i++) {
			if(visited_urls[i] != null) {
				System.out.println(visited_urls[i]);
			}
		}
	}
	
	void whoAmI() {
		System.out.println("I am a browser.");
	}
}
	