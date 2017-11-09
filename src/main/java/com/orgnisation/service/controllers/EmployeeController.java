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

import com.orgnisation.service.model.Employee;
import com.orgnisation.service.model.Response;
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
     */
    @RequestMapping("/allEmployees")
    public ResponseEntity<?> getAllEmployees() {
	List<Employee> employees = employeeRepository.findAll();
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(new Response(employees, "all employees"), HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(new Response("no employees for the request"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    /**
     * Adds the employee.
     *
     * @param employee
     *            the employee
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {
	if (employee != null)
	    employeeRepository.save(employee);
    }

    /**
     * Gets the employee by designation.
     *
     * @param designation
     *            the designation
     * @return the employee by designation
     */
    @RequestMapping("/getEmployeeByDesignation/{designation}")
    public ResponseEntity<?> getEmployeeByDesignation(@PathVariable String designation) {
	List<Employee> employees = employeeRepository.getEmployeeByDesignation(designation);
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(new Response(employees, "list of employees with designation : " + designation),
		    HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(new Response("no employees with designation : " + designation),
		    HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    /**
     * Gets the employee by domain.
     *
     * @param domain
     *            the domain
     * @return the employee by domain
     */
    @RequestMapping("/getEmployeeByDomain/{domain}")
    public ResponseEntity<?> getEmployeeByDomain(@PathVariable String domain) {
	List<Employee> employees = employeeRepository.getEmployeeByDomain(domain);
	if (!employees.isEmpty()) {
	    return new ResponseEntity<>(new Response(employees, "list of employees with domain : " + domain),
		    HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(new Response("no employees with domain : " + domain),
		    HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    /**
     * Delete employee by employee name.
     *
     * @param employeeName
     *            the employee name
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteEmployee/{employeeName}")
    public void deleteEmployeeByEmployeeName(@PathVariable String employeeName) {
	if (employeeName != null)
	    employeeRepository.deleteEmployeeByEmployeeName(employeeName);
    }

    /**
     * Update employee.
     *
     * @param employee
     *            the employee
     */
    @RequestMapping(method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee) {
	if (employee != null)
	    employeeRepository.save(employee);
    }
}
