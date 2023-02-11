package Practice.Inheritance;

public class test {
	public static void main(String[] args) {
		Interactable in = new Interactable("Prince");
		//in.name = "Prince";
		in.hp = 100;
		Interactable k = new Key("Prince2");
		//k.name = "Prince2";
		Interactable C = new Coin();
		//k.Work();
		Interactable[] arr = new Interactable[3];
		arr[0] = in;
		arr[1] = k;
		arr[2] = C;
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i].Work();
		}
	}
}