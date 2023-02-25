package exercise_3;

public class Browser {
	
	public static int numberofTabs;
	public static Integer tabs = 0;
	
	public Browser() {
		numberofTabs++;
		tabs++;
	}
	
	public static Integer toIntObject() {
		return numberofTabs;				//autoboxing
	}
	
	public static int toInt() {
		return tabs;						//unboxing
	}
}
