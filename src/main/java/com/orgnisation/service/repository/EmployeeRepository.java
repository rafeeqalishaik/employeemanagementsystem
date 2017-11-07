package com.orgnisation.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orgnisation.service.model.Employee;

/**
 * The Interface EmployeeRepository.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	/**
	 * Gets the employee by designation.
	 *
	 * @param designation the designation
	 * @return the employee by designation
	 */
	List<Employee> getEmployeeByDesignation(String designation);

	/**
	 * Gets the employee by domain.
	 *
	 * @param domain the domain
	 * @return the employee by domain
	 */
	List<Employee> getEmployeeByDomain(String domain);

	/**
	 * Delete employee by employee name.
	 *
	 * @param employeeName the employee name
	 */
	void deleteEmployeeByEmployeeName(String employeeName);

}