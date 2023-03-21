package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap
		Map<String,String> map = new HashMap<>();	//Key-Value 
		map.put("myName","Aneesh");
		map.put("actor","John");
		map.put("ceo","Mariso");					
		map.put("actor", "me");						//Key must be unique  and 
													//the latest duplicate value of key will be stored
		
		System.out.println("\nHashMap\n"+ map);		//does not maintain insertion order cos of hashing 

		
		//A Map can't be traversed, so you need to convert it into 
		//Set using keySet() or entrySet() method.
		
//		Set<String> keys = map.keySet();			
//		System.out.println(keys);
		
//		for(String key : keys)
//		{
//			System.out.println(key + " " + map.get(key));
//		}
//		System.out.println(map.entrySet());
		
		Set set=map.entrySet();				//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  


		
		
		//TreeMap
		Map<String,String> treeMap = new TreeMap<>();
		treeMap.put("myName","Aneesh");
		treeMap.put("actor","John");
		treeMap.put("ceo","Mariso");					
		
		System.out.println("\nTreeMap\n"+ treeMap);		//Ascending/Alphabetical order
		
		
		//LinkedHashMap
		Map<String,String> linkedMap = new LinkedHashMap<>();
		linkedMap.put("myName","Aneesh");
		linkedMap.put("actor","John");
		linkedMap.put("ceo","Mariso");					
		
		System.out.println("\nLinkedHashMap\n"+ linkedMap);		//maintains insertion order
	}
}
