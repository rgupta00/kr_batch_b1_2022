package com.bookapp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello2 {
	private static Logger logger=LoggerFactory.getLogger(Hello2.class);//Singleton dp
	
	public static void main(String[] args) {
		
		System.out.println("code is workig till line 7");
		
		logger.info("hello world logging is done");
		try {
		String data="22A";
		
		Integer no=Integer.parseInt(data);
		}catch(NumberFormatException e) {
			logger.error("some ex "+e);
		}
		
	}
}
