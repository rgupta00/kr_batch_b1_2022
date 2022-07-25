package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;

//Amit
//@Component
@Service(value = "bookService")
public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	@Override
	public List<String> getAllJavaBook() {
		return bookDao.getAll().stream().filter(b -> b.contains("java")).collect(Collectors.toList());
	}

}

//3 kind of injection: 1. field 2. setter 3. ctr
//if dep is optinal then u go for setter injection
//if dep is mandatory then u go for ctr injection
