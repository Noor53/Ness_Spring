package com.rest.ems.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rest.ems.entity.Employee;
@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	IEmployeeService service;
	
	@Test
	void testAddEmployee() {
		
		Employee emp = new Employee();
		emp.setEname("Javeed");
		emp.setSalary(25000);
		
	Employee empObj =	service.addEmployee(emp);
		
		assertNotNull(empObj);
		assertEquals(25000, empObj.getSalary());
		
	}

	@Test
	void testGetAllEmployees() {
		
	List<Employee> list =		service.getAllEmployees();
	
			System.out.println(list);
	
		assertTrue(list.size() > 0);
		
	}

}
