package com.d.collections.imp_points;

import java.util.*;

//key must be immutable, if it is mutable : bugs, better to use String, Wrapper class for that 
final class Key {
	int k;
	public Key(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Key [k=" + k + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}
	
	
}

public class A_HashSet {

	public static void main(String[] args) {
		Map<Key, String> map=new HashMap<>();
		
		map.put(new Key(33),"raja");
		
		System.out.println(map.get(new Key(33)));//T or F?
		
		
		
//		System.out.println(new Key(33).hashCode());
//		System.out.println(new Key(33).hashCode());
//		HashSet<Key> set=new HashSet<Key>();
//		set.add(new Key(33));
//		
//		System.out.println(set.contains(new Key(33)));//T or F?
	}
}



