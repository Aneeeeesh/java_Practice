package exercise_1;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser chrome = new Browser();
		chrome.setVisited("google.com");
		chrome.setVisited("zoho.com");
		chrome.getVisited();
		String[] st = {"fb.com","insta.com","linkedin.com"};
		Browser opera = new Browser(st);
		opera.getVisited();
		Browser brave = new Browser();
		brave.setVisited("twitter.in");
		brave.getVisited();
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
	
}
	