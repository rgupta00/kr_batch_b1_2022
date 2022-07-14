package com.b.collections.set;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class E_Freq {
	
	public static void main(String[] args) {
		List<String> set=new LinkedList<String>();
		
		set.add("aa");
		set.add("b");
		set.add("aaa");
		set.add("aaaa");
		
		int frequency = Collections.frequency(set, "b");
		System.out.println(frequency);
	}

}
