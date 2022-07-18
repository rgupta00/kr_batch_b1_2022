package com.day1.session2.ex3;

import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400), 
						new Apple("green", 300),
						new Apple("green", 200),
				new Apple("red", 250));

		//lambda vs method red :: 
		
		
		Predicate<Apple>heavyApplesPredicate=apple-> apple.getWeight()>=300;
		Predicate<Apple> predicate3=AppleLogic::isHeavyApple;
		
		Predicate<Apple>heavyApplesPredicateUsingMethodRef=Apple::isHeavy;
		Predicate<Apple>p3=Apple::isGreen;
		
		
//		
//		List<Apple>heavyApples= AppleApp.getAllApplesOnPredicate(apples,heavyApplesPredicate );
//		for (Apple temp : heavyApples) {
//			System.out.println(temp);
//		}
//
//		Predicate<Apple> redApplesPredicate = apple -> apple.getColor().equals("red");
//
//		List<Apple> redApples = AppleApp.getAllApplesOnPredicate(apples,
//				redApplesPredicate);
//		
//		for (Apple temp : redApples) {
//			System.out.println(temp);
//		}
//
//		
//		//heavy and red
//		Predicate<Apple>p3=redApplesPredicate.and(heavyApplesPredicate);
//		
//		List<Apple> redAndHeavyApples = AppleApp.getAllApplesOnPredicate(apples,
//				p3);
//		
//		for (Apple temp : redAndHeavyApples) {
//			System.out.println(temp);
//		}
//		
		
//		System.out.println("Heavy one");
//		List<Apple> heavyApples= AppleApp.getAllHeavyApples(apples);
//		for(Apple temp: heavyApples) {
//			System.out.println(temp);
//		}
//		System.out.println("Red one");
//		
//		List<Apple> redApples= AppleApp.getAllRedApples(apples);
//		for(Apple temp: redApples) {
//			System.out.println(temp);
//		}

		// Most imp functional interface in java 8

		// Predicate

		// Function

		// Consumer

		// biConsumer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Supplier

		// BiFunction

	}
}
