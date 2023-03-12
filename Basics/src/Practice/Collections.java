package Practice;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		 arrayList.add("a");
		 arrayList.add("b");
//		 String[] arr = list.toArray(new String[10]);
		 
//		 for(int i=0; i<arr.length ; i++) {
//			 if(arr[i]!=null) {
//				 System.out.println(arr[i]);
//			 }
//		 }
		 System.out.println("ArrayList\n" + arrayList);
		 Iterator<String> it = arrayList.iterator();				//Iterator can be used to iterate through any collection
		 while(it.hasNext()) {									
			 System.out.println(it.next());
		 }
		 
		 //LinkedList
		 LinkedList<String> linkedList = new LinkedList<String>();
		 linkedList.add("c");
		 linkedList.add("d");
		 System.out.println("\nLinkedList\n" + linkedList);
		 
		 //Stack
		 Stack<String> stack = new Stack<String>();
		 stack.push("e");
		 stack.push("f");
		 stack.pop();												//last in, first out
		 System.out.println("\nStack\n" + stack);
	}

}
