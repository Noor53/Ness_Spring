package com.rest.ems.service;

import java.util.List;

import com.rest.ems.entity.Employee;

public interface IEmployeeService {
	
	
			public   Employee   addEmployee(Employee employee);
			
			public   Employee   updateEmployee(Employee employee);
			
			
			public  List<Employee>  getAllEmployees();
			
			
			public Employee   getById(long id);
			
			public  String     deleteById(long id);
			
			
	

}
