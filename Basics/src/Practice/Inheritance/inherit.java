package Practice.Inheritance;

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B c = new C("Hello");
		System.out.println(c.i);
	}

}


class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	int i = 10;
	public B() {
		System.out.println("B");
	}
}

class C extends B {
	int i = 20;
	public C(String s) {
		System.out.println(s);
	}
}