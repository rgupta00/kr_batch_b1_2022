package com.day1.session1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DemoLambdaExpession2 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book(121, "java", "raj", 240),
				new Book(11, "python", "ekta", 840),
				new Book(621, "c programming", "gunika", 300)
			);
		// I want name of all books in sorted way whose cost is more then 250

//		List<String> names=  books.stream()
//		.filter(b-> b.getPrice()>=250)
//		.map(b-> b.getTitle())
//		.sorted()
//		.collect(Collectors.toList());
//		
//		
//		names.forEach(n-> System.out.println(n));
		
		// I want name of all books in sorted as per reverse -cost way whose cost is more then 250

//		List<String> names=  books.stream()
//				.filter(b-> b.getPrice()>=250)
//				.map(b-> b.getTitle())
//				.sorted()
//				.collect(Collectors.toList());
//				
//				
//				names.forEach(n-> System.out.println(n));
		
	// I want name of all books in sorted as per reverse -cost way whose cost is more then 250

//		List<String> names=  books.stream()
//				.filter(b-> b.getPrice()>=250)
//				.sorted(( b1,  b2)->  Double.compare(b1.getPrice(), b1.getPrice()))
//				.map(b-> b.getTitle())
//				
//				.collect(Collectors.toList());
//						
//						
//		names.forEach(n-> System.out.println(n));
		
		List<String> names=  books.stream()
				.filter(b-> b.getPrice()>=250)
				.sorted(Comparator.comparing(Book::getPrice).reversed())
				.map(b-> b.getTitle())
				
				.collect(Collectors.toList());
						
						
		names.forEach(n-> System.out.println(n));	
		
		
		
		
//		for(Book book: books) {
//			System.out.println(book);
//		}
		
//		books.stream().forEach( b-> System.out.println(b));//higher order funcation 
		
		//books.stream().parallel().forEach( System.out::println);
		
		//WTH
//		List<Book> booksSelected = new ArrayList<Book>();
//		for (Book book : booksSelected) {
//			if (book.getPrice() > 250)
//				booksSelected.add(book);
//		}
//		
//		List<String> booksSelectedNames=new ArrayList<String>();
//		for(Book b: booksSelected) {
//			booksSelectedNames.add(b.getTitle());
//		}
//		
//		for(String name: booksSelectedNames) {
//			System.out.println(name);
//		}
//		
		System.out.println("----------");
	}
}
