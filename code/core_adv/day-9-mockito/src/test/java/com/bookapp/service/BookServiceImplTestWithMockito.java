package com.bookapp.service;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;

@ExtendWith(MockitoExtension.class)
class BookServiceImplTestWithMockito {

	@InjectMocks
	private BookServiceImpl bookService;
	
	@Spy
	//@Mock
	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
		List<String> allBooks=Arrays.asList("java","adv java","rich dad poor dad");
		
		//given when then
		when(bookDao.getAll()).thenReturn(allBooks);
		
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
