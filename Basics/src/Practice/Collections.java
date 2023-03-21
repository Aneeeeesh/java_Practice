package Practice;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		//ArrayList
		List<String> arrayList = new ArrayList<String>();
		 arrayList.add("a");
		 arrayList.add("b");
		 arrayList.add("c");
		 arrayList.remove("e");						//this throws no error
		 arrayList.set(1, "e");
		 //		 String[] arr = list.toArray(new String[10]);
		 
//		 for(int i=0; i<arr.length ; i++) {
//			 if(arr[i]!=null) {
//				 System.out.println(arr[i]);
//			 }
//		 }
		 System.out.println(arrayList.size());
		 System.out.println("ArrayList\n" + arrayList);
		 Iterator<String> it = arrayList.iterator();				//Iterator can be used to iterate through any collection
		 while(it.hasNext()) {									
			 System.out.println(it.next());
		 }
		 
		 //LinkedList
		 List<String> linkedList = new LinkedList<String>();
		 linkedList.add("c");
		 linkedList.add("d");
		 System.out.println("\nLinkedList\n" + linkedList);
		 //Stack
		 Stack<String> stack = new Stack<String>();
		 stack.push("e");
		 stack.push("f");
		 stack.pop();											//last in, first out
		 System.out.println("\nStack\n" + stack);
		 
		 //PriorityQueue
		 PriorityQueue<Integer> q  = new PriorityQueue<>();
		 q.add(10);
		 q.add(2);
		 q.add(1);
		 q.add(5);
		 q.add(2);
		 q.poll();
		 q.poll();
		 System.out.println("\nPriorityQueue\n"+ q);
		 
		 PriorityQueue<String> Q  = new PriorityQueue<>();
		 Q.add("a");
		 Q.add("c");
		 Q.add("b");
		 Q.add("f");
		 Q.add("A");
		 Q.poll();
		 Q.poll();
		 System.out.println("\nPriorityQueue\n"+ Q);
		 
		 //HashSet
		 Set<Integer> hashSet = new HashSet<Integer>();			//does not store in sequence due to hashing
		 hashSet.add(87);
		 hashSet.add(97);
		 hashSet.add(34);
		 hashSet.add(92);
		 hashSet.add(97);										//duplicates are not stored
		 System.out.println("\nHashSet\n" + hashSet);
//		 for(Integer i : hashSet)
//			 System.out.println(i);
		 
		 //TreeSet
		 Set<Integer> treeSet = new TreeSet<>();				//stores in ascending order
		 treeSet.add(87);
		 treeSet.add(97);
		 treeSet.add(34);
		 treeSet.add(92);
		 treeSet.add(97);
		 System.out.println("\nTreeSet\n" + treeSet);
	}

}
