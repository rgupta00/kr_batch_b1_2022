package com.bookapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		//pull vs push
		//right now HLM is reps for pulling the dep of LLM :(
		//i have to create object myself :(
		
		//spring act as a inversion of control
//		 BookDao dao=new BookDaoImplAL();
//		BookService bookService=new BookServiceImpl(dao);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		
		BookService bookService=ctx.getBean("bookService", BookService.class);
		
		List<String> allJavaBook = bookService.getAllJavaBook();
		allJavaBook.forEach(b-> System.out.println(b));
		
		
		//System.out.println(bookService.hashCode());
		
//		BookService bookService2=ctx.getBean("bookService", BookService.class);
//		System.out.println(bookService2.hashCode());
		
//		

	}
}



