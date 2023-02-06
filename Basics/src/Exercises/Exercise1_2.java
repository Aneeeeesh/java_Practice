package Exercises;

public class Exercise1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.google.com";
		Browser1 a = new Browser1();
		a.setVisited(s);
		a.getVisited();
		Browser1 b = new Browser1();
		b.setVisited(s);
		b.getVisited();
	}

}

class Browser1 {
	private String url;
	private int count = 0;
	private static String[] visited_urls =
			new String[10];
	Browser1() {}
	Browser1(String[] sites){
	}
	void setVisited(String site){
		url = site;
		visited_urls[count] = url;
		count++;
	}
	void getVisited() {
		for (int i =0; i<count ; i++) {
			System.out.println(visited_urls[i]);
		}
	}
}