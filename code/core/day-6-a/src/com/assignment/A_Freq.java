package com.assignment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
public class A_Freq {
	
	public static void main(String[] args) {
		//   word   freq
		Map<String, Integer>map=new TreeMap<String, Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ali.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String []tokens=line.split(" ");
				for(String token: tokens) {
					
					if(map.containsKey(token)) {
						Integer freq=map.get(token);
						map.put(token, ++freq);
					}else {
						map.put(token, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		//just print the map
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" : " + entry.getValue());
		}
	}

}







