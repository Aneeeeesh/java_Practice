package exercise_3;

public class Browser {
	private static String[] visited_urls = new String[10];
	public static Browser[] allBrowsers = new Browser[5];
	public int t = 0;
	Browser() {
		for(int i = 0; i<allBrowsers.length; i++) {
			if (allBrowsers[i] == null){
				allBrowsers[i] = this;
				break;
			}
		}
	}
	Browser(String[] sites){
		this();
		for (int i = 0 ; i< visited_urls.length ; i++) {
			if (t==sites.length) break;
			if (visited_urls[i] == null) {
				visited_urls[i] = sites[t];
				t++;
			}
		}
		}
	public void setVisited(String site){
		for (int i = 0; i < visited_urls.length;i++) {
			if (visited_urls[i] == null) {
				visited_urls[i] = site;
				break;
			}
		}
	}
	public void getVisited() {
		System.out.println("History: ");
		for (int i =0; i<visited_urls.length ; i++) {
			if(visited_urls[i] != null) {
				System.out.println(visited_urls[i]);
			}
		}
	}
	
	public void whoAmI() {
		System.out.println("I am a browser.");
	}
	
}