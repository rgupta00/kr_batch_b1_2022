package com.empapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//i want to check is my dao connection is working ok or not
@SpringBootApplication
public class EmpappRepoApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(EmpappRepoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappRepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("----------added--------");
		
	}

}
