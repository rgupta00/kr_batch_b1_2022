package com.empapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RequestParam ?name=raj&add=delhi
// @Pathvariable /foo/raj
@RestController
public class HelloApi {
	
	//welcome2?name=raj&sal=56000
	@GetMapping(path = "welcome2")
	public String hello2(@RequestParam(name = "name")String name,
			@RequestParam(name = "sal", defaultValue = "9000", required = false)double sal) {
		return "hello using @RequestParam :"+ name+" "+ sal;
	}
	
	@GetMapping(path = "welcome/{uname}/{teamName}")
	public String hello(@PathVariable(name = "uname")String name, 
			@PathVariable(name = "teamName")String teamName) {
		return "hello champs :"+ name+" "+ teamName;
	}

}
