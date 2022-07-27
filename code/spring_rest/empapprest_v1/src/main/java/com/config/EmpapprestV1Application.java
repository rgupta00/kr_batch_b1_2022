package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication= @SpringBootConfiguration+ @EnableAutoConfiguration+ @ComponentScan
//"infra" + business bean
@ComponentScan(basePackages = {"com.empapp"})
public class EmpapprestV1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(EmpapprestV1Application.class, args);
		
//		String []beans=ctx.getBeanDefinitionNames();
//		for(String bean: beans) {
//			System.out.println(bean);
//		}
	}

}
