package exercise_2;

import java.util.ArrayList;

public class OtherBrowsers {
	public static void main(String[] args) {
		int countChrome = 0;
		String[] stringArray = {"hello", "bye"};
		Browser tabOne= new GoogleChrome();
		Browser tabTwo= new Firefox();
		Browser tabThree= new Firefox();
		Browser tabFour= new GoogleChrome(stringArray);
		Browser tabFive= new GoogleChrome();
		GoogleChrome tabSix = new GoogleChrome();
		
		for (int i = 0; i<Browser.allBrowsers.length; i++) {
			if(Browser.allBrowsers[i] instanceof GoogleChrome) {
				countChrome++;
//				Browser.allBrowsers[i].whoAmI();
			}
		}
		
		System.out.println(countChrome);
	}
}


class GoogleChrome extends Browser{
	
	private static final double versionNumber = 1.0;		//value cannot be changed once initialized 
	private static boolean isLocationAccessible,
		isCameraAccessible, isMicrophoneAccessible;
	
	
	public GoogleChrome() {
		 super();											//super keyword calls the parent class constructor
	 }
	
	public GoogleChrome(String[] sites) {
		super(sites);
	}
	
	@Override
	public void whoAmI() {												//method overriding
		System.out.println("I am Google Chrome.");
	}
	
	public void setPermissions(boolean allPermission) {
		isCameraAccessible = isLocationAccessible = 
		isMicrophoneAccessible = allPermission;
	}
	
	public void setPermissions(String field ,boolean permission) {		//method overloading
		switch(field) {
		case "camera": isCameraAccessible = permission;
						break;
		case "location": isLocationAccessible = permission;
						break;
		case "microphone": isMicrophoneAccessible = permission;
							break;
		}
	
	}
}



class Firefox extends Browser implements MultipleAccountContainers{
	
	public static ArrayList<String> containers = new ArrayList<String>();
	
	public Firefox() {
		super();
	}
	
	public Firefox(String[] sites) {
		super(sites);
	}
	
	@Override
	public void whoAmI() {
		System.out.println("I am Firefox.");
	}
	
	@Override
	public void addContainer(String container) {
		containers.add(container);
	}
	
	@Override
	public void leaveContainer(String container) {
		for(String i : containers) {
			if(i.equals(container)) {
				containers.remove(i);
			}
		}
	}
}