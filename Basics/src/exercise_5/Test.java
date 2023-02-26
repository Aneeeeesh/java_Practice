package exercise_5;

public class Test {

	public static void main(String[] args) {
		
		//instantiating outer class
		Browser browser1 = new Browser() ;
		
		//instantiating member inner class
		Browser.Bookmarks bookmarks = browser1.new Bookmarks();
		bookmarks.showMsg();
		
		
		//anonymous inner class
		Browser shortcuts = new Browser() {
			
			static String[] shortcuts = new String[5];
			
			void showMsg() {
				System.out.println("This is the Shortcuts class");
			}
		};
		shortcuts.showMsg();
//		browser1.showMsg();
		
		//calling static inner class method show()
		Browser.History.showMsg();

		}
	}
