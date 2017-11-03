package com.orgnisation.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orgnisation.service.model.Employee;
import com.orgnisation.service.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}

	@RequestMapping("/employees/getEmployeeByDesignation/{designation}")
	public List<Employee> getEmployeeByDesignation(@PathVariable String designation) {
		return employeeRepository.getEmployeeByDesignation(designation);
	}

	@RequestMapping("/employees/getEmployeeByDomain/{domain}")
	public List<Employee> getEmployeeByDomain(@PathVariable String domain) {
		return employeeRepository.getEmployeeByDomain(domain);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/deleteEmployeeByEmployeeName/{employeeName}")
	public void deleteEmployeeByEmployeeName(@PathVariable String employeeName) {
		employeeRepository.deleteEmployeeByEmployeeName(employeeName);
	}
}
