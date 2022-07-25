package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImplJdbc implements BookDao {

	@Override
	public List<String> getAll() {
		System.out.println("using jdbc");
		return Arrays.asList("adv java", "head first core java", "monk who sold the farri");
	}
}
