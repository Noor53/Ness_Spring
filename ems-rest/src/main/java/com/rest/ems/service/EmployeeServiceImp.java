package com.rest.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.ems.entity.Employee;
import com.rest.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	
	@Autowired
	EmployeeRepository repo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public String deleteById(long id) {
		
			repo.deleteById(id);
			
			return "Record Deleted Successfully!";
		
	}

}
