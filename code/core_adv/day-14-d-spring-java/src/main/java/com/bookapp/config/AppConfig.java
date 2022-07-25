package com.bookapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.bookapp"})
public class AppConfig {

	
	@Autowired
	@Bean(name = "bookService")
	public BookService getBookServiceImpl(BookDao bookDao) {
		BookServiceImpl bookService=new BookServiceImpl();
		bookService.setBookDao(bookDao);
		
		return bookService;
	}
	
	//@Primary
	//test
	@Profile(value = "test")
	@Bean
	public BookDao getBookDaoImplAL() {
		BookDao bookDao=new BookDaoImplAL();
		return bookDao;
	}
	
	
	//dev
	@Profile(value = "dev")
	@Bean
	public BookDao getBookDaoImplJdbc() {
		BookDao bookDao=new BookDaoImplJdbc();
		return bookDao;
	}
}
