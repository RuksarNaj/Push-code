package com.tecnics.emp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tecnics.emp.model.Employee;

@RestController
public class EmployeeController {

	private Map<String, Employee> emp = new HashMap<>() {{
		
		put("1", new Employee(101, "Ruksar"));
		put("2", new Employee(102, "Nazma"));
	}};	

	
//	private List<Employee> emp = List.of(new Employee(101, "Ruksar"));

	@GetMapping("/get")
	public String employee() {
		return "Ruksar";
	}

	@GetMapping("/emp")
	public Collection<Employee> employeeDetails() {
		return emp.values();

	}
	
	@GetMapping("/emp/{id}")
	public Employee employeeData(@PathVariable String id) {
		Employee employee = emp.get(id);
		if(employee == null)throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return employee;
	}
	
	@GetMapping("/emp/{id}")
	public void delete(@PathVariable String id) {
		Employee employee = emp.remove(id);
		if(employee == null)throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}
