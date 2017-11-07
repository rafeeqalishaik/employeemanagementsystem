package com.orgnisation.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Employee.
 *
 * @author Rafeeq Ali Shaik
 */
@Document
public class Employee {

	/** The id. */
	@Id
	private String id;
	
	/** The employee name. */
	private String employeeName;
	
	/** The designation. */
	private String designation;
	
	/** The department. */
	private String department;
	
	/** The domain. */
	private String domain;
	
	/** The email. */
	private String email;
	
	/** The mobile. */
	private String mobile;
	
	/** The address. */
	private String address;

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		super();
	}

	/**
	 * Instantiates a new employee.
	 *
	 * @param employeeName the employee name
	 * @param designation the designation
	 * @param department the department
	 * @param domain the domain
	 * @param email the email
	 * @param mobile the mobile
	 * @param address the address
	 */
	public Employee(String employeeName, String designation, String department, String domain, String email,
			String mobile, String address) {
		super();
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.domain = domain;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the employee name.
	 *
	 * @return the employee name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Sets the employee name.
	 *
	 * @param employeeName the new employee name
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * Gets the designation.
	 *
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Sets the designation.
	 *
	 * @param designation the new designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets the domain.
	 *
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Sets the domain.
	 *
	 * @param domain the new domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
