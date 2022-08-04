package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HowToReadPropFile {

	public static void main(String[] args) throws IOException {
		
//		System.out.println(System.getProperty("user.dir"));
		Properties properties=new Properties();
		String BASE_URL=System.getProperty("user.dir");
		
		String FILE_URL= BASE_URL+ "/src/test/resources/config/driver_info.properties";
		
		InputStream is=new FileInputStream(FILE_URL);
		
		properties.load(is);
		
		System.out.println(properties.getProperty("driver"));
	}
	
}
