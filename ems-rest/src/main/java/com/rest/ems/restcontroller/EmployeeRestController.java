package com.rest.ems.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.ems.entity.Employee;
import com.rest.ems.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {

		return service.addEmployee(employee);
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {

		return service.updateEmployee(employee);

	}

	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();

	}

	@GetMapping("/get/{id}")  // get/101
	public Employee getById(@PathVariable long id) {

		return service.getById(id);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable long id) {

		return service.deleteById(id);
	}

}
