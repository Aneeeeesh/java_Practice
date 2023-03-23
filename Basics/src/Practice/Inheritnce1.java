package Practice;

//import java.util.ArrayList;

public class Inheritnce1 {

	public static void main(String[] args) {
		Parent child1 = new Child1();		//can only access Parent methods
		Child2 child2 = new Child2();		//can access Child2 methods and Parent methods
		
		
//		ArrayList<Parent> list = new ArrayList<>();
//		list.add(child2);
//		list.add(child1);
//		System.out.println(list);
	}

}

interface Parent{
	
	String hair = "black";
	String eyes = "brown";
	
	void snore();
	
	void goBald() ;
}

class Child1 implements Parent{
	
	Child1(){
		System.out.println("Hi iam Child1");
	}
	
	void OCD() {
		
	}
	
	void tall() {
		
	}

	@Override
	public void snore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goBald() {
		// TODO Auto-generated method stub
		
	}
}


class Child2 implements Parent{
	Child2(){
		System.out.println("Hi iam Child2");
	}
	
	void beSmart() {
		
	}
	
	void beIntrovert() {
		
	}

	@Override
	public void snore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goBald() {
		// TODO Auto-generated method stub
		
	}
}