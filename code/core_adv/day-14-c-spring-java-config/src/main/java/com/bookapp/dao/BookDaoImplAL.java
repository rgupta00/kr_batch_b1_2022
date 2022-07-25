package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Primary
@Repository(value = "dao2")
public class BookDaoImplAL implements BookDao {
	@Override
	public List<String> getAll() {
		System.out.println("using arrrayList");
		return Arrays.asList("adv java", "head first core java", "monk who sold the farri");
	}
}
