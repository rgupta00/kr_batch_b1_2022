package com.bookapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {
	// :)
	private static Logger logger=LogManager.getLogger(Hello.class);

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
