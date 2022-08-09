package com.empapp.api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = EmployeeApi.class)
class EmployeeApiTest {

	// i want a way to call my rest endpoint
	@Autowired
	private MockMvc mockMvc; // it allow u to call rest end point

	@MockBean
	private EmployeeService employeeService;

	@MockBean
	private EmployeeDao employeeDao;

	// object mapper : rest : json ... Java <----> json
	@Autowired
	private ObjectMapper objectMapper;

	// i want to mock service layer

	// and dao layer

	@BeforeEach
	void setUp() throws Exception {
	}

	  @Test
	    public void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception{

	        // given - precondition or setup

		    Employee employee = new Employee(3, "raj",5000);
		    
	        BDDMockito.given(employeeService.addEmployee(employee)).willReturn(employee);

	        // when - action or behaviour that we are going test
	        ResultActions response = mockMvc.perform(post("/employees")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(objectMapper.writeValueAsString(employee)));

	        // then - verify the result or output using assert statements
	        response.andDo(print()).
	                andExpect(status().isCreated())
	                .andExpect(jsonPath("$.name",
	                        is(employee.getName())))
	                .andExpect(jsonPath("$.salary",
	                        is(employee.getSalary())));

	    }

	@Test
	void givenListOfEmployees_whenAddedAllEmployee_thenReturnListOfEmployees() throws Exception {
		Employee employee1 = new Employee("amit", 6000);
		Employee employee2 = new Employee("amit", 6000);

		List<Employee> employees = new ArrayList<Employee>();
		// when(employeeDao.findAll()).thenReturn(employees);
		// given and willReturn
		BDDMockito.given(employeeService.getAll()).willReturn(employees);

		ResultActions response = mockMvc.perform(get("/employees"));

		response
		.andExpect(status().isOk()).andDo(print())
		.andExpect(jsonPath("$.size()", is(employees.size())));

	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
