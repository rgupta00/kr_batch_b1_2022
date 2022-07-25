package com.bookapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * <context:annotation-config/> <!-- hey spring i will go for annotation -->
	<context:component-scan base-package="com.bookapp"/> <!-- look up inside these packages and go nested too -->
	
 */
@Configuration //<context:annotation-config/>
@ComponentScan(basePackages = {"com.bookapp"})//<context:component-scan base-package="com.bookapp"/>
public class AppConfig {

}
