package exercise_5;

public class Browser {

	// member inner class
	class Bookmarks{
		static String[] bookmark = new String[5];
		void show() {
			System.out.println("This is the Bookmarks class");
		}
	}
	
	void show() {
		System.out.println("Hello");
	}
	
	//static inner class
	static class History{
		static String[] history = new String[5];
		static void show() {
			System.out.println("This is the History class");
		}
	}
}

