package com.orgnisation.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orgnisation.service.model.CustomException;
import com.orgnisation.service.model.Employee;
import com.orgnisation.service.repository.EmployeeRepository;

/**
 * @author Rafeeq Ali Shaik
 *
 */
/**
 * The Class EmployeeController.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    /** The employee repository. */
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Gets the all employees.
     *
     * @return the all employees
     * @throws CustomException
     */
    @RequestMapping("/allEmployees")
    public ResponseEntity<?> getAllEmployees() throws CustomException {
	List<Employee> employees = employeeRepository.findAll();
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(employees, HttpStatus.OK);
	} else {
	    throw new CustomException(HttpStatus.BAD_REQUEST, "employees not found for request",
		    "/employees/allEmployees");
	}
    }

    /**
     * Adds the employee.
     *
     * @param employee
     *            the employee
     * @throws CustomException
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addEmployee")
    public void addEmployee(@RequestBody Employee employee) throws CustomException {
	if (employee != null)
	    employeeRepository.save(employee);
    }

    /**
     * Gets the employee by designation.
     *
     * @param designation
     *            the designation
     * @return the employee by designation
     * @throws CustomException
     */
    @RequestMapping("/getEmployeeByDesignation/{designation}")
    public ResponseEntity<?> getEmployeeByDesignation(@PathVariable String designation) throws CustomException {
	List<Employee> employees = employeeRepository.getEmployeeByDesignation(designation);
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(employees, HttpStatus.OK);
	} else {
	    throw new CustomException(HttpStatus.NOT_FOUND, "Employee not found for designation " + designation,
		    "/employees/getEmployeeByDesignation");
	}
    }

    /**
     * Gets the employee by domain.
     *
     * @param domain
     *            the domain
     * @return the employee by domain
     * @throws CustomException
     */
    @RequestMapping("/getEmployeeByDomain/{domain}")
    public ResponseEntity<?> getEmployeeByDomain(@PathVariable String domain) throws CustomException {
	List<Employee> employees = employeeRepository.getEmployeeByDomain(domain);
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(employees, HttpStatus.OK);
	} else {
	    throw new CustomException(HttpStatus.NOT_FOUND, "Employee not found for domain " + domain,
		    "/employees/getEmployeeByDomain");
	}
    }

    /**
     * Delete employee by employee name.
     *
     * @param employeeName
     *            the employee name
     * @throws CustomException
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteEmployee/{employeeName}")
    public void deleteEmployeeByEmployeeName(@PathVariable String employeeName) throws CustomException {
	if (employeeName != null)
	    employeeRepository.deleteEmployeeByEmployeeName(employeeName);
    }

    /**
     * Update employee.
     *
     * @param employee
     *            the employee
     */
    @RequestMapping(method = RequestMethod.PUT, value="/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee) {
	if (employee != null)
	    employeeRepository.save(employee);
    }
}