package exercise_7_Part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BrowserHistory {
	
	static Map<String,List<String>> hashMap = new HashMap<>();
	static Map<String,List<String>> linkedHashMap = new LinkedHashMap<>();
	static Map<String,List<String>> treeMap = new TreeMap<>();
	
	void visit(String url) {
		
		StringTokenizer tokens = new StringTokenizer(url,".");
		String extension = tokens.nextToken();
		
		while(tokens.hasMoreTokens()) {
			extension = tokens.nextToken();
		}
		
		addToMap(extension, url , linkedHashMap);
		addToMap(extension, url , hashMap);
		addToMap(extension, url , treeMap);
	}
	
	private void addToMap(String extension, String url, Map<String, List<String>> map ) {
		if(!map.containsKey(extension))
			map.put(extension, new ArrayList<String>());
		map.get(extension).add(url);
//		System.out.println(map);
	}
	
	void fetchHistory(String queryExtension) {
		if(linkedHashMap.get(queryExtension) == null)
			System.out.println("No entry found with that extension.");
		else
			System.out.println(linkedHashMap.get(queryExtension));
	}
	
	void deleteHistory(String delExtension) {
		if(linkedHashMap.get(delExtension) == null)
			System.out.println("No entry found with that extension.");
		linkedHashMap.remove(delExtension);
		hashMap.remove(delExtension);
		treeMap.remove(delExtension);
		System.out.println(linkedHashMap);
	}
	
	void size(String extension) {
		if(linkedHashMap.get(extension) == null)
			System.out.println("No entry found with that extension.");
		else
			System.out.println(linkedHashMap.get(extension).size());
		
	}
	
	void search(String search) {
		boolean found = false;
		Set<String> keys = linkedHashMap.keySet();
		
		keyLoop:
		for(String key : keys) {
			Iterator<String> iterator = linkedHashMap.get(key).iterator();
			while(iterator.hasNext()) {
				if(iterator.next().contains(search)) {
					System.out.println("Found.");
					found = true;
					break keyLoop;
				}
				else {
					found = false;
				}
			}
		}
		if(!found) 
			System.out.println("Not Found.");
	}
}
