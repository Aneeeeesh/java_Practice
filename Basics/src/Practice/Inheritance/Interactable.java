package Practice.Inheritance;

public class Interactable {
	public String name;
	public int hp;
	public final int num = 0;
	public Interactable(String name) {		
		this.name = name;					//using this keyword to avoid ambiguity
	}
	public Interactable() {					//Constructor overloading
		this("kk");							//calling another constructor of same class
	}
	
	
	public void Work() {
		System.out.println("superclass");
	}
	
	public Interactable Get() {
		return this;
	}
}


class Key extends Interactable{
	
	public String name;
	
	public Key(String name){
		super(name);					//calling parent class constructor using super
	}
	
	public void Use() {
		super.name = "k";				//accessing parent class field using super (cannot use parent class name)
	}
	
	public void Use(String n) {			//Overloading method Use() - static binding
		super.name = n;
	}
	
	
	@Override							//Override the Work() method of parent class - dynamic binding
	public void Work() {				//Overriding - for an object of KEY class this Work() method is called instead of Work() method of superclass
		System.out.println("Key");
		super.Work();				
	}
	
}

class Coin extends Interactable{
	
	@Override
	public void Work() {
		System.out.println("Coin");
	}
	public Coin Get() {					//Covariant return type - dynamic binding
		return this;
	}
	
}