package com.d.collections.map;
import java.util.*;
import java.util.Map.Entry;
public class A_HelloMap {
	
	public static void main(String[] args) {
		//perfromace diff: bw Hashtable and hashmap ?
		//HM, LHM, TM
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("raj", 90);
		map.put("raj", 95);
		map.put(null, 100);
		map.put(null, 90);
		
		map.put("sumit", 78);
		map.put("ekta", 91);
		map.put("gunika", 99);
		
		System.out.println(map.get("raj"));	//O(1)
		//how to iterate it
		System.out.println(map);
		//entryset better then keyset
		//keyset
//		Set<String> keys= map.keySet();
//		for(String key: keys) {
//			System.out.println(key + " : " + map.get(key));
//		}
		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String key =it.next();
//			System.out.println(key +" : "+ map.get(key));
//		}
//		
		//entryset
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		//java 8 streams processing*
		//map.forEach(action);
		
	}

}







