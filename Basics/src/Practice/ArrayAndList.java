package Practice;

import java.util.ArrayList;

public class ArrayAndList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		 list.add("a");
		 list.add("b");
		 String[] arr = list.toArray(new String[10]);
		 System.out.println(list);
		 
		 for(int i=0; i<arr.length ; i++) {
			 if(arr[i]!=null) {
				 System.err.println(arr[i]);
			 }
		 }

	}

}
