package Practice.Interface;

public interface Interactable {				//interface can only have declarations
	public final String name = "A";			//fields in interface must be final 
	public void Use();		
	public void Show();
	
}
 class Coin implements Interactable{		//class implementing an interface must contain all the methods declared in the interface

	@Override
	public void Use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
	}
	 
 }
