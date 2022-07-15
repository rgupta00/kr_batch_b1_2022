package com.day1.session1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambdaExpession2 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book(121, "java", "raj", 240),
				new Book(11, "python", "ekta", 840),
				new Book(621, "c programming", "gunika", 300)
			);
		// I want name of all books whose cost is more then 250

		
		
		
		//WTH
//		List<Book> booksSelected = new ArrayList<Book>();
//
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
	}
}
