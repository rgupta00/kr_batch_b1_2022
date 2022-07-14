package com.b.collections.set;
import java.util.*;

public class D_SortedSet {

	public static void main(String[] args) {
	
		//some imp methods SortedSet: first(), last(), headSet(), tailSet(), subset()
		//some imp methods negivatableset: lower() floor() pollFirst() polllast() heighest(101) celing(101)
		TreeSet<Integer> set=new TreeSet<>();
	
		set.add(100);
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);
		System.out.println(set);
		
		//negivatableset
		//System.out.println(set.lower(107)); //before 104
		//System.out.println(set.floor(102));	//at 102 or before
		//System.out.println(set.pollLast());
		
		//System.out.println(set.ceiling(102));
		
		//SortedSet
//		System.out.println(set.first());
//		System.out.println(set.last());
//		//SortedSet<Integer> set2=set.headSet(106);
//		System.out.println(set.headSet(106));
//		System.out.println(set.tailSet(106));
		
		//Comparator<? super Integer> comparator = set.comparator();	*
		
		
	}
}
