package Practice.Inheritance.Abstraction;

//import Practice.Inheritance.*;

public abstract class Interactable {			//abstract class will have no instances and provides only a blueprint
	public String name;							//abstract class can have method declaration or body of method
	public Interactable(){
	}
	public abstract void Use();					//abstract methods dont have a body only declaration
	public void Show() {						//methods that are not given abstract keyword must have a body
		
	}
}

class Coin extends Interactable{				//class inheriting abstract class must contain all the abstract methods declared in the parent class
	public Coin() {
//		Practice.Inheritance.Interactable i = new Practice.Inheritance.Interactable(); 
	}

	@Override
	public void Use() {
		// TODO Auto-generated method stub
		
	}
}