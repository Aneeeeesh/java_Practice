package Practice;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] args){
		try {
			DoSomething.method1();
			DoSomething.method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}


class DoSomething{
	
	static void method1() {									//IOException is a checked exception
		try{
			throw new IOException();						//So throws keyword is used
		}catch(Exception e) {
			System.out.println("continue");
		}
	}
	
	static void method2() {
		throw new ArithmeticException();				//Arithmetic exception is unchecked exception
	}
}