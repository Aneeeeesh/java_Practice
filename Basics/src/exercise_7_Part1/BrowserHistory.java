package exercise_7_Part1;

import java.util.*;

public class BrowserHistory {
	
		static List<String> arrayListHistory = new ArrayList<>();
		static List<String> linkedListHistory = new LinkedList<>();
		static List<String> vectorHistory = new Vector<>();
		static List<String> stackHistory = new Stack<>();
		
		static Set<String> hashSetHistory = new HashSet<>();
		static Set<String> treeSetHistory = new TreeSet<>();
		static Set<String> linkedHashSetHistory = new LinkedHashSet<>();
		
	
		void visit(String url) {
			arrayListHistory.add(url);
			linkedListHistory.add(url);
			vectorHistory.add(url);
			stackHistory.add(url);
			
			hashSetHistory.add(url);
			treeSetHistory.add(url);
			linkedHashSetHistory.add(url);
		}
		
		
		void sort() {
			List<String> sortCopy = new ArrayList<String>();
			sortCopy.addAll(arrayListHistory);
			Collections.sort(sortCopy);
			System.out.println(sortCopy);
		}
		
		void deleteHistory(int index) {
			try {
				
				String url = arrayListHistory.get(index);
				arrayListHistory.remove(index);
				linkedListHistory.remove(index);
				vectorHistory.remove(index);
				stackHistory.remove(index);
				
				hashSetHistory.remove(url);
				treeSetHistory.remove(url);
				linkedHashSetHistory.remove(url);
				
			}catch(Exception e) {
				System.out.println("Url not found.");
			}
			
		}
		
		void deleteHistory(String url) {
			if (!arrayListHistory.contains(url)) {
				System.out.println("Url not found.");
				return;
			}
			arrayListHistory.remove(url);
			linkedListHistory.remove(url);
			vectorHistory.remove(url);
			stackHistory.remove(url);
			
			hashSetHistory.remove(url);
			treeSetHistory.remove(url);
			linkedHashSetHistory.remove(url);
			
		}
		
		void fetchHistory() {
			System.out.println(arrayListHistory);
//			System.out.println(linkedListHistory);
//			System.out.println(stackHistory);
//			System.out.println(vectorHistory);
//			
//			System.out.println(hashSetHistory);
//			System.out.println(linkedHashSetHistory);
//			System.out.println(treeSetHistory);
		}
		
		void search(String extension) {
			for(String url : arrayListHistory) {
				if(url.endsWith(extension)) {
					System.out.println(url);
				}
			}
		}
		
		void size() {
			System.out.println(arrayListHistory.size());
		}
		
		void updateHistory(int index, String newUrl) {
			
			if(index >= arrayListHistory.size()) {
				System.out.println("Invalid index.");
				return;
			}
			
			arrayListHistory.set(index, newUrl);
			linkedListHistory.set(index, newUrl);
			stackHistory.set(index, newUrl);
			vectorHistory.set(index, newUrl);
			
			String[] urlArray = linkedHashSetHistory.toArray(new String[linkedHashSetHistory.size()]);
			urlArray[index] = newUrl;
			linkedHashSetHistory.clear();
			Collections.addAll(linkedHashSetHistory, urlArray);
			
			hashSetHistory = treeSetHistory = linkedHashSetHistory;
		}
}