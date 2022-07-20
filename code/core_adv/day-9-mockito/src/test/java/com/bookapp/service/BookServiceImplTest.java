package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

class BookServiceImplTest {

	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		bookService=new BookServiceImpl();
		BookDao bookDao=new BookDaoImpl();
		bookService.setBookDao(bookDao);
		
	}

	@Test
	void getAllJavaBookTest() {
		Assertions.assertEquals(2, bookService.getAllJavaBook().size());
	}

	
	@AfterEach
	void tearDown() throws Exception {
		bookService=null;
	}


}
