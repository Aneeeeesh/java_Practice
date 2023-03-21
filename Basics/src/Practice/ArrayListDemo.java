package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		var array = new ArrayList<Integer>();
		array.add(10);
		array.add(50);
		array.add(4);
		
		System.out.println(array);
		
		var arrayCopy = new ArrayList<Integer>();
		arrayCopy.addAll(array);
		Collections.sort(arrayCopy);
		System.out.println(arrayCopy);
		
		System.out.println(array);
	}

}
