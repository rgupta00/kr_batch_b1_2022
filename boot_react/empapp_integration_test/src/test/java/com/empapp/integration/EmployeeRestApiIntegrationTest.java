package com.empapp.integration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)// hey run on any avaliable port
@AutoConfigureMockMvc
public class EmployeeRestApiIntegrationTest {

	@Autowired
	public MockMvc mockMvc;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void givenEmployeeObject_whenCreateObject_thenReturnTheSavedEmployee() throws JsonProcessingException,
	Exception {
		//Employee employee = Employee.builder().name("raj").salary(5000).build();
		Employee employee =new Employee(3, "raj", 5000);
		ResultActions responseObj = mockMvc.perform(post("/employees")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(employee)));
		
//		responseObj.andDo(print())
//		.andExpect(jsonPath("$.name", employee.getName()))
		
		responseObj.andExpect(status()
				.isCreated())
				.andDo(print())
				.andExpect(jsonPath("$.name", is(employee.getName())));

		
		
	}
	
	
}








