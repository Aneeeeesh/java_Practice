package Practice.Inheritance;

public class Interactable {
	public String name;
	public int hp;
	public Interactable(String name) {
		this.name = name;
	}
	public Interactable() {
		this("kk");
	}
	
	
	public void Work() {
		System.out.println("superclass");
	}
}


class Key extends Interactable{
	
	public String name;
	
	public Key(String name){
		super(name);
	}
	
	public void Use() {
		super.name = "k";
	}
	
	public void Use(String n) {
		super.name = n;
	}
	
	
	@Override
	public void Work() {
		System.out.println("Key");
		super.Work();
	}
	
}

class Coin extends Interactable{
	@Override
	public void Work() {
		System.out.println("Coin");
	}
}