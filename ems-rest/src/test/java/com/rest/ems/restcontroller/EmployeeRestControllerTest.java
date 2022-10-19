package com.rest.ems.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rest.ems.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@Test
	void testAddEmployee() {
		
		// http post()
		
		Employee emp = new Employee();
		emp.setEname("Lokus");
		emp.setSalary(85000);
		
		
	Employee response =	restTemplate.postForObject("http://localhost:8181/api/employees/add", emp,Employee.class);
		
		assertNotNull(response);
	
	
	}

	@Test
	void testGetById() {
		
		
		// http get()
		long id = 3;
		
	ResponseEntity<Employee> response =	restTemplate.getForEntity("http://localhost:8181/api/employees/get/"+id, Employee.class);
		
		
		Employee  emp =	response.getBody();
		
		assertEquals("Sandeep", emp.getEname());
	
	}

}
