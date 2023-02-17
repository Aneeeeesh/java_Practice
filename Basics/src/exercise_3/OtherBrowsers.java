package exercise_3;

import java.util.ArrayList;

public class OtherBrowsers {
	public static void main(String[] args) {
		int countChrome = 0;
		Browser tabOne= new GoogleChrome();
		Browser tabTwo= new Firefox();
		Browser tabThree= new Firefox();
		Browser tabFour= new GoogleChrome();
		Browser tabFive= new GoogleChrome();
		
		for (int i = 0; i<Browser.allBrowsers.length; i++) {
			if(Browser.allBrowsers[i] instanceof GoogleChrome) {
				countChrome++;
			}
		}
		System.out.println(countChrome);
	}
}


class GoogleChrome extends Browser{
	
	private static final double versionNumber = 1.0;
	private static boolean isLocationAccessible,
		isCameraAccessible, isMicrophoneAccessible;
	
	
	public GoogleChrome() {
		 super();
	 }
	public GoogleChrome(String[] sites) {
		super(sites);
	}
	
	@Override
	public void whoAmI() {
		System.out.println("I am Google Chrome.");
	}
	
	public void setPermissions(boolean allPermission) {
		isCameraAccessible = isLocationAccessible = 
		isMicrophoneAccessible = allPermission;
	}
	
	public void setPermissions(String field ,boolean permission) {
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
	public void addContainer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leaveContainer() {
		// TODO Auto-generated method stub
		
	}
}