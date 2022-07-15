package com.day1.session2.ex3;

import java.util.*;
import java.util.function.Predicate;

public class AppleApp {

	// OCP
	public static List<Apple> getAllApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate) {
		List<Apple> apples2 = new ArrayList<Apple>();
		for (Apple apple : apples) {
			if (predicate.test(apple))
				apples2.add(apple);
		}
		return apples2;
	}

	// he want only heavy apples
//	public static  List<Apple>getAllHeavyApples(List<Apple> apples){
//		List<Apple> apples2=new ArrayList<Apple>();
//		for(Apple apple: apples) {
//			if(apple.getWeight()>=300)
//				apples2.add(apple);
//		}
//		return apples2;
//	}
	// he want only red apples
//	public static  List<Apple>getAllRedApples(List<Apple> apples){
//		List<Apple> apples2=new ArrayList<Apple>();
//		for(Apple apple: apples) {
//			if(apple.getColor().equalsIgnoreCase("red"))
//				apples2.add(apple);
//		}
//		return apples2;
//	}
}
