package com.orgnisation.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orgnisation.service.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	List<Employee> getEmployeeByDesignation(String designation);

	List<Employee> getEmployeeByDomain(String domain);

	void deleteEmployeeByEmployeeName(String employeeName);

}