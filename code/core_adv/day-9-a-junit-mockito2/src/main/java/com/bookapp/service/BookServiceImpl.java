package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {

	private  Logger logger=LoggerFactory.getLogger(BookServiceImpl.class);
	private BookDao dao;

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}

	@Override
	public List<String> getBooks(String subject) {
		long start=System.nanoTime();
		List<String>books= dao.getBooks().stream().filter(b -> b.contains(subject)).collect(Collectors.toList());

		long end=System.nanoTime();
		
		logger.info("method take "+(end-start)+" to execute");
		
		return books;
	}

}







